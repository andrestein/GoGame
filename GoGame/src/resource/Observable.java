/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

/**
 *
 * @author audoban
 */
public interface Observable {
    
    public void addObservable(Observador o);
    
    public void removeObservable(Observador o);
    
    public void update();
}
