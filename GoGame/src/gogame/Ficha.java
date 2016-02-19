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
public class Ficha {
    private Cruce pos;
    private int color;
    
    public Ficha(Cruce pos, int color){
        this.pos = pos;
        this.color = color;
    }
    
    public void getFila(){
        
    }
    
    public void getColumna(){
        
    }
    
    public boolean equals(){
        return true;
    }
    
    @Override
    public String toString(){
        return "";
    }

    /**
     * @return the pos
     */
    public Cruce getPos() {
        return pos;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }
}
