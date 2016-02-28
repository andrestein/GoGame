/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import resource.Board9x9;
import resource.BoardInfo;
import resource.Rect;

/**
 *
 * @author LENOVO
 */
public class TableroUI extends JPanel implements MouseMotionListener,MouseListener {

    private Image imgBoard;
    private final BoardInfo boardInfo;
    private Rect rect;

    public TableroUI() {
        super();
        boardInfo = new Board9x9();
        try {
            initComponets();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TableroUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initComponets() throws MalformedURLException {
        addMouseMotionListener(this);
        setLayout(null);
        setBackground(new Color(0xFF9955));
        URL img_board_url = new URL("file", "localhost", "src/resource/g-board.png");
        System.out.println(img_board_url.getFile());
        imgBoard = new ImageIcon(img_board_url.getFile()).getImage();
        Dimension size = new Dimension(imgBoard.getWidth(null), imgBoard.getHeight(null));
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
        setSize(size);
    }

    public void paint(Graphics g) {
        g.drawImage(imgBoard, 0, 0, 
                imgBoard.getWidth(null),
                imgBoard.getHeight(null), this);
        if ( rect != null ) {
            g.drawImage(imgBoard, WIDTH, WIDTH, this);
        }
    }
    
    public void mouseListener(MouseEvent e){
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    public void mouseMoved(MouseEvent e) {
        Rect rect = boardInfo.getRect(e.getX(), e.getY());
        if (rect != null) {
            System.out.println(rect);
        }
    }

    /**
     * @return the boardInfo
     */
    public BoardInfo getBoardInfo() {
        return boardInfo;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
