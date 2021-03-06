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
public class Rect {

    private final int x;
    private final int y;
    private final int row;
    private final char column;

    public Rect(int x, int y, int row, char column) {
        this.x = x;
        this.y = y;
        this.row = row;
        this.column = column;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the row
     */
    public int getRow() {
        return row;
    }

    /**
     * @return the column
     */
    public char getColumn() {
        return column;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ") [" + row + "x" + column + "]";
    }

    @Override
    public boolean equals(Object o) {
        Rect r = (Rect) o;
        if (r.x == x && r.y == y && r.row == row && r.column == column) {
            return true;
        }
        return false;
    }
}
