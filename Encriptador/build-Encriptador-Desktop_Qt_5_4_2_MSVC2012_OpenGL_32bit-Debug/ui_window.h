/********************************************************************************
** Form generated from reading UI file 'window.ui'
**
** Created by: Qt User Interface Compiler version 5.4.2
**
** WARNING! All changes made in this file will be lost when recompiling UI file!
********************************************************************************/

#ifndef UI_WINDOW_H
#define UI_WINDOW_H

#include <QtCore/QVariant>
#include <QtWidgets/QAction>
#include <QtWidgets/QApplication>
#include <QtWidgets/QButtonGroup>
#include <QtWidgets/QFormLayout>
#include <QtWidgets/QFrame>
#include <QtWidgets/QGroupBox>
#include <QtWidgets/QHBoxLayout>
#include <QtWidgets/QHeaderView>
#include <QtWidgets/QLabel>
#include <QtWidgets/QLineEdit>
#include <QtWidgets/QMainWindow>
#include <QtWidgets/QPlainTextEdit>
#include <QtWidgets/QPushButton>
#include <QtWidgets/QSpacerItem>
#include <QtWidgets/QTabWidget>
#include <QtWidgets/QVBoxLayout>
#include <QtWidgets/QWidget>

QT_BEGIN_NAMESPACE

class Ui_Window
{
public:
    QWidget *centralWidget;
    QHBoxLayout *horizontalLayout;
    QTabWidget *tabMain;
    QWidget *tab;
    QVBoxLayout *verticalLayout;
    QGroupBox *groupBox;
    QVBoxLayout *verticalLayout_4;
    QLabel *label;
    QPlainTextEdit *textMEntrada;
    QLabel *label_2;
    QPlainTextEdit *textMSalida;
    QFrame *frame_3;
    QHBoxLayout *horizontalLayout_2;
    QPushButton *btnCifrar;
    QPushButton *btnEnviar;
    QWidget *tab_2;
    QVBoxLayout *verticalLayout_2;
    QGroupBox *groupBox_2;
    QVBoxLayout *verticalLayout_3;
    QLabel *label_3;
    QPlainTextEdit *textMCifrado;
    QLabel *label_4;
    QPlainTextEdit *textMDescifrado;
    QFrame *frame_4;
    QHBoxLayout *horizontalLayout_3;
    QPushButton *btnDescifrar;
    QWidget *tab_3;
    QVBoxLayout *verticalLayout_5;
    QFrame *frame;
    QFormLayout *formLayout;
    QLabel *label_5;
    QLineEdit *editIPServidor;
    QLabel *label_6;
    QLineEdit *editPuertoServidor;
    QPushButton *btnConectar;
    QFrame *frame_2;
    QFormLayout *formLayout_2;
    QLabel *label_7;
    QLineEdit *editIPLocal;
    QLabel *label_8;
    QLineEdit *editPuertoLocal;
    QSpacerItem *verticalSpacer;

