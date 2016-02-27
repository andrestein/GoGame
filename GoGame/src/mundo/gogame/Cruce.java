/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo.gogame;

/**
 *
 * @author LENOVO
 */
public class Cruce {
    private int f; // fila 
    private int c; // columna
    
    public Cruce(int f, int c ){
        this.f = f;
        this.c = c;
    }

    public boolean equals(int f,int c){
        return this.f == f && this.c == c;
    }
    
    @Override
    public String toString(){
        return f+"-"+c;
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
