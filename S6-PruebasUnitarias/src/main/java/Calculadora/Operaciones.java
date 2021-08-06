/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

/**
 *
 * @author maria
 */
public class Operaciones {
    
    public long Suma(long num1, long num2){
        return num1+num2;
    }
        
    public long Suma(long[] numeros){
        long resultado = 0;
        for (long numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
    
    public long Multiplicacion(long num1, long num2){
        return num1*num2;
    }
        
    public long Multiplicacion(long[] numeros){
        long resultado = 1;
        for (long numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
    public long Resta(long num1, long num2){
        return num1-num2;
    }
    public long Division(long num1, long num2){
        try {
            return num1/num2;
        } catch (ArithmeticException e) {
            throw e;
        }
    }
    
}
