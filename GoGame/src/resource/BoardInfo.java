/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

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
}
