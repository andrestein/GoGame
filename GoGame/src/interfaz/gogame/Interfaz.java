/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import com.sun.glass.events.KeyEvent;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import mundo.gogame.Partida;


/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame implements ActionListener {
    private TableroUI tab;  
    private Partida partida;
    private Puntaje p1;
    private Puntaje p2;
    private JToolBar toolbar;
    private JButton btnReiniciar;
    private JButton btnCambioTurno;
    
    public Interfaz(){
        initComponets();
        partida = new Partida(p1, p2);
    }
    
    public void initComponets(){
        tab = new TableroUI();
        p1 = new Puntaje(Puntaje.ICON_BLACK);
        p2 = new Puntaje(Puntaje.ICON_WHITE);        
        toolbar = new JToolBar();
        addButtons(toolbar);
        toolbar.setEnabled(false);
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
        add(toolbar, BorderLayout.NORTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Go game");
        setSize(500, 610);
        setResizable(false);
        box.setBackground(new Color(0xFF9955));
        getContentPane().setBackground(new Color(0xFF9955));        
    }    
    
    
    protected void addButtons(JToolBar toolBar) {
        
    btnReiniciar = new JButton("Reiniciar");
    btnReiniciar.addActionListener(this);
    toolBar.add(btnReiniciar);
    
    btnCambioTurno = new JButton("Cambio de turno");
    btnCambioTurno.addActionListener(this);
    toolBar.add(btnCambioTurno);

    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnReiniciar){
            tab.clear();
            p1.clear();
            p2.clear();
        }else if(e.getSource() == btnCambioTurno){
            partida.addTurno();
        }
    }
}
