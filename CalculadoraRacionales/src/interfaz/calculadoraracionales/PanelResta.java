/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.calculadoraracionales;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author LENOVO
 */
public class PanelResta extends JPanel{
    
    
    private JTextField txtRacional1;
    private JTextField txtRacional2;    
    private JButton btnResta;
    
    public PanelResta(){
        initComponets();
    }
    
    private void initComponets(){
        txtRacional1 = new JTextField();
        txtRacional2 = new JTextField();
        JLabel lbOperador = new JLabel(" + ");
        btnResta = new JButton("Sumar");
        setLayout(new FlowLayout());
        add(txtRacional1);
        add(lbOperador);
        add(txtRacional2);
        add(btnResta);        
    }
}
