/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame implements ActionListener{
    private TableroUI tab;
    private Jugador1 p1;
    private Jugador2 p2;
    private JLabel lb;
    private JLabel lb2;
    private JButton btnReiniciar;
    private Image fichaBlanca;
    private Image fichaNegra;
    
    public Interfaz(){
        initComponets();
    }
    
    public void initComponets(){
        tab = new TableroUI();
        p1 = new Jugador1();
        p2 = new Jugador2();
        lb2 = new JLabel("ñalsdjkflasdjfasd2");
        setTitle("Go game");
        setSize(900, 500);
        setResizable(false);
        setLayout(new BorderLayout());
        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.EAST);        
        add(tab,BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
