/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import java.awt.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.plaf.IconUIResource;

/**
 *
 * @author LENOVO
 */
public class Puntaje extends JPanel{
    
    private ImageIcon imagen;
    private JLabel lb;
    private JTextField txtPuntaje;
    
    public final static String ICON_WHITE = "g-white.png";
    public final static String ICON_BLACK = "g-black.png";
    
    public Puntaje(String ICON){
        super();
        try {
            initComponets(ICON);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Puntaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void initComponets(String ICON) throws MalformedURLException{
        URL img_black_url = new URL("file", "localhost", "src/resource/" + ICON);
        setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        imagen = new ImageIcon(img_black_url.getFile());
        Font font = new Font("Monospace", Font.BOLD | Font.TRUETYPE_FONT, 30);
        lb = new JLabel(" :",imagen,JLabel.CENTER);
        lb.setFont(font);
        txtPuntaje = new JTextField("0", 15);
        txtPuntaje.setFont(font);
        txtPuntaje.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3, true));
        txtPuntaje.setEditable(false);
        txtPuntaje.setBackground(new Color(0xFF9955));
        setMaximumSize(new Dimension(100 + imagen.getIconWidth(), imagen.getIconHeight() + 10));
        add(lb);
        add(Box.createHorizontalStrut(20));
        add(txtPuntaje);
        setBackground(new Color(0xFF9955));
    }
    /**
     * @return the txtPuntaje2
     */
    public JTextField getTxtPuntaje() {
        return txtPuntaje;
    }

    /**
     * @param txtPuntaje2 the txtPuntaje2 to set
     */
    public void setTxtPuntaje(String puntaje) {
        txtPuntaje.setText(puntaje);
    }
}