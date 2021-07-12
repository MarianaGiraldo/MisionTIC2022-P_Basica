/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import java.util.List;

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

    
}
