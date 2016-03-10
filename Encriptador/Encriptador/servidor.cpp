#include "servidor.h"
#include "mapachar.h"
#include <iostream>
#include <cmath>
#include <random>

#include <QString>
#include <QMessageBox>
#include <QNetworkConfiguration>
#include <QNetworkConfigurationManager>
#include <QDebug>
#include <ctime>
#include <chrono>

class QSettings;

using namespace std;

Servidor::Servidor()
{
    typedef std::chrono::high_resolution_clock myclock;
    myclock::time_point beginning = myclock::now();
    myclock::duration d = myclock::now() - beginning;

    std::default_random_engine motor;
    unsigned seed = d.count();
    motor.seed(seed);

    std::uniform_int_distribution<long long> rand(1, 103);
    rand(motor);
    a = rand(motor);
    b = rand(motor);
    qDebug() << a  << " " << b;
    abrirSesion();
}

long long Servidor::getNumA() const {
    return a;
}

long long Servidor::getNumB() const {
    return b;
}

QString Servidor::encriptar(const QString& mensaje) {
    QString str;    
    qDebug() << mensaje;
    for(size_t i = 0; i < mensaje.size(); i++) {
        residuo = 0;
        for(size_t j = 0; j < 103; j++) {
            if(mensaje.toStdWString()[i] == chars[j]) {
                long long Dividendo = a * (j) + b;


                string chEncrip = to_string(static_cast<long long>(floor(Dividendo)));
                str += QString(chEncrip.data());
                str.append(' ');
            }
        }
    }
    return str;
}

void Servidor::abrirSesion() {
    QNetworkConfigurationManager manager;
    // Si esta bandera esta activa la plataforma
    if(manager.capabilities() & QNetworkConfigurationManager::NetworkSessionRequired) {
        // Obtenemos las configuraciones
        QSettings config(QSettings::UserScope, QStringLiteral("Encriptador"));
        config.beginGroup(QLatin1String("Conexion"));
        const QString id = config.value(QLatin1String("DefaultNetworkConfiguration")).toString();
        QNetworkConfiguration netConfig = manager.configurationFromIdentifier(id);
        if ((netConfig.state() & QNetworkConfiguration::Discovered) != QNetworkConfiguration::Discovered) {
            netConfig = manager.defaultConfiguration();
        }

        sesion = new QNetworkSession(netConfig, this);
        this->connect(sesion, SIGNAL(opened()), this, SIGNAL(sesionAbierta()));
        sesion->open();
        if (sesion->isOpen())
            emit estado(QLatin1String("Conectado con el servidor."));
    } else {
        emit sesionAbierta();
    }
}

void Servidor::abrirSocket() {
    // Salva la configuracion usada
        if (sesion) {
            QNetworkConfiguration config = sesion->configuration();
            QString id;
            if (config.type() == QNetworkConfiguration::UserChoice)
                id = sesion->sessionProperty(QLatin1String("UserChoiceConfiguration")).toString();
            else
                id = config.identifier();

            QSettings settings(QSettings::UserScope, QLatin1String("Encriptador"));
            settings.beginGroup(QLatin1String("Conexion"));
            settings.setValue(QLatin1String("DefaultNetworkConfiguration"), id);
            settings.endGroup();
        }

        servidor = new QTcpServer(this);
        if (!servidor->listen()) {
            //QMessageBox::critical (this, tr("Servidor"),
                                  //tr("No se puede iniciar el servidor: %1.")
                                  //.arg(servidor->errorString()));
            return;
        }

        QList<QHostAddress> ipAddressesList = QNetworkInterface::allAddresses();
        // Usa la primera Direccion IPv4 que no es localhost
        for (int i = 0; i < ipAddressesList.size(); ++i) {
            if (ipAddressesList.at(i) != QHostAddress::LocalHost &&
                ipAddressesList.at(i).toIPv4Address()) {
                host = ipAddressesList.at(i).toString();
                break;
            }
        }

        // if no encuentra una usamos localhost
        if (host.isEmpty())
            host = QHostAddress(QHostAddress::LocalHost).toString();

        puerto = servidor->serverPort();

}

void Servidor::enviar(const QString &mensaje) {
    QByteArray block;
    QDataStream out(&block, QIODevice::WriteOnly);
    //out.setVersion(QDataStream::Qt_4_0);
    out << mensaje.toStdString().data();
    out.device()->seek(0);

    socket = servidor->nextPendingConnection();
    connect(socket, SIGNAL(disconnected()),
    socket, SLOT(deleteLater()));
    socket->write(block);
    socket->disconnectFromHost();
}

QString Servidor::getHost() const {
    return host;
}

quint16 Servidor::getPuerto() const {
    return puerto;
}
