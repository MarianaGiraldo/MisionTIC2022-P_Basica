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
public class clsCuerpoCaidaLibre {
    private double altura;

    public clsCuerpoCaidaLibre(double altura) {
        this.altura = altura;
    }

    public clsCuerpoCaidaLibre() {
    }

    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double DistanciaRecorridaXsegundo(){
        double g =9.8;
        double t = Math.sqrt((2*altura)/g);
        System.out.println("El tiempo en llegar al suelo es de "+t);
        t = Math.floor(t);
        double distancia =0;
        for(double segundo=1; segundo<=t; segundo++){
            double x = Math.pow(segundo, 2);
            distancia = g * 1/2 * x;
            System.out.println("Distancia recorrida en el segundo " + Math.round(segundo) + ": "+ distancia);
        }
        return distancia;
    }
    
    
}
