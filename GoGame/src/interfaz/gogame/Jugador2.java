/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class Jugador2 extends JPanel{
    
    private Image imagenBlancas;
    private JLabel lb;
    private JTextField txtPuntaje2;
    
    public Jugador2(){
        initComponets();
    }
    
    private void initComponets(){
        imagenBlancas = new ImageIcon("C:/Users/LENOVO/Documents/GitHub/GoGame/GoGame/src/resource/g-white.png").
                getImage();
        lb = new JLabel("         ", 10);   
        txtPuntaje2 = new JTextField(" Puntaje jugador ",15);
        txtPuntaje2.setVisible(true);
        setLayout(new FlowLayout());           
        add(lb);
        add(txtPuntaje2);
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(imagenBlancas,0,0,30,30,this);
    }
}