    void setupUi(QMainWindow *Window)
    {
        if (Window->objectName().isEmpty())
            Window->setObjectName(QStringLiteral("Window"));
        Window->resize(577, 426);
        centralWidget = new QWidget(Window);
        centralWidget->setObjectName(QStringLiteral("centralWidget"));
        horizontalLayout = new QHBoxLayout(centralWidget);
        horizontalLayout->setSpacing(6);
        horizontalLayout->setContentsMargins(11, 11, 11, 11);
        horizontalLayout->setObjectName(QStringLiteral("horizontalLayout"));
        tabMain = new QTabWidget(centralWidget);
        tabMain->setObjectName(QStringLiteral("tabMain"));
        tabMain->setLayoutDirection(Qt::LeftToRight);
        tab = new QWidget();
        tab->setObjectName(QStringLiteral("tab"));
        verticalLayout = new QVBoxLayout(tab);
        verticalLayout->setSpacing(6);
        verticalLayout->setContentsMargins(11, 11, 11, 11);
        verticalLayout->setObjectName(QStringLiteral("verticalLayout"));
        groupBox = new QGroupBox(tab);
        groupBox->setObjectName(QStringLiteral("groupBox"));
        verticalLayout_4 = new QVBoxLayout(groupBox);
        verticalLayout_4->setSpacing(6);
        verticalLayout_4->setContentsMargins(11, 11, 11, 11);
        verticalLayout_4->setObjectName(QStringLiteral("verticalLayout_4"));
        label = new QLabel(groupBox);
        label->setObjectName(QStringLiteral("label"));

        verticalLayout_4->addWidget(label);

        textMEntrada = new QPlainTextEdit(groupBox);
        textMEntrada->setObjectName(QStringLiteral("textMEntrada"));

        verticalLayout_4->addWidget(textMEntrada);

        label_2 = new QLabel(groupBox);
        label_2->setObjectName(QStringLiteral("label_2"));

        verticalLayout_4->addWidget(label_2);

        textMSalida = new QPlainTextEdit(groupBox);
        textMSalida->setObjectName(QStringLiteral("textMSalida"));

        verticalLayout_4->addWidget(textMSalida);


        verticalLayout->addWidget(groupBox);

        frame_3 = new QFrame(tab);
        frame_3->setObjectName(QStringLiteral("frame_3"));
        frame_3->setFrameShape(QFrame::StyledPanel);
        frame_3->setFrameShadow(QFrame::Plain);
        horizontalLayout_2 = new QHBoxLayout(frame_3);
        horizontalLayout_2->setSpacing(6);
        horizontalLayout_2->setContentsMargins(11, 11, 11, 11);
        horizontalLayout_2->setObjectName(QStringLiteral("horizontalLayout_2"));
        btnCifrar = new QPushButton(frame_3);
        btnCifrar->setObjectName(QStringLiteral("btnCifrar"));

        horizontalLayout_2->addWidget(btnCifrar);

        btnEnviar = new QPushButton(frame_3);
        btnEnviar->setObjectName(QStringLiteral("btnEnviar"));

        horizontalLayout_2->addWidget(btnEnviar);


        verticalLayout->addWidget(frame_3);

        tabMain->addTab(tab, QString());
        tab_2 = new QWidget();
        tab_2->setObjectName(QStringLiteral("tab_2"));
        verticalLayout_2 = new QVBoxLayout(tab_2);
        verticalLayout_2->setSpacing(6);
        verticalLayout_2->setContentsMargins(11, 11, 11, 11);
        verticalLayout_2->setObjectName(QStringLiteral("verticalLayout_2"));
        groupBox_2 = new QGroupBox(tab_2);
        groupBox_2->setObjectName(QStringLiteral("groupBox_2"));
        verticalLayout_3 = new QVBoxLayout(groupBox_2);
        verticalLayout_3->setSpacing(6);
        verticalLayout_3->setContentsMargins(11, 11, 11, 11);
        verticalLayout_3->setObjectName(QStringLiteral("verticalLayout_3"));
        label_3 = new QLabel(groupBox_2);
        label_3->setObjectName(QStringLiteral("label_3"));

        verticalLayout_3->addWidget(label_3);

        textMCifrado = new QPlainTextEdit(groupBox_2);
        textMCifrado->setObjectName(QStringLiteral("textMCifrado"));

        verticalLayout_3->addWidget(textMCifrado);

        label_4 = new QLabel(groupBox_2);
        label_4->setObjectName(QStringLiteral("label_4"));

        verticalLayout_3->addWidget(label_4);

        textMDescifrado = new QPlainTextEdit(groupBox_2);
        textMDescifrado->setObjectName(QStringLiteral("textMDescifrado"));

        verticalLayout_3->addWidget(textMDescifrado);


        verticalLayout_2->addWidget(groupBox_2);

        frame_4 = new QFrame(tab_2);
        frame_4->setObjectName(QStringLiteral("frame_4"));
        frame_4->setLayoutDirection(Qt::RightToLeft);
        frame_4->setFrameShape(QFrame::VLine);
        frame_4->setFrameShadow(QFrame::Plain);
        horizontalLayout_3 = new QHBoxLayout(frame_4);
        horizontalLayout_3->setSpacing(6);
        horizontalLayout_3->setContentsMargins(11, 11, 11, 11);
        horizontalLayout_3->setObjectName(QStringLiteral("horizontalLayout_3"));
        btnDescifrar = new QPushButton(frame_4);
        btnDescifrar->setObjectName(QStringLiteral("btnDescifrar"));
        btnDescifrar->setLayoutDirection(Qt::RightToLeft);

        horizontalLayout_3->addWidget(btnDescifrar);


        verticalLayout_2->addWidget(frame_4);

        tabMain->addTab(tab_2, QString());
        tab_3 = new QWidget();
        tab_3->setObjectName(QStringLiteral("tab_3"));
        verticalLayout_5 = new QVBoxLayout(tab_3);
        verticalLayout_5->setSpacing(6);
        verticalLayout_5->setContentsMargins(11, 11, 11, 11);
        verticalLayout_5->setObjectName(QStringLiteral("verticalLayout_5"));
        frame = new QFrame(tab_3);
        frame->setObjectName(QStringLiteral("frame"));
        frame->setFrameShape(QFrame::StyledPanel);
        frame->setFrameShadow(QFrame::Raised);
        formLayout = new QFormLayout(frame);
        formLayout->setSpacing(6);
        formLayout->setContentsMargins(11, 11, 11, 11);
        formLayout->setObjectName(QStringLiteral("formLayout"));
        label_5 = new QLabel(frame);
        label_5->setObjectName(QStringLiteral("label_5"));

        formLayout->setWidget(0, QFormLayout::LabelRole, label_5);

        editIPServidor = new QLineEdit(frame);
        editIPServidor->setObjectName(QStringLiteral("editIPServidor"));

        formLayout->setWidget(0, QFormLayout::FieldRole, editIPServidor);

        label_6 = new QLabel(frame);
        label_6->setObjectName(QStringLiteral("label_6"));

        formLayout->setWidget(1, QFormLayout::LabelRole, label_6);

        editPuertoServidor = new QLineEdit(frame);
        editPuertoServidor->setObjectName(QStringLiteral("editPuertoServidor"));

        formLayout->setWidget(1, QFormLayout::FieldRole, editPuertoServidor);

        btnConectar = new QPushButton(frame);
        btnConectar->setObjectName(QStringLiteral("btnConectar"));

        formLayout->setWidget(2, QFormLayout::FieldRole, btnConectar);


        verticalLayout_5->addWidget(frame);

        frame_2 = new QFrame(tab_3);
        frame_2->setObjectName(QStringLiteral("frame_2"));
        frame_2->setFrameShape(QFrame::StyledPanel);
        frame_2->setFrameShadow(QFrame::Raised);
        formLayout_2 = new QFormLayout(frame_2);
        formLayout_2->setSpacing(6);
        formLayout_2->setContentsMargins(11, 11, 11, 11);
        formLayout_2->setObjectName(QStringLiteral("formLayout_2"));
        label_7 = new QLabel(frame_2);
        label_7->setObjectName(QStringLiteral("label_7"));

        formLayout_2->setWidget(0, QFormLayout::LabelRole, label_7);

        editIPLocal = new QLineEdit(frame_2);
        editIPLocal->setObjectName(QStringLiteral("editIPLocal"));
        editIPLocal->setDragEnabled(false);
        editIPLocal->setReadOnly(true);

        formLayout_2->setWidget(0, QFormLayout::FieldRole, editIPLocal);

        label_8 = new QLabel(frame_2);
        label_8->setObjectName(QStringLiteral("label_8"));

        formLayout_2->setWidget(1, QFormLayout::LabelRole, label_8);

        editPuertoLocal = new QLineEdit(frame_2);
        editPuertoLocal->setObjectName(QStringLiteral("editPuertoLocal"));
        editPuertoLocal->setReadOnly(true);

        formLayout_2->setWidget(1, QFormLayout::FieldRole, editPuertoLocal);


        verticalLayout_5->addWidget(frame_2);

        verticalSpacer = new QSpacerItem(20, 40, QSizePolicy::Minimum, QSizePolicy::Expanding);

        verticalLayout_5->addItem(verticalSpacer);

        tabMain->addTab(tab_3, QString());

        horizontalLayout->addWidget(tabMain);

        Window->setCentralWidget(centralWidget);

        retranslateUi(Window);

        tabMain->setCurrentIndex(0);


        QMetaObject::connectSlotsByName(Window);
    } // setupUi

