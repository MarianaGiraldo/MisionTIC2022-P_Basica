package utils.db;

import java.sql.Connection;


public abstract class Perseverance {
    private final DB db;
    
    public Perseverance() {
        db = new DB();
    }
    
    public abstract Object get(Integer id);
    public abstract Integer save();
    public abstract Integer delete();
    
    public Connection createConnection(){
        return this.db.createConnection();
    }
    
}