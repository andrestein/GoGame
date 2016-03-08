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
public interface StoneObservable {
    
    public void addObserver(IStone o);
    public void deleteObserver(IStone o);
    public void notifyObservers();
    
}
