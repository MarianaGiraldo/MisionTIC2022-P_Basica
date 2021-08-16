/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Models.GeneralModel;
import ReportClasses.ReportCasesByAge;
import ReportClasses.ReportCasesByDept;
import ReportClasses.ReportCasesByMonth;
import ReportClasses.ReportCasesByMunicipio;
import ReportClasses.ReportRecovered;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class CasosController {
    
    public LinkedList<ReportCasesByAge> ListCasesByAge(){
        LinkedList<ReportCasesByAge> report = new GeneralModel().ListCasesByAge();
        return report;
    }
    
    public LinkedList<ReportCasesByAge> ListCasesByAgeRange(){
        LinkedList<ReportCasesByAge> report = new GeneralModel().ListCasesByAgeRange();
        return report;
    }
    
    public LinkedList<ReportCasesByDept> ListCasesByDepartamento(){
        LinkedList<ReportCasesByDept> report = new GeneralModel().ListCasesByDepartamento();
        return report;
    }
    
    public LinkedList<ReportCasesByMunicipio> ListCasesByMun(){
        LinkedList<ReportCasesByMunicipio> report = new GeneralModel().ListCasesByMunicipio();
        return report;
    }
    
    public LinkedList<ReportCasesByMonth> ListCasesByMonth(){
        LinkedList<ReportCasesByMonth> report = new GeneralModel().ListCasesByMonth();
        return report;
    }
    public LinkedList<ReportRecovered> ListRecovered(){
        LinkedList<ReportRecovered> report = new GeneralModel().ListByRecovered();
        return report;
    }
}
