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
import resource.BoardLimitsException;
import resource.Observable;
import resource.Observador;
import resource.Stone;
import resource.Rect;

/**
 *
 * @author LENOVO
 */
public class TableroUI extends JComponent implements Observable, MouseMotionListener, MouseListener {

    private Partida partida;
    private Image imgBoard;
    private final BoardInfo boardInfo;
    private Rect rect;
    private Stone[] actual;
    private ArrayList<Stone> blancas;
    private ArrayList<Stone> negras;
    
    private ArrayList<Observador> observadores;
   
    
    public TableroUI(Partida partida) {
        super();
        observadores = new ArrayList<>();
        this.partida = partida;
        boardInfo = new Board9x9();
        try {
            initComponets();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TableroUI.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }

    private void initComponets() throws MalformedURLException {
        initStones();
        addMouseMotionListener(this);
        addMouseListener(this);
        setLayout(null);
        setBackground(new Color(0xFF9955));
        URL url = new URL("file", "localhost", "src/resource/g-board.png");
        imgBoard = (new ImageIcon(url)).getImage();
        Dimension size = new Dimension(imgBoard.getWidth(this), imgBoard.getHeight(this));
        setMinimumSize(size);
        setMaximumSize(size);
        setPreferredSize(size);
        setSize(size);
    }
    
    public void initStones() {
        try {
            int size = boardInfo.getBoardSize();
            // Capacidad inicial del array
            blancas = new ArrayList<>((size * size) / 2);
            negras = new ArrayList<>((size * size) / 2);
            actual = new Stone[2];
            actual[1] = new Stone(Stone.StoneType.StoneBlack, boardInfo.getRect(5, 'E'));
            actual[0] = new Stone(Stone.StoneType.StoneWhite, boardInfo.getRect(5, 'E'));
        } catch (BoardLimitsException ex) {
            Logger.getLogger(TableroUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the boardInfo
     */
    public BoardInfo getBoardInfo() {
        return boardInfo;
    }
    
    public void clear() {
        getBlancas().clear();
        getNegras().clear();
        paint(getGraphics());
    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(imgBoard, 0, 0,
                imgBoard.getWidth(this),
                imgBoard.getHeight(this), 
                this);
        drawStones();
    }


    public void drawStones() {
        for (Stone piedra : getBlancas()) {
            piedra.draw(getGraphics(), this);
        }
        for (Stone piedra : getNegras()) {
            piedra.draw(getGraphics(), this);
        }
    }

    public void mouseMoved(MouseEvent e) {
        rect = boardInfo.getRect(e.getX(), e.getY());
        if (rect == null) {
            return;
        }
        Graphics g = getGraphics();

        // si es 1 entonces dibujo negra sino blanca
        //! La logica de turnos pertenece a Partida
        int p = partida.getTurno() % 2;
        if (!rect.equals(actual[p].getRect())) {
            actual[p].clear(g);
            actual[p].setRect(rect);
            paint(g);
            actual[p].draw(g, this);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        int p = partida.getTurno() % 2;
        if ( p == 0 ){
            getBlancas().add(new Stone(actual[p]));            
        }else{
            getNegras().add(new Stone(actual[p]));
        }
        partida.addTurno();        
    }


    @Override
    public void mouseEntered(MouseEvent e) {
        actual[partida.getTurno() % 2].draw(getGraphics(), this);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        paint(getGraphics());
    }

    @Override
    public void addListener(Observador o) {
        observadores.add(o);
    }

    @Override
    public void removeListener(Observador o) {
        observadores.add(o);
    }

    @Override
    public void update() {
        for ( Observador obs : observadores  ) {
            obs.update(obs);
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
 
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    /**
     * @return the blancas
     */
    public ArrayList<Stone> getBlancas() {
        return blancas;
    }

    /**
     * @return the negras
     */
    public ArrayList<Stone> getNegras() {
        return negras;
    }
}
