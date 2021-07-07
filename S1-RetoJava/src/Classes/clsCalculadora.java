/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author maria
 */
public class clsCalculadora {

    private String operador;
    private int numero1;
    private int numero2;
    
    public clsCalculadora(String operador, int numero1, int numero2){
        this.operador = operador;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int Sumar(){
        return (this.numero1 + this.numero2);
    }
    
    public int Restar(){
        return (this.numero1 - this.numero2);
    }
    public int Multiplicar(){
        return (this.numero1 * this.numero2);
    }
    public int Dividir(){
        return (this.numero1 / this.numero2);
    }
    
    public void Calcular(){
        if("+".equals(this.operador)){
            int resultado = Sumar();
            System.out.println("El resultado de la suma entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("-".equals(this.operador)){
            int resultado = Restar();
            System.out.println("El resultado de la resta entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("*".equals(this.operador)){
            int resultado = Multiplicar();
            System.out.println("El resultado de la multiplicación entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("/".equals(this.operador)){
           int resultado = Dividir();
           System.out.println("El resultado de la división entre "+ this.numero1 +" y "+ this.numero2+ "es igual a " + resultado);
        }
    }
}
