/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import ReportClasses.ReportCasesByAge;
import ReportClasses.ReportCasesByDept;
import ReportClasses.ReportCasesByMonth;
import ReportClasses.ReportCasesByMunicipio;
import ReportClasses.ReportRecovered;
import controller.CasosController;
import controller.DepartamentoController;
import controller.MunicipioController;
import java.awt.BorderLayout;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author maria
 */
public class ReportsView extends javax.swing.JFrame {
    CasosController casosCtl;
    /**
     * Creates new form Reports
     */
    public ReportsView() {
        this.casosCtl = new CasosController();
        initComponents();
        this.RefreshReportCasesByAge();
        this.RefreshReportCasesByAgeRange();
        this.RefreshReportCasesByMunicipio();
        this.RefreshReportCasesByDepartamento();
        this.RefreshReportCasesByMonth();
        this.RefreshReportCasesByRecovered();
    }
    
    private void RefreshReportCasesByAge(){
        LinkedList<ReportCasesByAge> report = casosCtl.ListCasesByAge();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        report.forEach(record -> {
            dataset.setValue(record.getAmountOfCases(),"Covid cases", record.getAge());
        });
        JFreeChart chart = ChartFactory.createLineChart(
                "Covid cases by age",
                "Age", "Cases",
                dataset, 
                PlotOrientation.VERTICAL,
                true,true,false);
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpCasesByAge.setLayout(new java.awt.BorderLayout());
        jpCasesByAge.add(panel, BorderLayout.CENTER);
        jpCasesByAge.validate();
    }
    
    private void RefreshReportCasesByAgeRange(){
        LinkedList<ReportCasesByAge> report = casosCtl.ListCasesByAgeRange();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        report.forEach(record -> {
            dataset.setValue(record.getAmountOfCases(),"Covid cases", record.getAge());
        });
        JFreeChart chart = ChartFactory.createLineChart(
                "Covid cases by age range",
                "Age range", "Cases",
                dataset, 
                PlotOrientation.VERTICAL,
                true,true,false);
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpCasesAgeRange.setLayout(new java.awt.BorderLayout());
        jpCasesAgeRange.add(panel, BorderLayout.CENTER);
        jpCasesAgeRange.validate();
    }
    
    private void RefreshReportCasesByMunicipio(){
        LinkedList<ReportCasesByMunicipio> report = casosCtl.ListCasesByMun();
        DefaultPieDataset dataset = new DefaultPieDataset();
        report.forEach(record -> {
            dataset.setValue(record.getMunicipio(),record.getAmountCases());
        });
        JFreeChart chart = ChartFactory.createPieChart("Covid cases by Municipio", dataset, true, true, true);
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpCasesMunicipio.setLayout(new java.awt.BorderLayout());
        jpCasesMunicipio.add(panel, BorderLayout.CENTER);
        jpCasesMunicipio.validate();
    }
    
    private void RefreshReportCasesByDepartamento(){
        LinkedList<ReportCasesByDept> report = casosCtl.ListCasesByDepartamento();
        DefaultPieDataset dataset = new DefaultPieDataset();
        report.forEach(record -> {
            dataset.setValue(record.getDepartamento(),record.getAmountCases());
        });
        JFreeChart chart = ChartFactory.createPieChart("Covid cases by Departamento", dataset, true, true, true);
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpCasesDepartament.setLayout(new java.awt.BorderLayout());
        jpCasesDepartament.add(panel, BorderLayout.CENTER);
        jpCasesDepartament.validate();
    }
    
