#ifndef SERVIDOR_H
#define SERVIDOR_H

#include "mapachar.h"

#include <QString>
#include <QSettings>
#include <QTcpServer>
#include <QTcpSocket>
#include <QNetworkSession>

class Servidor : QObject
{
Q_OBJECT
public:
    Servidor();

public:
    void abrirSesion();
    void abrirSocket();
    QString encriptar(const QString& mensaje);
    long long getNumA() const;
    long long getNumB() const;
    QString getHost() const;
    quint16 getPuerto() const;

signals:
    void sesionAbierta();
    void estado(const QString estado);

public slots:
    void enviar(const QString& mensaje);

private:
    long long a;
    long long b;
    QByteArray * bloque = nullptr;
    QTcpServer * servidor = nullptr;
    QTcpSocket * socket = nullptr;
    QNetworkSession * sesion = nullptr;
    QString host = "";
    quint16 puerto = 0;

};

#endif // SERVIDOR_H
