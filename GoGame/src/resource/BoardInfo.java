/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author audoban
 */
public abstract class BoardInfo implements IBoardInfo {

    protected final int size;
    // representa el tamanio de los cuadros
    protected final int width;

    public BoardInfo(int size, int width) {
        this.size = size;
        this.width = width;
    }

    @Override
    public int getBoardSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Board: " + size + "x" + size;
    }
    
    public Image getResource(String resource) throws MalformedURLException {
        URL url = new URL("file", "localhost", "src/resource/"+resource);
        File file = new File(getClass().getResource(resource).getFile());
        System.out.println("resource.BoardInfo.getResource()" + getClass().getResource(resource).getFile());
        return Toolkit.getDefaultToolkit().getImage("resource/"+resource);
    }
}
