/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo.gogame;

import interfaz.gogame.Puntaje;
import interfaz.gogame.TableroUI;

/**
 *
 * @author LENOVO
 */
public class Partida {
        
    private Puntaje p1;
    private Puntaje p2;    
    private int turno;
    private TableroUI tab;
    
    public Partida(Puntaje p1,Puntaje p2){
        this.p1 = p1;
        this.p2 = p2;
        turno = 1;
    }
    
    public Partida reset(){
        setP1(new Puntaje("g-white.png"));
        setP2(new Puntaje("g-black.png"));
        turno=1;
        return new Partida(getP1(), getP2());
    }
    
    /**
     * @return the turno
     */
    public int getTurno() {
        return turno;
    }

    public void addTurno() {
        turno++;
    }

    /**
     * @return the p1
     */
    public Puntaje getP1() {
        return p1;
    }

    /**
     * @param p1 the p1 to set
     */
    public void setP1(Puntaje p1) {
        this.p1 = p1;
    }

    /**
     * @return the p2
     */
    public Puntaje getP2() {
        return p2;
    }

    /**
     * @param p2 the p2 to set
     */
    public void setP2(Puntaje p2) {
        this.p2 = p2;
    }
    
    
}
