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
public class ReportCasesByMonth {
    private Integer amountCases;
    private String month;

    public ReportCasesByMonth() {
    }

    public ReportCasesByMonth(Integer amountCases, String month) {
        this.amountCases = amountCases;
        this.month = month;
    }
    
    
    public Integer getAmountCases() {
        return amountCases;
    }

    public void setAmountCases(Integer amountCases) {
        this.amountCases = amountCases;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
    
}
