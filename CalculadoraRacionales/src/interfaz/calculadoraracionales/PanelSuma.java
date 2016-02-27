/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.calculadoraracionales;



import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author LENOVO
 */

public class PanelSuma extends JPanel{
    
    private JTextField txtRacional;
    private JButton btnSuma;
    
    public PanelSuma(){
        
    }
    
    private void initComponets(){
        setLayout(new FlowLayout());   
    }
}
