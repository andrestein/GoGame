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
        setTxtPuntaje2(new JTextField(" Puntaje jugador ",15));        
        setLayout(new FlowLayout());
        add(lb);
        add(getTxtPuntaje2());
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(imagenBlancas,0,0,30,30,this);
    }

    /**
     * @return the txtPuntaje2
     */
    public JTextField getTxtPuntaje2() {
        return txtPuntaje2;
    }

    /**
     * @param txtPuntaje2 the txtPuntaje2 to set
     */
    public void setTxtPuntaje2(JTextField txtPuntaje2) {
        this.txtPuntaje2 = txtPuntaje2;
    }
}