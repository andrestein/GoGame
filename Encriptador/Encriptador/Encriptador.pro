#-------------------------------------------------
#
# Project created by QtCreator 2015-11-15T23:00:41
#
#-------------------------------------------------

QT += core gui
QT += network
CONFIG += c++0x
QMAKE_CXXFLAGS +=   -std = c++11

greaterThan(QT_MAJOR_VERSION, 4): QT += widgets

TARGET = Encriptador
TEMPLATE = app


SOURCES += main.cpp\
    servidor.cpp \
    cliente.cpp \
    window.cpp

HEADERS  += \
    mapachar.h \
    servidor.h \
    cliente.h \
    window.h

FORMS += window.ui

