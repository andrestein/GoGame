/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author LENOVO
 */
public interface Observador  {
    
    public void actualizarBlancas(Piedra p);
    
    public void actualizarNegras(Piedra p);
}
