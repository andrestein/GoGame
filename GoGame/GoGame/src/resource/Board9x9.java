/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resource;

import java.awt.Image;
import java.io.File;

/**
 * Modelo estandar de Tablero GO 9x9
 *
 * @author audoban
 */
public class Board9x9 extends BoardInfo {

    public static final String G_BOARD = "g-board.png";
    public static final String G_BLACK = "g-black.png";
    public static final String G_WHITE = "g-white.png";
    
    public Board9x9() {
        super(9, 53);
    }

    @Override
    public Rect getRect(int r, char c) throws BoardLimitsException {
        if ((r < 1 || r > 9) || (c < 'A' || c > 'I')) {
            throw new BoardLimitsException();
        }

        return new Rect(38 + (c - 65) * width, 462 - (r - 1) * width, r, c);
    }

    @Override
    public Rect getRect(int x, int y) {
        int Ry;
        int r;
        int Cx;
        char c;

        for (Ry = 462, r = 1; r <= 10; Ry -= width, r++) {
            if (r == 10) {
                return null;
            }
            if (y > Ry - 26 && y < Ry + 27) {
                break;
            }
        }
        for (Cx = 38, c = 'A'; c <= 'J'; Cx += width, c++) {
            if (c == 'J') {
                return null;
            }
            if (x > Cx - 26 && x < Cx + 27) {
                break;
            }
        }

        return new Rect(Cx, Ry, r, c);
    }
    


}
