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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author audoban
 */
public class Piedra extends ImageIcon {

    private Rect rect;
    private PiedraTipo tipo;
    private ImageIcon imagen;

    public enum PiedraTipo {
        PiedraBlanca, PiedraNegra
    }

    /**
     * @return the tipo
     */
    public PiedraTipo getTipo() {
        return tipo;
    }

    public Piedra(PiedraTipo tipo, Rect rect) {
        super();
        this.tipo = tipo;
        this.rect = rect;
        try {
            image();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Piedra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Piedra(Piedra p) {
        try {
            rect = p.rect;
            tipo = p.tipo;
            imagen = p.imagen;
            image();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Piedra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void image() throws MalformedURLException {
        switch (tipo) {
            case PiedraBlanca: {
                URL url = new URL("file", "localhost", "src/resource/g-white.png");
                imagen = new ImageIcon(url.getFile());
                setImage(imagen.getImage());
            }
            break;
            case PiedraNegra: {
                URL url = new URL("file", "localhost", "src/resource/g-black.png");
                imagen = new ImageIcon(url.getFile());
                setImage(imagen.getImage());
            }
            break;
        }
    }

    public Rect getRect() {
        return rect;
    }

    public void setRect(Rect rect) {
        this.rect = rect;
    }

    public void draw(Graphics g, ImageObserver observer) {
        g.drawImage(getImage()
                , rect.getX() - getIconWidth() / 2
                , rect.getY() - getIconHeight() / 2
                , observer);
    }

    public void clean(Graphics g) {
        g.clearRect(rect.getX() - getIconWidth() / 2
                , rect.getY() - getIconHeight() / 2
                , getIconWidth(), getIconHeight());
    }

}
