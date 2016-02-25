/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.calculadoraracionales;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

/**
 *
 * @author LENOVO
 */
public class Interfaz extends JFrame {
    
    PanelDivision panelDivision;
    PanelMultiplicacion panelMultiplicacion;
    PanelResta panelResta;
    PanelSuma panelSuma;
            
    public Interfaz() {
        super();
        initComponents();
    }
     
     public void initComponents() {
         setTitle("Johan Smith AR.- Andres Granda P.");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setMinimumSize(new Dimension(300, 480));
         BoxLayout lbox = new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS);
         setLayout(lbox);
         
         panelSuma = new PanelSuma();
         panelResta = new PanelResta();
         panelMultiplicacion = new PanelMultiplicacion();
         panelDivision = new PanelDivision();
         add(panelSuma);
         add(panelResta);
         add(panelMultiplicacion);
         add(panelDivision);
     }
}
