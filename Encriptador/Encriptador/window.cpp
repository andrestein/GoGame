#include "window.h"
#include "ui_window.h"

Window::Window(QWidget *parent) :
    QMainWindow(parent),
    ui(new Ui::Window)
{
    ui->setupUi(this);
    ui->btnEnviar->setEnabled(false);
    servidor = new Servidor();
    servidor->abrirSocket();
    ui->editIPLocal->setText(servidor->getHost());
    QString puerto;
    puerto.setNum(servidor->getPuerto());
    ui->editPuertoLocal->setText(puerto);
    cliente = new Cliente(this);

    connect(ui->btnCifrar, SIGNAL(clicked(bool)), this, SLOT(btnCifrarClicked()));
    connect(ui->btnEnviar, SIGNAL(clicked(bool)), this, SLOT(btnEnviarClicked()));
    connect(ui->textMSalida, SIGNAL(textChanged()), this, SLOT(enableBtnEnviar()));
    connect(ui->btnConectar, SIGNAL(clicked(bool)), this, SLOT(btnConectarClicked()));
    //connect(ui->btnDescifrar, SIGNAL(clicked(bool)), this, SLOT(btnDescifrarClicked());
}

Window::~Window()
{
    delete ui;
}

// SLOTS
void Window::btnCifrarClicked() {
    QString mensaje = servidor->encriptar(ui->textMEntrada->toPlainText());
    ui->textMSalida->setPlainText(mensaje);
}

void Window::btnDescifrarClicked() {
    const QString m = cliente->desencriptar(ui->textMCifrado->toPlainText(), 1, 2);
    ui->textMDescifrado->setPlainText(m);
}

void Window::btnEnviarClicked() {
}

void Window::enableBtnEnviar() {
    if(cliente->conectado() )
        ui->btnEnviar->setEnabled(!ui->textMSalida->toPlainText().isEmpty());
    else {
        ui->btnEnviar->setEnabled(false);
    }
}

void Window::btnConectarClicked() {
    quint16 puerto = (ui->editIPServidor->text()).toUInt();
    cliente->nuevaConexion(
                ui->editIPServidor->text(), puerto);
    enableBtnEnviar();
}
