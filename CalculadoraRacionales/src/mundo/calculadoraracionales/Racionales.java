/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mundo.calculadoraracionales;

import java.lang.*;
/**
 *
 * @author LENOVO
 */
public class Racionales {
    
    private int numerador;
    private int denominador;
    
    //Constructor de un numero racional
    
    public Racionales(int numerador,int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        if(denominador == 0){
            throw new ArithmeticException();
        }
    }
    
    
    public Racionales simplificar(Racionales r){
        for(int i = 0;i<9;i++ ){
            if(r.getNumerador() %i == 0 
                    && r.getDenominador()%i == 0){
                r.setNumerador(r.getNumerador()/i);
                r.setDenominador(r.getDenominador()/i);
            }
        }
        return r;
    }

    /**
     * @return the numerador
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * @param numerador the numerador to set
     */
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    /**
     * @return the denominador
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * @param denominador the denominador to set
     */
    public void setDenominador(int denominador){        
        if(denominador == 0){
            throw new ArithmeticException();
        }else{
        this.denominador = denominador;
        }
        
    }
    
}
