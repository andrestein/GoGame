/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author audoban
 */
public class Piedra extends ImageIcon {

    private Rect rect;
    private PiedraTipo tipo;
    private ImageIcon imagen;
    
    public enum PiedraTipo{
        PiedraBlanca,PiedraNegra;
    };
    
    public Piedra(PiedraTipo tipo, Rect rec ) throws MalformedURLException{
        super();
        this.tipo = tipo;
        this.rect = rect;
        image();
    }    

    private void image() throws MalformedURLException{
        switch(tipo){
            case PiedraBlanca:
            {
                URL url = new URL("file", "localhost", "src/resource/g-white.png");
                imagen = new ImageIcon(url.getFile());                
                setImage(imagen.getImage());
            }
            case PiedraNegra:
            {
                URL url = new URL("file", "localhost", "src/resource/g-black.png");
                imagen = new ImageIcon(url.getFile());                
                setImage(imagen.getImage());
            }
        }
    }
}
