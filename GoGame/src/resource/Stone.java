/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author audoban
 */
public class Stone extends ImageIcon {

    private Rect rect;
    private StoneType type;
    private ImageIcon img;

    public enum StoneType {
        StoneWhite, StoneBlack
    }

    /**
     * @return the tipo
     */
    public StoneType getType() {
        return type;
    }

    public Stone(StoneType tipo, Rect rect) {
        super();
        this.type = tipo;
        this.rect = rect;
        try {
            loadImage();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Stone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Stone(Stone p) {
        try {
            rect = p.rect;
            type = p.type;
            img = p.img;
            loadImage();
        } catch (MalformedURLException ex) {
            Logger.getLogger(Stone.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadImage() throws MalformedURLException {
        switch (type) {
            case StoneWhite: {
                URL url = new URL("file", "localhost", "src/resource/g-white.png");
                img = new ImageIcon(url.getFile());
                setImage(img.getImage());
            }
            break;
            case StoneBlack: {
                URL url = new URL("file", "localhost", "src/resource/g-black.png");
                img = new ImageIcon(url.getFile());
                setImage(img.getImage());
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

    public void clear(Graphics g) {
        g.clearRect(rect.getX() - getIconWidth() / 2
                , rect.getY() - getIconHeight() / 2
                , getIconWidth(), getIconHeight());
    }
    
    
    @Override
    public boolean equals(Object other) {
        Stone p = (Stone) other;
        return rect.equals(p.rect) && type.equals(p.type);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.rect);
        return hash;
    }

}
