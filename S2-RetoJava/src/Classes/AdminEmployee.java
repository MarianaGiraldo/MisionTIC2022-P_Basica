/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.List;

/**
 *
 * @author maria
 */
public class AdminEmployee extends Employee {
    private String category;
    private final List<String> subEmployeesList;

    public AdminEmployee(String category, List<String> subEmployeesList, int salary, Position position, Company company, String name, String lastname, String id, String email) {
        super(salary, position, company, name, lastname, id, email);
        this.category = category;
        this.subEmployeesList = subEmployeesList;
    }

    
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<String> getSubEmployeesList() {
        return subEmployeesList;
    }
    
    public void addSubEmployee(String employee){
        this.subEmployeesList.add(employee);
    }
    
    public void removeSubEmployee(String employee){
        this.subEmployeesList.remove(employee);
    }
    
    
}
