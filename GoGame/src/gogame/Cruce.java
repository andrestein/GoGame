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
public class Cruce {
    private int f;
    private int c;
    
    public Cruce(int f, int c ){
        this.f = f;
        this.c = c;
    }

    public boolean equals(int f,int g){
        return f ==g;
    }
    
    @Override
    public String toString(){
        return getFila()+""+getColumna();
    }
    
    /**
     * @return the f
     */
    public int getFila() {
        return f;
    }

    /**
     * @param f the f to set
     */
    public void setFila(int f) {
        this.f = f;
    }

    /**
     * @return the c
     */
    public int getColumna() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setColumna(int c) {
        this.c = c;
    }
    
    
}
