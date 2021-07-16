/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maria
 */
public class Company {
    private String companyName;
    private String nit;
    private String address;
    private List<Employee> employeesList;
    private List<Customer> customersList;

    public Company() {
    }

    
    public Company(String companyName, String nit, String address, List<Employee> employeesList) {
        this.customersList = new ArrayList<>();
        this.companyName = companyName;
        this.nit = nit;
        this.address = address;
        this.employeesList = employeesList;
    }


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeesList() {
        return employeesList;
    }

    public void setEmployeesList(List<Employee> employeesList) {
        this.employeesList = employeesList;
    }
    
    public void addEmployee(Employee employee){
        this.employeesList.add(employee);
    }   
    public void removeEmployee(Employee employee){
        this.employeesList.remove(employee);
    }
    
    public void addCustomer(Customer customer){
        this.getCustomersList().add(customer);
    }
    
    public void removeCustomer(Customer customer){
        this.getCustomersList().remove(customer);
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }
    
    public Employee createEmployee(Company company, Position cargo){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese el número de documento del empleado: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el email del empleado: ");
        String email = sc.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        int salario = sc.nextInt();
        sc.nextLine();
        Employee empleado = new Employee(salario, cargo, company, nombre, apellido, id, email);
        addEmployee(empleado);
        return empleado;
    }
    
    public AdminEmployee createAdminEmployee(Company company, Position cargo){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese el número de documento del empleado: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el email del empleado: ");
        String email = sc.nextLine();
        System.out.print("Ingrese el salario del empleado: ");
        int salario = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la categoría del empleado Administrador: ");
        String categoria = sc.nextLine();
        List<String> subEmployeesList = new ArrayList<>();
        AdminEmployee empleado = new AdminEmployee(categoria, subEmployeesList, salario, cargo, company, nombre, apellido, id, email);
        addEmployee(empleado);
        return empleado;
    }
    
    public Position createPosition(List allSubPositions){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el cargo del empleado: ");
        String cargo1 = sc.nextLine();
        System.out.print("Ingrese el nivel jerárquico del cargo: ");
        String hLevel = sc.nextLine();
        Position cargo = new Position(cargo1,hLevel);
        allSubPositions.add(cargo);
        return cargo;
    }
    
    public Customer createCustomer(List customersList){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del cliente: ");
        String name = sc.nextLine();
        System.out.print("Ingrese el apellido del cliente: ");
        String lastname = sc.nextLine();
        System.out.print("Ingrese el número de documento del cliente: ");
        String id = sc.nextLine();
        System.out.print("Ingrese el email del cliente: ");
        String email = sc.nextLine();
        System.out.print("Ingrese la dirección del cliente: ");
        String address = sc.nextLine();
        System.out.print("Ingrese el celular del cliente: ");
        String phone = sc.nextLine();
        Customer customer = new Customer(address, phone, name, lastname, id, email);
        addCustomer(customer);
        return customer;
    }
    
}
