#include "mapachar.h"
#include "cliente.h"

#include <iostream>
#include <string>
#include <cmath>

#include <QString>
#include <QMessageBox>
#include <QNetworkConfiguration>
#include <QNetworkConfigurationManager>
#include <QDebug>


using namespace std;

Cliente::Cliente(QObject * parent)
    :QThread(parent)
{

}

QString Cliente::desencriptar(QString mensaje, long long a, long long b){

    long long num=0;
    long long residuo=0;
    long long cosiente=0;

    std::string::size_type sz = 0;

    QString mensajeDes;
    for(size_t i = 0; i < mensaje.size(); i++){
        num = stoll(mensaje.toStdWString(), &sz, 0);
        QByteArray temp(mensaje.toStdString().substr(sz).data());
        QString str(temp.toStdString().data());
        mensaje = str;

        long long Dividendo = ((num - b ) / a);

        mensajeDes += chars[Dividendo];


    }
    return mensajeDes;
}

bool Cliente::nuevaConexion(const QString& host, const quint16 puerto) {
    if(isRunning()) {
        terminate();
    }
    if(cliente) {
        cliente->close();
        cliente->deleteLater();
        cliente = nullptr;
    }
    this->host = host;
    this->puerto = puerto;
    start();
    return true;
}

bool Cliente::conectado() const {
    if(!cliente) return false;
    return cliente->isOpen();
}

void Cliente::run() {
    cliente = new QTcpSocket(this);
    while (!quit) {
        const int timeout = 50000;
        cliente->connectToHost(host, puerto);

        if(!cliente->waitForConnected(timeout))
            emit estado(cliente->errorString());

        emit estado(tr("Conectado: %1:%2").arg(host).arg(puerto));
        QDataStream in(cliente);
        in >> bloque;
    }
}

