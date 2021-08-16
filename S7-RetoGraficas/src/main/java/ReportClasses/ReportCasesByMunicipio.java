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
public class ReportCasesByMunicipio {
    private Integer amountCases;
    private String municipio;

    public ReportCasesByMunicipio() {
    }

    public ReportCasesByMunicipio(Integer amountCases, String municipio) {
        this.amountCases = amountCases;
        this.municipio = municipio;
    }
    
    
    public Integer getAmountCases() {
        return amountCases;
    }

    public void setAmountCases(Integer amountCases) {
        this.amountCases = amountCases;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
}
