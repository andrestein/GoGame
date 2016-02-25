/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author LENOVO
 */
public class TableroUI extends JPanel{
    
    private Image imagen;
    
    public TableroUI(){        
        initComponets();
    }
    
    
    private void initComponets(){
        setSize(500,500);
        imagen = new 
        ImageIcon("C:/Users/LENOVO/Documents/GitHub/GoGame/GoGame/src/resource/g-board.png").getImage();
    }   
        
    public void paint(Graphics g){
        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
    }
}