    private void RefreshReportCasesByMonth(){
        LinkedList<ReportCasesByMonth> report = casosCtl.ListCasesByMonth();
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        report.forEach(record -> {
            dataset.setValue(record.getAmountCases(),"Covid cases", record.getMonth());
        });
        JFreeChart chart = ChartFactory.createBarChart(
                "Covid cases by month",
                "Month", "Amount of Cases",
                dataset, 
                PlotOrientation.VERTICAL,
                true,true,false);
        
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpCasesMonth.setLayout(new java.awt.BorderLayout());
        jpCasesMonth.add(panel, BorderLayout.CENTER);
        jpCasesMonth.validate();
    }
    private void RefreshReportCasesByRecovered(){
        LinkedList<ReportRecovered> report = casosCtl.ListRecovered();
        DefaultPieDataset dataset = new DefaultPieDataset();
        report.forEach(record -> {
            dataset.setValue(record.getRecoverStatus(),record.getAmountOfRecovered());
        });
        JFreeChart chart = ChartFactory.createPieChart("Recovered status after covid", dataset, true, true, true);
        ChartPanel panel = new ChartPanel(chart);
        panel.setMouseWheelEnabled(true);
        jpRecovered.setLayout(new java.awt.BorderLayout());
        jpRecovered.add(panel, BorderLayout.CENTER);
        jpRecovered.validate();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jpCasesByAge = new javax.swing.JPanel();
        BtnExportCasesAge = new javax.swing.JButton();
        jpCasesAgeRange = new javax.swing.JPanel();
        BtnExportCasesAgeRange = new javax.swing.JButton();
        jpCasesMunicipio = new javax.swing.JPanel();
        BtnExportCasesMun = new javax.swing.JButton();
        jpCasesDepartament = new javax.swing.JPanel();
        BtnExportCasesDept = new javax.swing.JButton();
        jpCasesMonth = new javax.swing.JPanel();
        BtnExportCasesMonth = new javax.swing.JButton();
        jpRecovered = new javax.swing.JPanel();
        BtnExportRecoveredReport = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnExportCasesAge.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportCasesAge.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportCasesAge.setText("Export data to excel");
        BtnExportCasesAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportCasesAgeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCasesByAgeLayout = new javax.swing.GroupLayout(jpCasesByAge);
        jpCasesByAge.setLayout(jpCasesByAgeLayout);
        jpCasesByAgeLayout.setHorizontalGroup(
            jpCasesByAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCasesByAgeLayout.createSequentialGroup()
                .addGap(0, 578, Short.MAX_VALUE)
                .addComponent(BtnExportCasesAge, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCasesByAgeLayout.setVerticalGroup(
            jpCasesByAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCasesByAgeLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(BtnExportCasesAge)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cases by Age", jpCasesByAge);

        BtnExportCasesAgeRange.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportCasesAgeRange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportCasesAgeRange.setText("Export data to excel");
        BtnExportCasesAgeRange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportCasesAgeRangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCasesAgeRangeLayout = new javax.swing.GroupLayout(jpCasesAgeRange);
        jpCasesAgeRange.setLayout(jpCasesAgeRangeLayout);
        jpCasesAgeRangeLayout.setHorizontalGroup(
            jpCasesAgeRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCasesAgeRangeLayout.createSequentialGroup()
                .addGap(0, 578, Short.MAX_VALUE)
                .addComponent(BtnExportCasesAgeRange, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpCasesAgeRangeLayout.setVerticalGroup(
            jpCasesAgeRangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCasesAgeRangeLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BtnExportCasesAgeRange)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cases by Age Range", jpCasesAgeRange);

        BtnExportCasesMun.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportCasesMun.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportCasesMun.setText("Export data to excel");
        BtnExportCasesMun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportCasesMunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCasesMunicipioLayout = new javax.swing.GroupLayout(jpCasesMunicipio);
        jpCasesMunicipio.setLayout(jpCasesMunicipioLayout);
        jpCasesMunicipioLayout.setHorizontalGroup(
            jpCasesMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCasesMunicipioLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(BtnExportCasesMun, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCasesMunicipioLayout.setVerticalGroup(
            jpCasesMunicipioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCasesMunicipioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BtnExportCasesMun)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cases by Municipio", jpCasesMunicipio);

        BtnExportCasesDept.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportCasesDept.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportCasesDept.setText("Export data to excel");
        BtnExportCasesDept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportCasesDeptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCasesDepartamentLayout = new javax.swing.GroupLayout(jpCasesDepartament);
        jpCasesDepartament.setLayout(jpCasesDepartamentLayout);
        jpCasesDepartamentLayout.setHorizontalGroup(
            jpCasesDepartamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCasesDepartamentLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(BtnExportCasesDept, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCasesDepartamentLayout.setVerticalGroup(
            jpCasesDepartamentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCasesDepartamentLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(BtnExportCasesDept)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cases by Department", jpCasesDepartament);

        BtnExportCasesMonth.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportCasesMonth.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportCasesMonth.setText("Export data to excel");
        BtnExportCasesMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportCasesMonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCasesMonthLayout = new javax.swing.GroupLayout(jpCasesMonth);
        jpCasesMonth.setLayout(jpCasesMonthLayout);
        jpCasesMonthLayout.setHorizontalGroup(
            jpCasesMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCasesMonthLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(BtnExportCasesMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpCasesMonthLayout.setVerticalGroup(
            jpCasesMonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCasesMonthLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(BtnExportCasesMonth)
                .addContainerGap(346, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cases by month", jpCasesMonth);

        BtnExportRecoveredReport.setBackground(new java.awt.Color(173, 255, 47));
        BtnExportRecoveredReport.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnExportRecoveredReport.setText("Export data to excel");
        BtnExportRecoveredReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportRecoveredReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpRecoveredLayout = new javax.swing.GroupLayout(jpRecovered);
        jpRecovered.setLayout(jpRecoveredLayout);
        jpRecoveredLayout.setHorizontalGroup(
            jpRecoveredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpRecoveredLayout.createSequentialGroup()
                .addContainerGap(568, Short.MAX_VALUE)
                .addComponent(BtnExportRecoveredReport, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpRecoveredLayout.setVerticalGroup(
            jpRecoveredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpRecoveredLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(BtnExportRecoveredReport)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Recovered cases", jpRecovered);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Reports");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnExportCasesAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportCasesAgeActionPerformed
    LinkedList<ReportCasesByAge> report = casosCtl.ListCasesByAge();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Cases by age");
    String[] headers = new String[]{
        "Age",
        "Amount of cases"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountOfCases();
    String age = report.get(i).getAge();
    row.createCell(0).setCellValue(age);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByAgeReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
    JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    }//GEN-LAST:event_BtnExportCasesAgeActionPerformed

    private void BtnExportCasesAgeRangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportCasesAgeRangeActionPerformed
        LinkedList<ReportCasesByAge> report = casosCtl.ListCasesByAgeRange();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Cases by age in range");
    String[] headers = new String[]{
        "Age range",
        "Amount of cases"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountOfCases();
    String ageRange = report.get(i).getAge();
    row.createCell(0).setCellValue(ageRange);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByAgeRangeReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
    JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    }//GEN-LAST:event_BtnExportCasesAgeRangeActionPerformed

    private void BtnExportCasesMunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportCasesMunActionPerformed
    LinkedList<ReportCasesByMunicipio> report = casosCtl.ListCasesByMun();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Cases by municipio");
    String[] headers = new String[]{
        "Municipio",
        "Amount of cases"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountCases();
    String municipio = report.get(i).getMunicipio();
    row.createCell(0).setCellValue(municipio);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByMunicipioReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
        JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    }//GEN-LAST:event_BtnExportCasesMunActionPerformed

    private void BtnExportCasesDeptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportCasesDeptActionPerformed
    LinkedList<ReportCasesByDept> report = casosCtl.ListCasesByDepartamento();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Cases by department");
    String[] headers = new String[]{
        "Department",
        "Amount of cases"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountCases();
    String departamento = report.get(i).getDepartamento();
    row.createCell(0).setCellValue(departamento);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByDepartmentReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
        JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    
    }//GEN-LAST:event_BtnExportCasesDeptActionPerformed

    private void BtnExportCasesMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportCasesMonthActionPerformed
    LinkedList<ReportCasesByMonth> report = casosCtl.ListCasesByMonth();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Cases by month");
    String[] headers = new String[]{
        "Month",
        "Amount of cases"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountCases();
    String month = report.get(i).getMonth();
    row.createCell(0).setCellValue(month);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByMonthReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
        JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    
    }//GEN-LAST:event_BtnExportCasesMonthActionPerformed

    private void BtnExportRecoveredReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportRecoveredReportActionPerformed
        LinkedList<ReportRecovered> report = casosCtl.ListRecovered();    
    HSSFWorkbook book = new HSSFWorkbook();
    HSSFSheet sheet = book.createSheet("Recovered Status");
    String[] headers = new String[]{
        "Recovered status",
        "Amount of people"
    };  
    CellStyle headerCellStyle = book.createCellStyle();
    HSSFFont font = book.createFont();
    font.setBold(true);
    headerCellStyle.setFont(font);
    HSSFRow headersRow = sheet.createRow(0);
    for (int i = 0; i < headers.length; i++) {
        String header = headers[i];
        HSSFCell cell = headersRow.createCell(i);
        cell.setCellStyle(headerCellStyle);
        cell.setCellValue(header);
    }   
    for (int i = 0; i < report.size(); i++) {
    HSSFRow row = sheet.createRow(i+1);
    Integer amountOfCases = report.get(i).getAmountOfRecovered();
    String recoverStatus = report.get(i).getRecoverStatus();
    row.createCell(0).setCellValue(recoverStatus);
    row.createCell(1).setCellValue(amountOfCases);
    }   
           
    try (FileOutputStream file = new FileOutputStream("CasesByRecoveredReport.xls")) {
        book.write(file);
    } catch (FileNotFoundException  ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(ReportsView.class.getName()).log(Level.SEVERE, null, ex);
    }
        JOptionPane.showMessageDialog(this, "The excel file has been created sucessfully");
    
    }//GEN-LAST:event_BtnExportRecoveredReportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportsView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExportCasesAge;
    private javax.swing.JButton BtnExportCasesAgeRange;
    private javax.swing.JButton BtnExportCasesDept;
    private javax.swing.JButton BtnExportCasesMonth;
    private javax.swing.JButton BtnExportCasesMun;
    private javax.swing.JButton BtnExportRecoveredReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpCasesAgeRange;
    private javax.swing.JPanel jpCasesByAge;
    private javax.swing.JPanel jpCasesDepartament;
    private javax.swing.JPanel jpCasesMonth;
    private javax.swing.JPanel jpCasesMunicipio;
    private javax.swing.JPanel jpRecovered;
    // End of variables declaration//GEN-END:variables
}
