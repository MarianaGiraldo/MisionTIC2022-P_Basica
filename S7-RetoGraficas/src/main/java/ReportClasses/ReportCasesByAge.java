/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReportClasses;

/**
 *
 * @author maria
 */
public class ReportCasesByAge {
    private Integer amountOfCases;
    private String age;

    public ReportCasesByAge() {
    }

    public ReportCasesByAge(Integer amountOfCases, String age) {
        this.amountOfCases = amountOfCases;
        this.age = age;
    }
    
    public Integer getAmountOfCases() {
        return amountOfCases;
    }

    public void setAmountOfCases(Integer amountOfCases) {
        this.amountOfCases = amountOfCases;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    

}
