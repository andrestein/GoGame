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
public class Ficha {

    private Cruce pos;
    private Color color;

    enum Color {
        Negro, Blanco
    };

    public Ficha(Cruce pos, Color color) {
        this.pos = pos;
        this.color = color;
    }

    public void getFila() {

    }

    public void getColumna() {

    }

    public boolean equals() {
        return true;
    }

    @Override
    public String toString() {
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
    public Color getColor() {
        return color;
    }
}
