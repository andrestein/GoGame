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
public interface IBoardInfo {

    /**
     * Esta funcion calcula la posicion de la ficha a partir de la fila y
     * columna
     *
     * @param r
     * @param c
     * @return Rect
     * @throws BoardLimitsException Fila o Columna fuera de los limites
     */
    public Rect getRect(int f, char c) throws BoardLimitsException;

    /**
     * Esta funcion calcula la posicion adecuada para la ficha en el tablero a
     * partir de una coordenada (x,y) cualquiera.
     *
     * @param x Coordenada x
     * @param y Coordenada y
     * @return returnara Rect con informacion de la fila, columna, (x,y)
     * normalizado o null en caso de que la ficha este fuera del tablero
     */
    public Rect getRect(int x, int y);

    public int getBoardSize();

    public String toString();
}
