/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gogame;

/**
 *
 * @author LENOVO
 */
public class Estructura {
    private int heuristica;
    private Ficha ficha;
    
    public Estructura(int heuristica, Ficha ficha){
        this.heuristica= heuristica;
        this.ficha = ficha;
    }

    public void opName2(){
        
    }
    
    /**
     * @return the heuristica
     */
    public int getHeuristica() {
        return heuristica;
    }

    /**
     * @param heuristica the heuristica to set
     */
    public void setHeuristica(int heuristica) {
        this.heuristica = heuristica;
    }

    /**
     * @return the ficha
     */
    public Ficha getFicha() {
        return ficha;
    }

    /**
     * @param ficha the ficha to set
     */
    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }
    
    
}
