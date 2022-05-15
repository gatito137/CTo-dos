package presentation;

import javax.swing.*;
import common.Common;
import bridge.Bridge;
import javax.swing.table.DefaultTableModel;

public class Principal extends JFrame {
    private final Common c = new Common();
    private final Bridge execute = new Bridge();
    private final addForms addForms = new addForms();
    
    public Principal() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("To dos (version 5.2)");
        
        LoadTables();
        
        c.query.delete(0, c.query.length());
        c.query.append("Select Type from Status;");
        execute.getList(txtStatus, c.query.toString());
    }
    
    private void FillTable(JTable Table, String query){
        Table.setModel(execute.getTable(new DefaultTableModel(), query));
    }
    
    private void LoadTables(){
        c.query.delete(0, c.query.length());
        c.query.append("select Code, Status, Description, Documentation, DocSent, CodeSent from Principal;");
        FillTable(tabMain, c.query.toString());
        
        c.query.delete(0, c.query.length());
        c.query.append("Select Name from Forms;");
        FillTable(tabForms, c.query.toString());
    }
    
    private void CleanControls(){
        LoadTables();
        
        txtCode.setText("");
        txtStatus.setSelectedIndex(0);
        txtDescription.setText("");
        txtDocumentation.setText("");
        txtDocSent.setSelected(false);
        txtCodeSent.setSelected(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabMain = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabForms = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtStatus = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtDocumentation = new javax.swing.JTextField();
        txtDocSent = new javax.swing.JCheckBox();
        txtCodeSent = new javax.swing.JCheckBox();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnFilter = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabMainMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabMain);

        tabForms.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabForms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabFormsMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(tabForms);

        jLabel1.setText("Code:");

        jLabel2.setText("Status:");

        jLabel3.setText("Description:");

        jLabel4.setText("Documentation:");

        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        jScrollPane3.setViewportView(txtDescription);

        txtDocSent.setText("Documentation sent");

        txtCodeSent.setText("Code sent");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnFilter.setText("Filter");
        btnFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCode, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtStatus, 0, 100, Short.MAX_VALUE)
                            .addComponent(txtDocumentation))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodeSent)
                                    .addComponent(txtDocSent))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(7, 7, 7)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFilter))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDocumentation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDocSent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodeSent)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabFormsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabFormsMousePressed
        c.query.delete(0, c.query.length());
        c.query.append("select p.Code, p.Status, p.Description, p.Documentation, p.DocSent, p.Code sent from DesignatedMethod as dm ");
        c.query.append("inner join Forms as f on f.id = dm.Form ");
        c.query.append("inner join Principal as p on dm.Task = p.id ");
        c.query.append("where f.Name = '");
        c.query.append(tabForms.getValueAt(tabForms.getSelectedRow(), 0)).append("';");
        
        FillTable(tabMain, c.query.toString());
    }//GEN-LAST:event_tabFormsMousePressed

    private void tabMainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMainMousePressed
        //Fill the table with the associated task.
        c.query.delete(0, c.query.length());
        c.query.append("select f.Name from DesignatedMethod as dm ");
        c.query.append("inner join Forms as f on f.id = dm.Form ");
        c.query.append("inner join Principal as p on p.id = dm.Task ");
        c.query.append("where p.Code = '");
        c.query.append(tabMain.getValueAt(tabMain.getSelectedRow(), 0)).append("';");
        FillTable(tabForms, c.query.toString());
        
        //Fill the controls
        txtCode.setText(tabMain.getValueAt(tabMain.getSelectedRow(), 0).toString());
        txtStatus.setSelectedItem(execute.getValue("select Type from Status where id = '" + tabMain.getValueAt(tabMain.getSelectedRow(), 1) + "';"));
        txtDescription.setText(tabMain.getValueAt(tabMain.getSelectedRow(), 2).toString());
        txtDocumentation.setText(tabMain.getValueAt(tabMain.getSelectedRow(), 3).toString());
        if(Boolean.parseBoolean(tabMain.getValueAt(tabMain.getSelectedRow(), 4).toString())){
            txtDocSent.setSelected(true);
        }else{
            txtDocSent.setSelected(false);
        }
        if(Boolean.parseBoolean(tabMain.getValueAt(tabMain.getSelectedRow(), 5).toString())){
            txtCodeSent.setSelected(true);
        }else{
            txtCodeSent.setSelected(false);
        }
    }//GEN-LAST:event_tabMainMousePressed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        CleanControls();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        txtCode.setText(c.getCleanText(txtCode.getText()));
        
        if(c.testNat(txtCode.getText()) < 0){
            JOptionPane.showMessageDialog(null, "Only naturals numbers are accepted for tasks codes.");
            return;
        }
        
        txtDescription.setText(c.getCleanText(txtDescription.getText()));
        txtDocumentation.setText(c.getCleanText(txtDocumentation.getText()));
        
        if(txtCode.getText().equals("") || c.testNat(txtCode.getText()) < 0){
            JOptionPane.showMessageDialog(null, "This is not a valid code.");
            return;
        }
        if(txtStatus.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "You must select a valid status.");
            return;
        }
        
        //Check if the code should be updated or added.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from Principal where Code ='");
        c.query.append(txtCode.getText()).append("';");
        if(execute.getValue(c.query.toString()).equals("0")){
            //Add the data.
            c.query.delete(0, c.query.length());
            c.query.append("insert into Principal(Code, Status, Description, Documentation, DocSent, CodeSent) values ('");
            c.query.append(txtCode.getText()).append("', '");
            c.query.append(execute.getValue("select id from Status where Type = '" + txtStatus.getSelectedItem() + "';")).append("', '");
            c.query.append(txtDescription.getText()).append("', '");
            c.query.append(txtDocumentation.getText()).append("', '");
            if(txtDocSent.isSelected()){
                c.query.append(1).append("', '");
            }else{
                c.query.append(0).append("', '");
            }
            if(txtCodeSent.isSelected()){
                c.query.append(1).append("');");
            }else{
                c.query.append(0).append("');");
            }
            
            JOptionPane.showMessageDialog(null, "The data has been added successfully!");
        }else{
            //Update the data.
            c.query.delete(0, c.query.length());
            c.query.append("update Principal set ");
            c.query.append("Status = '").append(execute.getValue("select id from Status where Type ='" + txtStatus.getSelectedItem() + "';")).append("', ");
            c.query.append("Description = '").append(txtDescription.getText()).append("', ");
            c.query.append("Documentation = '").append(txtDocumentation.getText()).append("', ");
            if(txtDocSent.isSelected()){
                c.query.append("DocSent = '").append(1).append("', ");
            }else{
                c.query.append("DocSent = '").append(0).append("', ");
            }
            if(txtCodeSent.isSelected()){
                c.query.append("codeSent = '").append(1).append("' ");
            }else{
                c.query.append("CodeSent = '").append(0).append("' ");
            }
            c.query.append("where id = '");
            c.query.append(execute.getValue("Select id from Principal where Code ='" + txtCode.getText() + "';")).append("';");
            
            JOptionPane.showMessageDialog(null, "The data has been updated successfully!");
        }
        
        execute.executeQuery(c.query.toString());
        addForms.setCode(txtCode.getText());
        addForms.setVisible(true);
        CleanControls();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(tabMain.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "You must select a record to delete.");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want delete this record?", "", JOptionPane.OK_OPTION) != JOptionPane.OK_OPTION){
            return;
        }
        
        //Check if the record has any forms associated with it.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from DesignatedMethod as dm ");
        c.query.append("inner join Forms as f on f.id = dm.Form ");
        c.query.append("inner join Principal as p on p.id = dm.Task ");
        c.query.append("where p.Code = '");
        c.query.append(tabMain.getValueAt(tabMain.getSelectedRow(), 0)).append("';");
        if(!execute.getValue(c.query.toString()).equals("0")){
            c.query.delete(0, c.query.length());
            c.query.append("delete from DesignatedMethod where Task = '");
            c.query.append(execute.getValue("Select id from Principal where Code = '" + tabMain.getValueAt(tabMain.getSelectedRow(), 0) + "';"));
            c.query.append("';");
            
            execute.executeQuery(c.query.toString());
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("delete from Principal where id ='");
        c.query.append(execute.getValue("select id from Principal where Code = '" + tabMain.getValueAt(tabMain.getSelectedRow(), 0) + "';"));
        c.query.append("';");
        execute.executeQuery(c.query.toString());
        
        CleanControls();
        JOptionPane.showMessageDialog(null, "The data has been deleted succesfully!");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilterActionPerformed
        txtCode.setText(c.getCleanText(txtCode.getText()));
        
        if(!txtCode.getText().equals("")){
            c.query.delete(0, c.query.length());
            c.query.append("select Code, Status, Description, Documentation, DocSent, CodeSent from Principal ");
            c.query.append("where Code like '");
            c.query.append(txtCode.getText()).append("%';");
            FillTable(tabMain, c.query.toString());
            return;
        }
        
        if(txtStatus.getSelectedIndex() != 0){
            c.query.delete(0, c.query.length());
            c.query.append("select Code, Status, Description, Documentation, DocSent, CodeSent from Principal ");
            c.query.append("where Status = '");
            c.query.append(execute.getValue("select id from Status where Type = '" + txtStatus.getSelectedItem() + "';"));
            c.query.append("';");
            FillTable(tabMain, c.query.toString());
        }
    }//GEN-LAST:event_btnFilterActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFilter;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabForms;
    private javax.swing.JTable tabMain;
    private javax.swing.JTextField txtCode;
    private javax.swing.JCheckBox txtCodeSent;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JCheckBox txtDocSent;
    private javax.swing.JTextField txtDocumentation;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables
}
