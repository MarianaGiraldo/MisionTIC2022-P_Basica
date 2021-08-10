package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
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
