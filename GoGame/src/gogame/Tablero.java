/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gogame;

import java.util.ArrayList;

/**
 *
 * @author audoban
 */
public class Tablero {
 
    private int t; // turno
    private int[][] estados;
    private ArrayList<Cerco> cerco_negro;
    private ArrayList<Cerco> cerco_blanco;
    
    public Tablero() {
        
    }

    /**
     * @return the t
     */
    public int getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(int t) {
        this.t = t;
    }

    /**
     * @return the estados
     */
    public int[][] getEstados() {
        return estados;
    }

    /**
     * @param estados the estados to set
     */
    public void setEstados(int[][] estados) {
        this.estados = estados;
    }

    /**
     * @return the cerco_negro
     */
    public ArrayList<Cerco> getCerco_negro() {
        return cerco_negro;
    }

    /**
     * @param cerco_negro the cerco_negro to set
     */
    public void setCerco_negro(ArrayList<Cerco> cerco_negro) {
        this.cerco_negro = cerco_negro;
    }

    /**
     * @return the cerco_blanco
     */
    public ArrayList<Cerco> getCerco_blanco() {
        return cerco_blanco;
    }

    /**
     * @param cerco_blanco the cerco_blanco to set
     */
    public void setCerco_blanco(ArrayList<Cerco> cerco_blanco) {
        this.cerco_blanco = cerco_blanco;
    }

    
}
