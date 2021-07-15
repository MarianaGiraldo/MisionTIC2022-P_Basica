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
    private double numero1;
    private double numero2;

    public clsCalculadora() {
    }
    
    public clsCalculadora(String operador, double numero1, double numero2){
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

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double Sumar(){
        return (this.numero1 + this.numero2);
    }
    
    public double Restar(){
        return (this.numero1 - this.numero2);
    }
    public double Multiplicar(){
        return (this.numero1 * this.numero2);
    }
    public double Dividir(){
        return (this.numero1 / this.numero2);
    }
    
    public void Calcular(){
        if("+".equals(this.operador)){
            double resultado = Sumar();
            System.out.println("El resultado de la suma entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("-".equals(this.operador)){
            double resultado = Restar();
            System.out.println("El resultado de la resta entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("*".equals(this.operador)){
            double resultado = Multiplicar();
            System.out.println("El resultado de la multiplicación entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
        if("/".equals(this.operador)){
           double resultado = Dividir();
           System.out.println("El resultado de la división entre "+ this.numero1 +" y "+ this.numero2+ " es igual a " + resultado);
        }
    }
}
