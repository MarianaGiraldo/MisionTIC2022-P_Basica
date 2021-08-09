package utils.db;

import java.sql.Connection;


public abstract class Perseverance {
    private final DB db;
    
    public Perseverance() {
        db = new DB();
    }
    
    public abstract Object get(Integer id) throws Exception;
    public abstract Integer save() throws Exception;
    public abstract Integer delete() throws Exception;
    
    public Connection createConnection(){
        return this.db.createConnection();
    }
    
    public Connection createDBTesting(){
        return this.db.startTestDB();
    }
    
}