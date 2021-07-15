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
public class clsDistanciaRed {
    private double coord_x_cel1;
    private double coord_y_cel1;
    private double coord_x_ant1;
    private double coord_y_ant1;
    private double coord_x_Central;
    private double coord_y_Central;
    private double coord_x_ant2;
    private double coord_y_ant2;
    private double coord_x_cel2;
    private double coord_y_cel2;

    public clsDistanciaRed() {
    }

    public clsDistanciaRed(double coord_x_cel1, double coord_y_cel1, double coord_x_ant1, double coord_y_ant1, double coord_x_Central, double coord_y_Central, double coord_x_ant2, double coord_y_ant2, double coord_x_cel2, double coord_y_cel2) {
        this.coord_x_cel1 = coord_x_cel1;
        this.coord_y_cel1 = coord_y_cel1;
        this.coord_x_ant1 = coord_x_ant1;
        this.coord_y_ant1 = coord_y_ant1;
        this.coord_x_Central = coord_x_Central;
        this.coord_y_Central = coord_y_Central;
        this.coord_x_ant2 = coord_x_ant2;
        this.coord_y_ant2 = coord_y_ant2;
        this.coord_x_cel2 = coord_x_cel2;
        this.coord_y_cel2 = coord_y_cel2;
    }

    
    public double getCoord_x_cel1() {
        return coord_x_cel1;
    }

    public void setCoord_x_cel1(double coord_x_cel1) {
        this.coord_x_cel1 = coord_x_cel1;
    }

    public double getCoord_y_cel1() {
        return coord_y_cel1;
    }

    public void setCoord_y_cel1(double coord_y_cel1) {
        this.coord_y_cel1 = coord_y_cel1;
    }

    public double getCoord_x_ant1() {
        return coord_x_ant1;
    }

    public void setCoord_x_ant1(double coord_x_ant1) {
        this.coord_x_ant1 = coord_x_ant1;
    }

    public double getCoord_y_ant1() {
        return coord_y_ant1;
    }

    public void setCoord_y_ant1(double coord_y_ant1) {
        this.coord_y_ant1 = coord_y_ant1;
    }

    public double getCoord_x_Central() {
        return coord_x_Central;
    }

    public void setCoord_x_Central(double coord_x_Central) {
        this.coord_x_Central = coord_x_Central;
    }

    public double getCoord_y_Central() {
        return coord_y_Central;
    }

    public void setCoord_y_Central(double coord_y_Central) {
        this.coord_y_Central = coord_y_Central;
    }

    public double getCoord_x_ant2() {
        return coord_x_ant2;
    }

    public void setCoord_x_ant2(double coord_x_ant2) {
        this.coord_x_ant2 = coord_x_ant2;
    }

    public double getCoord_y_ant2() {
        return coord_y_ant2;
    }

    public void setCoord_y_ant2(double coord_y_ant2) {
        this.coord_y_ant2 = coord_y_ant2;
    }

    public double getCoord_x_cel2() {
        return coord_x_cel2;
    }

    public void setCoord_x_cel2(double coord_x_cel2) {
        this.coord_x_cel2 = coord_x_cel2;
    }

    public double getCoord_y_cel2() {
        return coord_y_cel2;
    }

    public void setCoord_y_cel2(double coord_y_cel2) {
        this.coord_y_cel2 = coord_y_cel2;
    }
    
    private double calcular_distancia_c1_a1(){
        double distancia_c1_a1;
        distancia_c1_a1 = (Math.sqrt((double) Math.pow(( this.coord_x_cel1- this.coord_x_ant1),2)+ (double) Math.pow((this.coord_y_cel1 - this.coord_y_ant1),2) ));
        return distancia_c1_a1;
    }
    private double calcular_distancia_a1_ch(){
        double distancia_a1_ch;
        distancia_a1_ch = (Math.sqrt((double) Math.pow(( this.coord_x_ant1- this.coord_x_Central),2)+ (double) Math.pow((this.coord_y_ant1 - this.coord_y_Central),2) ));
        return distancia_a1_ch;  
    }
    private double calcular_distancia_ch_a2(){
        double distancia_ch_a2;
        distancia_ch_a2 = (Math.sqrt((double) Math.pow(( this.coord_x_Central- this.coord_x_ant2),2)+ (double) Math.pow((this.coord_y_Central - this.coord_y_ant2),2) ));
        return distancia_ch_a2;  
    }
    private double calcular_distancia_a2_c2(){
        double distancia_a2_c2;
        distancia_a2_c2 = (Math.sqrt((double) Math.pow(( this.coord_x_ant2- this.coord_x_cel2),2)+ (double) Math.pow((this.coord_y_ant2 - this.coord_y_cel2),2) ));
        return distancia_a2_c2;  
    }
    public double calcular_distancia_total(){
        double distancia_total;
        distancia_total = calcular_distancia_c1_a1()+ calcular_distancia_a1_ch() + calcular_distancia_ch_a2() + calcular_distancia_a2_c2();
        return distancia_total;  
    }
}
