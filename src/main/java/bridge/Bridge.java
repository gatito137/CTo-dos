package bridge;

import connection.CrudMySQL;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class Bridge extends CrudMySQL{
    public DefaultTableModel getTable(DefaultTableModel newTable, String query){
        return getTabla(newTable, query);
    }
    
    public void getList(JComboBox List, String query){
        this.getLista(List, query);
    }
    
    public void executeQuery(String query){
        this.ejecutarQuery(query);
    }
    
    public String getValue(String query){
        return this.getCadena(query);
    }
}
