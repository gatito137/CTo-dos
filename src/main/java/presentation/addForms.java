package presentation;

import javax.swing.*;
import common.Common;
import bridge.Bridge;
import javax.swing.table.DefaultTableModel;

public class addForms extends JFrame {
    private final Common c = new Common();
    private final Bridge execute = new Bridge();
    
    public addForms() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    protected void setCode(String Code){
        lblCode.setText(Code);
        FillTable();
        FillList();
    }
    
    private void FillTable(){
        c.query.delete(0, c.query.length());
        c.query.append("select f.Name from DesignatedMethod as dm ");
        c.query.append("inner join Forms as f on f.id = dm.Form ");
        c.query.append("inner join Principal as p on p.id = dm.Task ");
        c.query.append("where p.Code = '").append(lblCode.getText()).append("';");
        
        tabForms.setModel(execute.getTable(new DefaultTableModel(), c.query.toString()));
    }
    
    private void FillList(){
        c.query.delete(0, c.query.length());
        c.query.append("select Name from Forms;");
        execute.getList(txtListForms, c.query.toString());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblCode = new javax.swing.JLabel();
        txtListForms = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnAnother = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabForms = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Select any form to assign to the task:");

        lblCode.setText("[Code]");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnAnother.setText("Another");
        btnAnother.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnotherActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(tabForms);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtListForms, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(lblCode))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnother, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addGap(78, 78, 78)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtListForms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnRemove))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAnother)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if(txtListForms.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "You must select a form to assign to the task.");
            return;
        }
        
        //Chek if the selected form has already been assigned to the task.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from DesignatedMethod where Form = '");
        c.query.append(execute.getValue("select id from Forms where Name = '" + txtListForms.getSelectedItem() + "';"));
        c.query.append("' and Task = '");
        c.query.append(execute.getValue("select id from Principal where Code = '" + lblCode.getText() + "';"));
        c.query.append("';");
        if(!execute.getValue(c.query.toString()).equals("0")){
            JOptionPane.showMessageDialog(null, "This Form has already been assigned to this task.");
            return;
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("insert into DesignatedMethod (Form, Task) values ('");
        c.query.append(execute.getValue("select id from Forms where Name = '" + txtListForms.getSelectedItem() + "';")).append("', '");
        c.query.append(execute.getValue("select id from Principal where Code = '" + lblCode.getText() + "';"));
        c.query.append("');");
        execute.executeQuery(c.query.toString());
        
        FillTable();
        JOptionPane.showMessageDialog(null, "The data has been saved succesfully!");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if(tabForms.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(null, "You must select a form to desassociate to this task.");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want detach the form for this task?", "Updating...", JOptionPane.OK_OPTION) != JOptionPane.OK_OPTION){
            return;
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("delete from DesignatedMethod where Form = '");
        c.query.append(execute.getValue("Select id from Forms where Name = '" + tabForms.getValueAt(tabForms.getSelectedRow(), 0) + "';"));
        c.query.append("' and Task = '");
        c.query.append(execute.getValue("select id from Principal where Code = '" + lblCode.getText() + "';"));
        c.query.append("';");
        execute.executeQuery(c.query.toString());
        
        FillTable();
        JOptionPane.showMessageDialog(null, "The data has been detached successfully!");
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnAnotherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnotherActionPerformed
        String newForm = c.getCleanText(JOptionPane.showInputDialog(null, "What is the name of the new Form?"));
        
        if(newForm.equals("")){
            JOptionPane.showMessageDialog(null, "You must type a name for the new Form.");
            return;
        }
        
        //Check if the name doesn't exist.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from Forms where Name = '").append(newForm).append("';");
        if(!execute.getValue(c.query.toString()).equals("0")){
            JOptionPane.showMessageDialog(null, "This Form already exists.");
            return;
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("insert into Forms(Name) values ('").append(newForm).append("');");
        execute.executeQuery(c.query.toString());
        
        FillList();
        JOptionPane.showMessageDialog(null, "The data has been saved successfully!");
    }//GEN-LAST:event_btnAnotherActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if(txtListForms.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "You must select a Form to delete it.");
            return;
        }
        
        if(JOptionPane.showConfirmDialog(null, "Are you sure you want delete this Form?", "Deleting...", JOptionPane.OK_OPTION) != JOptionPane.OK_OPTION){
            return;
        }
        
        //Check if the Form doesn't have any task assignated.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from DesignatedMethod where Form = '");
        c.query.append(execute.getValue("select id from Form where Name = '" + txtListForms.getSelectedItem() + "';"));
        c.query.append("';");
        if(!execute.getValue(c.query.toString()).equals("0")){
            JOptionPane.showMessageDialog(null, "This Form cannot be deleted because it has tasks assignated to it.");
            return;
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("delete from Forms where Name ='");
        c.query.append(txtListForms.getSelectedItem()).append("';");
        execute.executeQuery(c.query.toString());
        JOptionPane.showMessageDialog(null, "The data has been deleted successfully!");
        FillList();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtListForms.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "You must select a form to rename it.");
            return;
        }
        
        String newName = c.getCleanText(JOptionPane.showInputDialog("How do you want to rename this form?"));
        if(newName.equals("")){
            JOptionPane.showMessageDialog(null, "This name is not accepted.");
            return;
        }
        
        //Check if this name does not exists.
        c.query.delete(0, c.query.length());
        c.query.append("select count(1) from Forms where Name ='").append(newName).append("';");
        if(!execute.getValue(c.query.toString()).equals("0")){
            JOptionPane.showMessageDialog(null, "This name has already been assigned to another form.");
            return;
        }
        
        c.query.delete(0, c.query.length());
        c.query.append("update Forms set Name = '").append(newName);
        c.query.append("' where Name = '").append(txtListForms.getSelectedItem()).append("';");
        execute.executeQuery(c.query.toString());
        FillList();
        JOptionPane.showMessageDialog(null, "Data has been updated succesfully!");
    }//GEN-LAST:event_btnUpdateActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addForms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAnother;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JTable tabForms;
    private javax.swing.JComboBox<String> txtListForms;
    // End of variables declaration//GEN-END:variables
}
