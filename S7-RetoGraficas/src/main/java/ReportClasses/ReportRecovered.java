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
public class ReportRecovered {
    private String recoverStatus;
    private Integer amountOfRecovered;

    public ReportRecovered() {
    }

    public ReportRecovered(String recoverStatus, Integer amountOfRecovered) {
        this.recoverStatus = recoverStatus;
        this.amountOfRecovered = amountOfRecovered;
    }
    
    
    public String getRecoverStatus() {
        return recoverStatus;
    }

    public void setRecoverStatus(String recoverStatus) {
        this.recoverStatus = recoverStatus;
    }

    public Integer getAmountOfRecovered() {
        return amountOfRecovered;
    }

    public void setAmountOfRecovered(Integer amountOfRecovered) {
        this.amountOfRecovered = amountOfRecovered;
    }
    
}
