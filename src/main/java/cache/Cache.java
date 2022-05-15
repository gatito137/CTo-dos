package cache;

import java.sql.Connection;

public class Cache {
    private static Connection connection;
    
    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection aCn) {
        connection = aCn;
    }
}