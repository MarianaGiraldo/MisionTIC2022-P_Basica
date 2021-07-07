/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;

import java.util.Random;

/**
 *
 * @author maria
 */
public class clsDado {
    private Random lanzarAleatorio = new Random();
    private int valor;
    private int size;

    public clsDado(int size) {
        this.size = size;
    }
    
    public int lanzar(){
        valor =1+ lanzarAleatorio.nextInt(size);
        return valor;
    }
    public int obtenerValor(){
        return valor;
    }
    
    
}
