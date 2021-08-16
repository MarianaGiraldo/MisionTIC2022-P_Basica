package Models;

import ReportClasses.ReportCasesByAge;
import ReportClasses.ReportCasesByDept;
import ReportClasses.ReportCasesByMonth;
import ReportClasses.ReportCasesByMunicipio;
import ReportClasses.ReportRecovered;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import utils.db.Perseverance;


public class GeneralModel extends Perseverance{

    
    public List<Departamento> getDepartamentoList(){
        List<Departamento> depList = new ArrayList();
        
        try(Connection conn = super.createConnection()){
            String query = "SELECT dep.id, dep.nombre, dep.codigo FROM departamento dep order by dep.codigo";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while( result.next() ){
                Departamento dep = new Departamento();
                dep.setId( result.getInt("id") );
                dep.setNombre( result.getString("nombre") );
                dep.setCodigo( result.getInt("codigo") );
                depList.add( dep );
            }
        } catch(Exception e){
            System.out.println("No se puede cargar la lista de Departamento");
        }
        
        return depList;
    }
    
    public List<Municipio> getMunicipioList(){
        List<Municipio> munList = new ArrayList();
        Departamento dep = new Departamento();
        try(Connection conn = super.createConnection()){
            String query = "SELECT id, departamento_id , nombre, codigo FROM municipio order by codigo";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            
            while( result.next() ){
                Municipio mun = new Municipio();
                mun.setId( result.getInt("id") );
                int depId =result.getInt("departamento_id");
                dep = dep.get(depId);
                mun.setDepartamento(dep);
                mun.setNombre( result.getString("nombre") );
                mun.setCodigo( result.getInt("codigo") );
                munList.add( mun );
            }
        } catch(Exception e){
            System.out.println("No se puede cargar la lista de Municipios");
        }
        
        return munList;
    }
    
    public LinkedList<ReportCasesByAge> ListCasesByAge(){
        LinkedList<ReportCasesByAge> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT COUNT(id), edad FROM `casos` GROUP BY edad ORDER BY edad";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportCasesByAge record = new ReportCasesByAge(result.getInt(1),result.getString(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    
    public LinkedList<ReportCasesByAge> ListCasesByAgeRange(){
        LinkedList<ReportCasesByAge> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT COUNT(t.id), t.RangoEdad FROM "
                    + "( SELECT casos.id, "
                    + "CASE "
                    + " WHEN casos.edad >= 0 AND casos.edad < 10 THEN '0-9' "
                    + " WHEN casos.edad >= 10 AND casos.edad < 20 THEN '10-19' "
                    + " WHEN casos.edad >= 20 AND casos.edad < 30 THEN '20-29' "
                    + " WHEN casos.edad >= 30 AND casos.edad < 40 THEN '30-39' "
                    + "  WHEN casos.edad >= 40 AND casos.edad < 50 THEN '40-49' "
                    + " WHEN casos.edad >= 50 AND casos.edad < 60 THEN '50-59' "
                    + " WHEN casos.edad >= 60 AND casos.edad < 70 THEN '60-69' "
                    + " WHEN casos.edad >= 70 AND casos.edad < 80 THEN '70-79' "
                    + " WHEN casos.edad >= 80 AND casos.edad < 90 THEN '80-99' "
                    + " ELSE '90-99' END AS RangoEdad "
                    + " FROM casos) t "
                    + " GROUP BY t.RangoEdad  ORDER BY t.RangoEdad " ;
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportCasesByAge record = new ReportCasesByAge(result.getInt(1),result.getString(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    
    public LinkedList<ReportCasesByMunicipio> ListCasesByMunicipio(){
        LinkedList<ReportCasesByMunicipio> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT COUNT(c.id), m.nombre FROM `casos` c "
                    + " INNER JOIN municipio m ON c.municipio_id = m.id "
                    + " GROUP BY c.municipio_id";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportCasesByMunicipio record = new ReportCasesByMunicipio(result.getInt(1),result.getString(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    
    public LinkedList<ReportCasesByDept> ListCasesByDepartamento(){
        LinkedList<ReportCasesByDept> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT COUNT(c.id), d.nombre FROM `casos` c "
                    + " INNER JOIN municipio m ON c.municipio_id = m.id "
                    + " INNER JOIN departamento d ON m.departamento_id = d.id "
                    + " GROUP BY d.id";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportCasesByDept record = new ReportCasesByDept(result.getInt(1),result.getString(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    
    public LinkedList<ReportCasesByMonth> ListCasesByMonth(){
        LinkedList<ReportCasesByMonth> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT COUNT(id), date_format(fecha_notificacion, '%M') "
                    + " from casos group by date_format(fecha_notificacion, '%M') "
                    + " ORDER BY MONTH(fecha_notificacion)";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportCasesByMonth record = new ReportCasesByMonth(result.getInt(1),result.getString(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    
    public LinkedList<ReportRecovered> ListByRecovered(){
        LinkedList<ReportRecovered> report = new LinkedList<>();
        try(Connection conn = super.createConnection()){
            String query = "SELECT recuperado, COUNT(recuperado) from casos "
                    + " GROUP BY recuperado";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet result = statement.executeQuery(query);
            while (result.next()){
                ReportRecovered record = new ReportRecovered(result.getString(1),result.getInt(2));
                report.add(record);
           }
           return report;
       }catch (SQLException e) {
           System.err.println("Error: "+ e.getMessage());
           return report;
       }
    }
    @Override
    public Object get(Integer id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer save() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
