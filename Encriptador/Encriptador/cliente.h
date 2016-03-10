#ifndef CLIENTE_H
#define CLIENTE_H

#include "servidor.h"
#include <iostream>
#include <string>

#include <QString>
#include <QThread>
#include <QTcpSocket>

class Cliente : QThread
{
    Q_OBJECT

public:
    Cliente(QObject * parent);

    bool nuevaConexion(const QString& host, const quint16 puerto);
    void run() override;
    QString desencriptar(QString mensaje, long long a, long long b);
    bool conectado() const;

signals:
    void estado(QString estado);

private:
    long long a;
    long long b;

    QByteArray bloque;
    QTcpSocket * cliente = nullptr;
    QString host;
    quint16 puerto;
    bool quit = false;

};

#endif // CLIENTE_H
