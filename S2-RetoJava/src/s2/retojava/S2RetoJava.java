/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2.retojava;

import Classes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class S2RetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Employee> empleados = new ArrayList<>();
        
        boolean firstTime = true;
        boolean runSowfware = true;
        Scanner sc = new Scanner(System.in);
        String companyName = null;
        Position administrativo = new Position("Administrativo", "Nivel alto en jerarquía");
        List<Position> allSubPositions = new ArrayList<>();
        Company company = new Company();
        
        while(runSowfware){
            if( firstTime ){
                firstTime = false;
                System.out.print("Ingrese el nombre de la Empresa: ");
                companyName = sc.nextLine();
                System.out.print("Ingrese el NIT de la Empresa: ");
                String nit = sc.nextLine();
                System.out.print("Ingrese la dirección de la Empresa: ");
                String address = sc.nextLine();
                company = new Company(companyName, nit, address, empleados);
                
            } else {
                System.out.println("\n------Ingresando datos para la empresa "+ companyName + "------");
                System.out.print("¿Desea ingresar datos para otra empresa? (True or False): ");
                boolean optionNew = sc.nextBoolean();
                    sc.nextLine();
                if (optionNew == true){
                    firstTime = true;
                    continue;
                }
                System.out.println("Presione enter para continuar");
                new Scanner(System.in).nextLine();
            }
            if(empleados.isEmpty()){
                System.out.print("¿Cuántos empleados necesita añadir? ");
                int numEmployees = sc.nextInt();
                sc.nextLine();
                if (allSubPositions.isEmpty()){
                        Position cargo = company.createPosition(allSubPositions);
                    }
                for(int i =1; i<= numEmployees; i++){
                    System.out.println("---Empleado "+i +" ---");
                        System.out.println("Estos son los cargos añadidos: ");
                        int j = 0;
                        for(j = 0; j< allSubPositions.size(); j++){
                            System.out.println((j+1)+ ".Cargo: " + allSubPositions.get(j).getPositionName());
                        }
                        System.out.print((j+1) +"¿Desea añadir un nuevo cargo? (True or False): ");
                        boolean newPosition = sc.nextBoolean();
                        sc.nextLine();
                        if (newPosition){
                            Position cargo = company.createPosition(allSubPositions);
                            Employee empleado = company.createEmployee(company, cargo);
                            continue;
                        }
                        System.out.println("\nEstos son los cargos disponibles: ");
                        
                        for(j = 0; j< allSubPositions.size(); j++){
                            System.out.println((j+1)+ ".Cargo: " + allSubPositions.get(j).getPositionName());
                        }
                        System.out.print("\nDigite el número del cargo del empleado: ");
                        int optionPosition = sc.nextInt();
                        sc.nextLine();
                        Position cargo = allSubPositions.get(0); //Inicializar cargo
                        //Asignar cargo según la opción
                        for(j = 0; j< allSubPositions.size(); j++){
                            int option = j+1;
                            if (optionPosition==option)
                                cargo= allSubPositions.get(j);
                        }
                        Employee empleado = company.createEmployee(company, cargo);
                    
                }
            }
            
            System.out.println("Opciones:\n 1.Agregar empleados administradores. \n 2.Agregar empleados(no admin). \n 3.Ver lista completa de empleados. \n 4.Añadir cliente. \n 5.Ver lista de clientes. \n 6.Salir. ");
            System.out.print("Opción: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch(option){
                case 1 -> {
                    System.out.println("");
                    AdminEmployee admin = company.createAdminEmployee(company, administrativo);
                    int e =1;
                    System.out.println("\nLista de todos los empleados");
                    for(Employee employee : empleados){
                        System.out.println(e+". Empleado: "+ employee.getAllName());
                        e++;
                    }
                    System.out.print("\n¿Cuántos empleados desea agregar como subordinados al administrador? ");
                    int numSubEmployees = sc.nextInt();
                    sc.nextLine();
                    if (numSubEmployees>empleados.size()){
                        System.out.println("El número es mayor a los empleados disponibles"); 
                        continue;
                    }
                    for(int j=0; j < numSubEmployees; j++){
                        System.out.print("\nDigite el numero del empleado a añadir: ");
                        int employee = sc.nextInt();
                        Employee subemployee = empleados.get(employee-1);
                        admin.addSubEmployee(subemployee.getAllName());
                        System.out.println("-Empleado añadido-");
                    }
                    System.out.println("\n--Empleado Administrador creado--\n");
                }
                case 2 ->{
                    System.out.println("\nEstos son los cargos añadidos: ");
                        int j = 0;
                        for(j = 0; j< allSubPositions.size(); j++){
                            System.out.println((j+1)+ ".Cargo: " + allSubPositions.get(j).getPositionName());
                        }
                        System.out.print((j+1) +"¿Desea añadir un nuevo cargo? (True or False): ");
                        boolean newPosition = sc.nextBoolean();
                        sc.nextLine();
                        if (newPosition){
                            Position cargo = company.createPosition(allSubPositions);
                            Employee empleado = company.createEmployee(company, cargo);
                            continue;
                        }
                        System.out.println("\nEstos son los cargos disponibles: ");
                        
                        for(j = 0; j< allSubPositions.size(); j++){
                            System.out.println((j+1)+ ".Cargo: " + allSubPositions.get(j).getPositionName());
                        }
                        System.out.print("\nDigite el número del cargo del empleado: ");
                        int optionPosition = sc.nextInt();
                        sc.nextLine();
                        Position cargo = allSubPositions.get(0); //Inicializar cargo
                        //Asignar cargo según la opción
                        for(j = 0; j< allSubPositions.size(); j++){
                            option = j+1;
                            if (optionPosition==option)
                                cargo= allSubPositions.get(j);
                        }
                        Employee empleado = company.createEmployee(company, cargo);
                        System.out.println("--Empleado creado--\n");
                    }
                case 3 ->{
                    int e =1;
                    System.out.println("\nLista de todos los empleados");
                    for(Employee employee : company.getEmployeesList()){
                        System.out.println(e+". Empleado: "+ employee.getAllName());
                        e++;
                    }
                    System.out.println("");
                }
                case 4 ->{
                    System.out.println("");
                    company.createCustomer(company.getCustomersList());
                    System.out.println("");
                }
                case 5 ->{
                    int e =1;
                    System.out.println("\nLista de todos los cliente");
                    for(Customer customer : company.getCustomersList()){
                        System.out.println(e+". Cliente: "+ customer.getAllName());
                        e++;
                    }
                    System.out.println("");
                }
                case 6 ->{runSowfware = false;}
            }
        }
    }
}
