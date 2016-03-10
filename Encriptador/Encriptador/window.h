#ifndef SERVERWINDOW_H
#define SERVERWINDOW_H

#include <QMainWindow>
#include "servidor.h"
#include "cliente.h"

namespace Ui {
class Window;
}

class Window : public QMainWindow
{
    Q_OBJECT
public:
    explicit Window(QWidget *parent = 0);
    ~Window();

public slots:
    void btnCifrarClicked();
    void btnDescifrarClicked();
    void btnEnviarClicked();
    void btnConectarClicked();
    void enableBtnEnviar();

private:
    Ui::Window * ui;
    Servidor * servidor;
    Cliente * cliente;
};

#endif // SERVERWINDOW_H
