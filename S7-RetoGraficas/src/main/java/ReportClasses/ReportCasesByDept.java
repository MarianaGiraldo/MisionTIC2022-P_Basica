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
public class ReportCasesByDept {
    private Integer amountCases;
    private String departamento;

    public ReportCasesByDept() {
    }

    public ReportCasesByDept(Integer amountCases, String departamento) {
        this.amountCases = amountCases;
        this.departamento = departamento;
    }

        
    public Integer getAmountCases() {
        return amountCases;
    }

    public void setAmountCases(Integer amountCases) {
        this.amountCases = amountCases;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

   
}
