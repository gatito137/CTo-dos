package connection;

import java.sql.*;
import cache.Cache;

public class ConnectToMySQL {
    private final Cache cache = new Cache();
    
    private Connection testConnection(){
        if(cache.getConnection() != null){
            try{
                cache.getConnection().prepareStatement("select 1");
            }catch(SQLException e){
                cache.setConnection(null);
            }
        }
        
        return cache.getConnection();
    }
    
    protected Connection getConnection(){
        if(testConnection() == null){
            try{
                String url = "jdbc:mysql://remotemysql.com:3306/0gr50OWTph";
                String user = "0gr50OWTph";
                String pass = "ixbIlUDKfe";
                
                cache.setConnection(DriverManager.getConnection(url, user, pass));
            }catch(SQLException e){}
        }
        
        return cache.getConnection();
    }
}