/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasb;

import Classes.clsCuenta;

/**
 *
 * @author maria
 */
public class CuentasB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsCuenta cuentaMariana = new clsCuenta();
        clsCuenta cuentaGabriela = new clsCuenta();
        
        cuentaMariana.abonar(20000);
        cuentaMariana.retirar(2000);
        System.out.println("Saldo de Mariana: " +cuentaMariana.verSaldoCuenta());
        
        cuentaGabriela.abonar(15000);
        System.out.println("Saldo de Gabriela:" +cuentaGabriela.verSaldoCuenta());
        
    }
    
}
