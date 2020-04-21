/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientsInHospitalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Yash
 */
public class MoniteredPatientsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MoniteredPatientsJPanel
     */
    
    JPanel userProcessContainer;
    UserAccount userAccount;
    Enterprise enterprise;
    
    
    public MoniteredPatientsJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise) {
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.userProcessContainer=userProcessContainer;
        initComponents();
        populateTable();
    }
    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) patientsListJTable.getModel();
        model.setRowCount(0);
        for (WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()) {

            System.out.println(request.toString());
            for (UserAccount ua : ((PatientsInHospitalWorkRequest) request).getPatientsList()) {
                System.out.println(ua +"              yash");
                Object row[] = new Object[4];
                row[0] = ua;
                model.addRow(row);
            }

        }
    }

   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        patientsListJTable = new javax.swing.JTable();
        sendForRequestButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patientsListJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Patient name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientsListJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 799, 180));

        sendForRequestButton.setText("Send to Lab test");
        sendForRequestButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendForRequestButtonActionPerformed(evt);
            }
        });
        add(sendForRequestButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sendForRequestButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendForRequestButtonActionPerformed
        int selectedRow = patientsListJTable.getSelectedRow();
        if (selectedRow >= 0) {
            UserAccount ac = (UserAccount)patientsListJTable.getValueAt(selectedRow, 0);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestLabTestJPanel(userProcessContainer, userAccount, enterprise,ac));
        layout.next(userProcessContainer);

        } else {

        }
        
        
        
    }//GEN-LAST:event_sendForRequestButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable patientsListJTable;
    private javax.swing.JButton sendForRequestButton;
    // End of variables declaration//GEN-END:variables
}
