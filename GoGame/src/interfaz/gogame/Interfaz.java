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
        btnReiniciar = new JButton("Reiniciar");
        setTitle("Go game");
        setSize(950, 500);
        setResizable(false);
        setLayout(new BorderLayout());
        add(p1,BorderLayout.WEST);
        add(p2,BorderLayout.EAST);        
        add(tab,BorderLayout.CENTER);
        add(btnReiniciar,BorderLayout.SOUTH);
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
    
    @Override
    public void actionPerformed(ActionEvent e) {        
        
    }
}
