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
public class Employee extends Person {
    private int salary;
    private Position position;
    private Company company;

    public Employee(int salary, Position position, Company company, String name, String lastname, String id, String email) {
        super(name, lastname, id, email);
        this.salary = salary;
        this.position = position;
        this.company = company;
    }

    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
    
    
    
}
