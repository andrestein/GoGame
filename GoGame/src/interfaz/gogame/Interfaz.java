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
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame implements ActionListener {
    private TableroUI tab;  
    private Puntaje p1;
    private Puntaje p2;
 
    private JButton btnReiniciar;
    
    public Interfaz(){
        initComponets();
    }
    
    public void initComponets(){
        tab = new TableroUI();
        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar = new JButton("Reiniciar");
        p1 = new Puntaje(Puntaje.ICON_BLACK);
        p2 = new Puntaje(Puntaje.ICON_WHITE);
        setLayout(new BorderLayout());
        
        JPanel box = new JPanel();
        box.setBorder(new TitledBorder(new LineBorder(new Color(0xFF9955)), "Puntajes" ));
       
        box.setLayout(new BoxLayout(box, BoxLayout.LINE_AXIS));
        box.setSize(300, 300);
        box.add(p1);
        box.add(Box.createHorizontalStrut(50));
        box.add(p2);
        add(box, BorderLayout.SOUTH);
        //add(Box.createVerticalStrut(500), BorderLayout.EAST);
        add(tab, BorderLayout.WEST);
        //add(btnReiniciar, BorderLayout.SOUTH);
        btnReiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Go game");
        setSize(500, 600);
        setResizable(false);
        box.setBackground(new Color(0xFF9955));
        getContentPane().setBackground(new Color(0xFF9955));
    }    
    

    @Override
    public void actionPerformed(ActionEvent e) {        
        
    }
}
