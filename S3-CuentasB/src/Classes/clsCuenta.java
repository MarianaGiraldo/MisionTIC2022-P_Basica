/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Mariana
 */
public class clsCuenta {
    private double saldo;
    private int numeroCuenta;
    private String titular;
    private String tipoCuenta;

    public clsCuenta() {
    }

    public clsCuenta(double saldo, int numeroCuenta, String titular, String tipoCuenta) {
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
    
    public double verSaldoCuenta(){
        return this.saldo;
    }
    
    public void abonar(double valor){
        this.saldo += valor;
    }
    
    public double retirar(double valor){
        saldo -= valor;
        return saldo;
    }
    
    
}
