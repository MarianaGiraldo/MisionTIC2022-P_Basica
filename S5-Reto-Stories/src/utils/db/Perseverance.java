package utils.db;

import java.sql.Connection;


public abstract class Perseverance {
    private final DB db;
    
    public Perseverance() {
        db = new DB();
    }
    
    public abstract Object get(Integer id) throws Exception;
    public abstract Integer save(Object object) throws Exception;
    public abstract Boolean delete(Object object) throws Exception;
    
    public Connection createConnection(){
        return this.db.createConnection();
    }
    
}