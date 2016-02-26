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
public class Jugador1 extends JPanel{
    
    private Image imagen;
    private JLabel lb;
    private JTextField txtPuntaje;
    
    public Jugador1(){
        initComponets();
    }
    
    private void initComponets(){
        imagen = new ImageIcon("C:/Users/LENOVO/Documents/GitHub/GoGame/GoGame/src/resource/g-black.png").
                getImage();
        setTxtPuntaje(new JTextField(" Puntaje jugador ",15));
        lb = new JLabel("           ", 10);        
        setLayout(new FlowLayout());
        add(lb);
        add(getTxtPuntaje());
    }
    
    @Override
    public void paint(Graphics g){
        g.drawImage(imagen,0,0,30,30,this);
    }

    /**
     * @return the txtPuntaje
     */
    public JTextField getTxtPuntaje() {
        return txtPuntaje;
    }

    /**
     * @param txtPuntaje the txtPuntaje to set
     */
    public void setTxtPuntaje(JTextField txtPuntaje) {
        this.txtPuntaje = txtPuntaje;
    }
}
