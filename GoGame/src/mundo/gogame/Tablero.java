/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo.gogame;

import java.util.ArrayList;
import resource.IPiedra;
import resource.Piedra;
import resource.Rect;
import resource.TableroObservador;

/**
 *
 * @author audoban
 */
public class Tablero implements TableroObservador {

    private ArrayList<Territorio> cerco_negro;
    private ArrayList<Territorio> cerco_blanco;
    private ArrayList<IPiedra> blancas;
    private ArrayList<IPiedra> negras;
    
    public Tablero() {

    }
    
    public boolean existe(Piedra[] piedra,ArrayList<Piedra> piedras,int p){
        Rect rect = piedra[p].getRect();
        for (Piedra piedra1 : piedras) {
            if(piedra1.getRect().equals(rect)){
                return true;
            }
        }
        return false;
    }
    
    /**
     * @return the cerco_negro
     */
    public ArrayList<Territorio> getCerco_negro() {
        return cerco_negro;
    }

    /**
     * @param cerco_negro the cerco_negro to set
     */
    public void setCerco_negro(ArrayList<Territorio> cerco_negro) {
        this.cerco_negro = cerco_negro;
    }

    /**
     * @return the cerco_blanco
     */
    public ArrayList<Territorio> getCerco_blanco() {
        return cerco_blanco;
    }

    /**
     * @param cerco_blanco the cerco_blanco to set
     */
    public void setCerco_blanco(ArrayList<Territorio> cerco_blanco) {
        this.cerco_blanco = cerco_blanco;
    }

    @Override
    public void updateBlancas(Piedra p) {
        
    }

    @Override
    public void updateNegras(Piedra p) {
        
    }

    private static class Piedras {

        public Piedras() {
        }
    }

}
