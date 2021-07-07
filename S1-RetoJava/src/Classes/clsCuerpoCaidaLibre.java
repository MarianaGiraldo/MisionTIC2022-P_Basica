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
        double G=9.8;
        double t = Math.sqrt((2*altura)/G);
        System.out.println("El tiempo en llegar al suelo es de "+t);
        t = Math.round(t);
        double distancia = 1;
        for(double segundo=1; segundo<=t; segundo++){
            distancia = ((1/2)*G *(Math.pow(segundo, 2)));
            System.out.println("Distancia recorrida en el segundo " + segundo + ": "+ distancia);
        }
        return distancia;
    }
    
    
}
