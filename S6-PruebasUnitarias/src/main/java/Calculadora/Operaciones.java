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
    
    public long Sumar(long num1, long num2){
        return num1+num2;
    }
        
    public long Sumar(long[] numeros){
        long resultado = 0;
        for (long numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }
    
    public long Multiplicar(long num1, long num2){
        return num1*num2;
    }
        
    public long Multiplicar(long[] numeros){
        long resultado = 1;
        for (long numero : numeros) {
            resultado *= numero;
        }
        return resultado;
    }
    public long Restar(long num1, long num2){
        return num1-num2;
    }
    public long Dividir(long num1, long num2){
        try {
            return num1/num2;
        } catch (ArithmeticException e) {
            throw e;
        }
    }
    public double Promedio(long[] numeros){
        double promedio;
        long sumatoria = 0;
        for (long numero : numeros) {
            sumatoria += numero;
        }
        promedio = this.Dividir(sumatoria, numeros.length);
        return promedio;
    }
}
