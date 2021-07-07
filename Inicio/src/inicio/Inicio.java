/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mariana
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = null;
        int edad;
        float numero;
        
        System.out.println("Hola Mundo!");
//        
//        Scanner in = new Scanner(System.in);
//        System.out.print("Ingrese su nombre: ");
//        nombre = in.nextLine();
//        System.out.println("Hola "+ nombre);
//        
//        System.out.print("Ingrese su edad: ");
//        edad = in.nextInt();
//        System.out.println(nombre + " tiene " + edad + " años");
//        
//        System.out.print("Ingrese un número random: ");
//        numero = in.nextFloat();
//        System.out.println("Su número es " + numero);
//        
        /*
        Muchas líneas
        de comentarios
        */
        
        //Condicionales
        boolean esVerdad = false;
        boolean otraPregunta =false;
        if(esVerdad){
            System.out.println("Sí es verdad...");
        }else if(otraPregunta){
            System.out.println("La otra es verdad...");
        }else{
            System.err.println("Ambas son falsas.");
        }
        
        //switch
/*        int i;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese un número del 0 al 9: ");
        i = in.nextInt();
        switch(i){
            case 0 -> System.out.println("Es cero");
            case 1 -> System.out.println("Es uno");
            case 2 -> System.out.println("Es un dos");
            default -> System.out.println("No es ni cero, ni uno, ni dos");
            
        }
        
        String letra;
        System.out.print("Ingrese una letra: ");
        Scanner in1 = new Scanner(System.in);
        letra = in1.nextLine();
        switch(letra){
            case "a" -> System.out.println("Es una a");
            case "b" -> System.out.println("Es una b");
            case "c" -> System.out.println("Es una c");
            default -> System.out.println("No es ni a, ni b, ni c");
        }
          
        String name = "Mariana";
        System.out.println(name.toLowerCase()+ " en minúscula");
        System.out.println(name.toUpperCase() + " en mayúscula");
      
        char caracter = name.charAt(0);
        System.out.println(caracter);
        
        String password = "contraseña";
        if(password.equals("contraseña")){
            System.out.println("Usuario Autorizado");
        }else{
            System.out.println("No autorizado");
        }
        //System.out.print("Nombre: ");
        //String leeNombre = System.console().readLine();
        //System.out.println(leeNombre);
        
        for(int i=0;i<5; i++){
            System.out.print(i);
        }
        System.out.println(" ");
        String palabra = "Palabras";
        char[] chars = palabra.toCharArray();
        for (char ch : chars){
            System.out.print(ch);
        }
        String s = "Techie Delight";
 
        // using simple for-loop
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println(" ");
        
        int contador = 0;
        while(contador<=10){
            System.out.println("Contador: "+ contador);
            contador++;
        }
        
        //do-while
        int otroNumero = 15;
        do{
            System.out.println(otroNumero);
            otroNumero++;
        }while(otroNumero<=20);

        
        //Array
        String array[] = {"Mariana", "Victoria", "Gabriela", "Paula"};
        System.out.println(array[0]);
        
        for (String x:array){
            System.out.println(x);
        }
        
        String[][] array2d = {
            {"A", "B", "C"},
            {"D", "E", "F"},
            {"G", "H", "I"}
        };
        System.out.println(array2d[0][1]);
        
        
        //ArrayList
        ArrayList<Integer> lista = new ArrayList<>();
        
        for (int cont=0;cont<100; cont++){
            lista.add(cont);
        }
        System.out.println(lista.size());
        
        lista.forEach(aux -> {
            System.out.print(aux+" ");
        });
        System.out.println(" ");
        
        //Maps => Diccionario
        
        Map<String,Object> diccionario = new HashMap();
        diccionario.put("nombre", "Mariana");
        diccionario.put("edad", 17);
        System.out.println(diccionario.get("nombre"));
        
        int edadDicc = (int) diccionario.get("edad");
        System.out.println(edadDicc);
        
        
        //Operaciones
        int x = (int) Math.pow(5, 2);
        System.out.println(x);
        
        int y = (int) Math.sqrt(25);
        System.out.println(y);
        
        System.out.println("PI= "+ Math.PI);
    
        
        //Operadores lógicos
        //== != <= >=   .equals
        // AND= &&
        // OR = ||
        
        if(false && false){
            System.out.println("Entró");
        }else{
            System.out.println("Falso");
        }
        if(true || false){
            System.out.println("2. Entró");
        }else{
            System.out.println("2. Falso");
        }
        
        //Random
        Random generadorNumeros = new Random();
        int aleatorio = generadorNumeros.nextInt(10);
        System.out.println(aleatorio);


        //fracciones de cadenas de string
        String holaMundo = "Hola Mundo!";
        System.out.println(holaMundo.indexOf("ola"));
        System.out.println(holaMundo.substring(0, 5));
        
        
        Scanner inp = new Scanner(System.in);
        String l = inp.nextLine();
        
        if(!holaMundo.contains(l)){
            System.out.println("No está la letra " + l);
                    
        }else{
            System.out.println("Sí está la letra "+ l);
        }

    
        //Control de errores
        int a=5;
        int b=0;
        int c;
        
        try{
            c= a/b;
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }
        
        try{
            int d =Integer.parseInt("1234");
            System.out.println("El número es: "+d);
            c =a/b;
        }catch(NumberFormatException e){
            System.out.println("No es un número");
        }catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero");
        }finally{
            System.out.println("Esto se ejecuta siempre");
        }

        try{
            float fl = Float.parseFloat("123a");
        }catch(Exception e){
            System.out.println("Atrapa todos los errores: " + e);
        }
*/
        saludar("Mariana");
        
    }
    
    public static void saludar(String nombre){
        System.out.println("Hola "+nombre);
    }
    
}
