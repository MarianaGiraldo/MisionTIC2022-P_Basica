/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s2.retojava;

import Classes.*;
import java.util.ArrayList;
import java.util.List;

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
        
        Company company = new Company("Super Supermercados SA","918273","Cr 5 #19-85 Bogotá", empleados);
        Position cajero = new Position("Cajero", "Nivel medio en jerarquía");
        Position administrativo = new Position("Administrativo", "Nivel alto en jerarquía");
        Employee empleado1 = new Employee(1200000, cajero, company, "Jorge", "Bonilla","79243123", "jorge.bonilla@gmail.com");
        company.addEmployee(empleado1);
        
        Employee empleado2 = new Employee(1200000, cajero, company, "Luisa", "Cortés","52226456", "luisa.cortes@gmail.com");
        company.addEmployee(empleado2);
        
        List<String> cajeros = new ArrayList<>();
        cajeros.add(empleado1.getAllName());
        cajeros.add(empleado2.getAllName());
        
        AdminEmployee empleado3 = new AdminEmployee("Jefe de Cajeros", cajeros , 2000000, administrativo, company, "Raúl", "Suarez","7449862", "raulsuarez@hotmail.com");
        company.addEmployee(empleado3);
        
        System.out.println("El empleado "+ empleado3.getAllName()+ " tiene a su cargo los cajeros: " +empleado3.getSubEmployeesList());
        
        System.out.println(company.getEmployeesList());
        
        Customer cliente1 = new Customer("Avenida 9 #15-50 Funza", "31034650215", "Sara", "Martínez", "1032798564", "sarita123@outlook.com");
        Customer cliente2 = new Customer("Calle 9 #20-14 Madrid", "3127980215", "Samuel", "Mora", "1032648885", "samuelM10@gmail.com");
        Customer cliente3 = new Customer("Carrera 5 #3-25 Mosquera", "30039230215", "Paula", "Luna", "5224123", "paula_luna@yahoo.com");
        
        company.addCustomer(cliente1);
        company.addCustomer(cliente2);
        company.addCustomer(cliente3);
        
        System.out.println("La cantidad total de clientes es: " + company.getCustomersList().size());
    }
    
}
