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
public class clsAutosRadar {
    private String placa;
    private double distancia1;
    private double distancia2;
    private double tiempo;
    private double gr_alcohol;

    
    public clsAutosRadar(String placa, double distancia1, double distancia2, double tiempo, double gr_alcohol) {
        this.placa = placa;
        this.distancia1 = distancia1;
        this.distancia2 = distancia2;
        this.tiempo = tiempo;
        this.gr_alcohol = gr_alcohol;
    }

    public clsAutosRadar() {
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public double getDistancia1() {
        return distancia1;
    }

    public void setDistancia1(double distancia1) {
        this.distancia1 = distancia1;
    }
    

    public double getDistancia2() {
        return distancia2;
    }

    public void setDistancia2(double distancia2) {
        this.distancia2 = distancia2;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getGr_alcohol() {
        return gr_alcohol;
    }

    public void setGr_alcohol(double gr_alcohol) {
        this.gr_alcohol = gr_alcohol;
    }
    
    public double CalcularVel(){
        double velocidad = (this.distancia2- this.distancia1)/this.tiempo;
        return velocidad;
    }
    
    public void MultarVel(){
        double velocidad = CalcularVel();
        System.out.println("La velocidad fue de: "+ velocidad + "km/h");
        if(1<= velocidad && velocidad<= 20){
            System.out.println("Llamado de atención por baja velocidad para el auto de placa "+ this.placa);
        }
        if(21<= velocidad && velocidad<= 60){
            System.out.println("Llamado de atención por Alta velocidad para el auto de placa "+ this.placa);
        }
        if(81<= velocidad && velocidad<= 120){
            System.out.println("Multa tipo I");
        }
        if(velocidad > 120){
            System.out.println("Multa tipo II e inmovilización del vehículo para el auto de placa "+ this.placa);
        }
    }
    public void MultarAlcohol(){
        double velocidad = CalcularVel();
        if (velocidad >=81){
            if (this.gr_alcohol >= 20 && this.gr_alcohol <=39 ){
                System.out.println("Alcoholemia para el auto de placa "+ this.placa + ": además de las sanciones previstas en la presente ley, se decretará la suspensión de la licencia de conducción entre seis (6) y doce (12) meses.");
            }
            if (this.gr_alcohol >= 40 && this.gr_alcohol <=99 ){
                System.out.println("Alcoholemia para el auto de placa "+ this.placa + ": Primer grado de embriaguez. Adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre uno (1) y tres (3) años.");
            }
            if (this.gr_alcohol >= 100 && this.gr_alcohol <=149 ){
                System.out.println("Alcoholemia para el auto de placa "+ this.placa + ": Segundo grado de embriaguez. Adicionalmente a la sanción multa, se decretará la suspensión de la Licencia de Conducción entre tres (3) y cinco (5) años, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de cuarenta (40) horas.");
            }
            if (this.gr_alcohol >= 150){
                System.out.println("Alcoholemia para el auto de placa "+ this.placa + ": Segundo grado de embriaguez. Adicionalmente a la sanción multa, se decretará la suspensión entre cinco (5) y diez (10) años de la Licencia de Conducción, y la obligación de realizar curso de sensibilización, conocimientos y consecuencias de la alcoholemia y drogadicción en centros de rehabilitación debidamente autorizados, por un mínimo de ochenta (80) horas.");
            }
            
        }
    }
    
}
