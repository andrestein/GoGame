/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz.gogame;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import mundo.gogame.Partida;
import resource.Board9x9;
import resource.BoardInfo;
import resource.Piedra;
import resource.Rect;

/**
 *
 * @author LENOVO
 */
public class TableroUI extends JPanel implements MouseMotionListener, MouseListener {

    private Partida partida;
    private Image imgBoard;
    private final BoardInfo boardInfo;
    private Rect rect;
    private Piedra[] actual;
    
    private ArrayList<Piedra> blancas;
    private ArrayList<Piedra> negras;
    
    public TableroUI(Partida partida) {
        super();
        this.partida = partida;
        boardInfo = new Board9x9();
        initPiedras();
        try {
            initComponets();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TableroUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void initComponets() throws MalformedURLException {
        addMouseMotionListener(this);
        addMouseListener(this);
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
    
    public void clear(){        
        blancas.clear();
        negras.clear();
        paint(getGraphics());
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, imgBoard.getWidth(null), imgBoard.getHeight(null));
        g.drawImage(imgBoard, 0, 0, 
                imgBoard.getWidth(null),
                imgBoard.getHeight(null), this);
        drawPiedras(g);
    }
    
    public void initPiedras() {
        // Capacidad inicial del array
        blancas = new ArrayList<>(boardInfo.getBoardSize() * 3);
        negras = new ArrayList<>(boardInfo.getBoardSize() * 3);
        actual = new Piedra[2];
        actual[0] = new Piedra(Piedra.PiedraTipo.PiedraBlanca, new Rect(0, 0, 1, 'A'));
        actual[1] = new Piedra(Piedra.PiedraTipo.PiedraNegra, new Rect(0, 0, 1, 'A'));
    }
    
    public void drawPiedras(Graphics g) 
    {
        for ( Piedra piedra : blancas )
            piedra.draw(g, this);
        
        for ( Piedra piedra : negras )
            piedra.draw(g, this);
    }
    
    public void mouseListener(MouseEvent e){
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        Rect rect = boardInfo.getRect(e.getX(), e.getY());
        if (rect == null) return;
        Graphics g = getGraphics();
        
        // si es 1 entonces dibujo negra sino blanca
        //! La logica de turnos pertenece a Partida
        int p = partida.getTurno() % 2 == 0 ? 0 : 1;
       
        if ( !rect.equals(actual[p].getRect()) ) {
            actual[p].clean(g);
            paint(g);
            actual[p].setRect(rect);
            actual[p].draw(g, this);
        }
    }

    /**
     * @return the boardInfo
     */
    public BoardInfo getBoardInfo() {
        return boardInfo;
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        int p = partida.getTurno() % 2 == 0 ? 0 : 1;
        if ( p == 0 ) {
            blancas.add(new Piedra(actual[p]));
                        
        } else {
            negras.add(new Piedra(actual[p]));
        }
        partida.addTurno();
        paint(getGraphics());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    
    }
}
