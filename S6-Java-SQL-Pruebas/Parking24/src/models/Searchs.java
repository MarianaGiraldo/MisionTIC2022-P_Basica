package models;

import java.sql.Connection;
import utils.db.Perseverance;


public class Searchs extends Perseverance{

    public void startDbTest(){
        //System.out.println("Se creo la base de datos de prueba!!!!!!!!!");
        try(Connection conn = createDBTesting()){
            // no hacer nada
        }catch(Exception e){
            e.printStackTrace();
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