    void retranslateUi(QMainWindow *Window)
    {
        Window->setWindowTitle(QApplication::translate("Window", "ServerWindow", 0));
        groupBox->setTitle(QApplication::translate("Window", " Envio de Mesajes", 0));
        label->setText(QApplication::translate("Window", "Mensaje de entrada:", 0));
        label_2->setText(QApplication::translate("Window", "Mensaje cifrado:", 0));
        btnCifrar->setText(QApplication::translate("Window", "Cifrar", 0));
        btnEnviar->setText(QApplication::translate("Window", "Enviar", 0));
        tabMain->setTabText(tabMain->indexOf(tab), QApplication::translate("Window", "Mensajes", 0));
        groupBox_2->setTitle(QApplication::translate("Window", "Mensaje", 0));
        label_3->setText(QApplication::translate("Window", "Mensaje cifrado:", 0));
        label_4->setText(QApplication::translate("Window", "Mensaje descifrado:", 0));
        btnDescifrar->setText(QApplication::translate("Window", "Descifrar", 0));
        tabMain->setTabText(tabMain->indexOf(tab_2), QApplication::translate("Window", "Recepcion de Mensajes", 0));
        label_5->setText(QApplication::translate("Window", "IP Servidor:", 0));
        label_6->setText(QApplication::translate("Window", "Puerto:", 0));
        btnConectar->setText(QApplication::translate("Window", "Conectar al servidor", 0));
        label_7->setText(QApplication::translate("Window", "IP local:", 0));
        label_8->setText(QApplication::translate("Window", "Puerto:", 0));
        tabMain->setTabText(tabMain->indexOf(tab_3), QApplication::translate("Window", "Conexi\303\263n", 0));
    } // retranslateUi

};

namespace Ui {
    class Window: public Ui_Window {};
} // namespace Ui

QT_END_NAMESPACE

#endif // UI_WINDOW_H
