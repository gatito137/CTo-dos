package connection;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class CrudMySQL extends ConnectToMySQL{
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
            JOptionPane.showMessageDialog(null, "Something has benn wrong. :( " + e);
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
            JOptionPane.showMessageDialog(null, "Something has been wrong. :( " + e);
        }
    }
    
    protected void ejecutarQuery(String query){
        try{
            this.getConnection().prepareStatement(query).executeUpdate();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Something has been wrong. :( " + e);
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