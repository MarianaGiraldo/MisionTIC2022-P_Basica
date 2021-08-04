package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import utils.db.Perseverance;


public class Parking extends Perseverance{
    
    private Integer id;
    private String code;
    private Boolean isFree;
    private String carNumber;
    private Timestamp arrived;

    public Parking() {
    }

    public Parking(Integer id, String code, Boolean isFree, String carNumber, Timestamp arrived) {
        this.id = id;
        this.code = code;
        this.isFree = isFree;
        this.carNumber = carNumber;
        this.arrived = arrived;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getIsFree() {
        return isFree;
    }

    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Timestamp getArrived() {
        return arrived;
    }

    public void setArrived(Timestamp arrived) {
        this.arrived = arrived;
    }

    @Override
    public Object get(Integer id) throws Exception {
        Parking par = null;
        
        try( Connection conn =  createConnection() ){
            String query = "SELECT p.id, p.code, p.is_free, p.car_number, p.arrived "
                    + "     FROM parking p WHERE p.id = ?";
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet result = statement.executeQuery();
            while( result.next() ){
                par = Parking.rowMapper( result );
            }
            
        }catch(Exception e){
            throw new Exception("No se puedo obtener la información del objeto id=" + id + " en la tabla departamento.");
        }
        
        return par;
    }

    @Override
    public Integer save() throws Exception {
        String query;
        
        try(Connection conn = createConnection()){
            if( this.id == null )
                query = "INSERT INTO parking (id, code, is_free, car_number, arrived) VALUES (?, ?, ?, ?, ?)";
            else
                query = "UPDATE parking SET code=?, is_free=?, car_number=?, arrived=? WHERE id=? ";
           
            PreparedStatement statement = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, this.code);
            statement.setBoolean(2, this.isFree);
            statement.setString(3, this.carNumber);
            statement.setTimestamp(4, this.arrived);
            
            if( this.id != null ){
                statement.setInt(5, this.id);
            }
            
            int rows = statement.executeUpdate();
            
            if( rows > 0 ){
                ResultSet generateKeys = statement.getGeneratedKeys();
                if( generateKeys.next() )
                    this.id = generateKeys.getInt(1);
            }
                    
        } catch(Exception e){
            e.printStackTrace();
            throw new Exception("Error al crear/editar el registro en la tabla parking");
        }
        
        return this.id;
    }

    @Override
    public Integer delete() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public static Parking rowMapper(ResultSet result) throws SQLException{
        return new Parking(
                result.getInt("id"), 
                result.getString("code"), 
                result.getBoolean("is_free"), 
                result.getString("car_number"), 
                result.getTimestamp("arrived"));
    }
    
}
