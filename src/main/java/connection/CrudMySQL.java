package connection;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CrudMySQL extends ConnectToMySQL{
    private int Attemps = 0;
    
    private Boolean testAttemps(SQLException e){
        if(Attemps < 3){
            Attemps += 1;
            return true;
        }else{
            JOptionPane.showMessageDialog(null, "Somethin has been wrong. :( " + e);
            return false;
        }
    }
    
    protected DefaultTableModel getTabla(DefaultTableModel newTable, String query){
        try{
            PreparedStatement ps = getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            //Add columns
            Object[] Rows = new Object[rs.getMetaData().getColumnCount()];
            for(int i = 0; i < Rows.length; i++){
                newTable.addColumn(rs.getMetaData().getColumnName(i+1));
            }
            
            //Add rows
            while(rs.next()){
                for(int i = 0; i < Rows.length; i++){
                    Rows[i] = rs.getObject(i+1);
                }
                
                newTable.addRow(Rows);
            }
        }catch(SQLException e){
            if(testAttemps(e)){
                getTabla(newTable, query);
            }
        }
        
        return newTable;
    }
    
    protected void getLista(JComboBox List, String query){
        try{
            List.removeAllItems();
            List.addItem("");
            
            PreparedStatement ps = this.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                List.addItem(rs.getString(1));
            }
        }catch(SQLException e){
            if(testAttemps(e)){
                getLista(List, query);
            }
        }
    }
    
    protected void ejecutarQuery(String query){
        try{
            this.getConnection().prepareStatement(query).executeUpdate();
        }catch(SQLException e){
            if(testAttemps(e)){
                ejecutarQuery(query);
            }
        }
    }
    
    protected String getCadena(String query){
        try{
            PreparedStatement ps = this.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                query = rs.getString(1);
            }
            return query;
        }catch(SQLException e){
            return "";
        }
    }
}