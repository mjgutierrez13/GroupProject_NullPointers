/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yash
 */
public class ManageOrganizationJPanel extends javax.swing.JPanel {

    private OrganizationDirectory directory;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageOrganizationJPanel(JPanel userProcessContainer,OrganizationDirectory directory, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.directory = directory;
        this.enterprise = enterprise;
        
        
        
        populateTable();
        populateCombo();
    }
    
    private void populateCombo(){
        organizationJComboBox.removeAllItems();
        /*
            if (Type.Admin.getValue()==("Admin")){
                //System.out.println(type.EmergencyServicesAdmin.getValue());
                organizationJComboBox.addItem("Doctor");
                organizationJComboBox.addItem("Lab");
            }else if(Type.EmergencyServicesAdmin.getValue()=="Emergency Services Admin"){
                organizationJComboBox.addItem("Ambulance");
            }
        
        
        
        
        for (Type type : Organization.Type.values()){
            if (type.getValue().equals(Type.Admin.getValue())){
                //System.out.println(type.EmergencyServicesAdmin.getValue());
                organizationJComboBox.addItem(type.Doctor.getValue());
                organizationJComboBox.addItem(type.Lab.getValue());
            }else if(type.getValue().equals(Type.EmergencyServicesAdmin.getValue())){
                organizationJComboBox.addItem(type.Ambulance.getValue());
            }
        }
        */
        System.out.println(enterprise.getEnterpriseType());
        String EnrepriseType =  enterprise.getEnterpriseType().toString();
        String s = "Emergency Services";
        String h = "Hospital";
        String n= "NGO";
        organizationJComboBox.removeAllItems();
        if(EnrepriseType.equals(s)){
           // System.out.println("yash");
        for (Type type : Organization.Type.values()){
            if (!type.getValue().equals(Type.Admin.getValue()) && 
                    !type.getValue().equals(Type.EmergencyServicesAdmin.getValue()) &&
                    !type.getValue().equals(Type.EmergencyServicesManager.getValue()) &&
                    !type.getValue().equals(Type.NGO.getValue()) &&
                    !type.getValue().equals(Type.Doctor.getValue()) &&
                    !type.getValue().equals(Type.NGOAdmin.getValue()) &&
                    !type.getValue().equals(Type.Patient.getValue()) &&
                    !type.getValue().equals(Type.Lab.getValue())){
                organizationJComboBox.addItem(type);
             //   System.out.println("bhumika");
            }
        }
        }else if(EnrepriseType.equals(h)){
            //System.out.println("KT");
            for (Type type : Organization.Type.values()){
                if (!type.getValue().equals(Type.Admin.getValue()) && 
                        !type.getValue().equals(Type.EmergencyServicesAdmin.getValue()) &&
                        !type.getValue().equals(Type.Ambulance.getValue())  &&
                     !type.getValue().equals(Type.EmergencyServicesManager.getValue()) &&
                     !type.getValue().equals(Type.NGO.getValue()) &&
                      !type.getValue().equals(Type.Patient.getValue()) &&
                      !type.getValue().equals(Type.NGOAdmin.getValue())  ){
                    organizationJComboBox.addItem(type);
              //      System.out.println("abhi");
                 }
            }
        }else if(EnrepriseType.equals(n)){
            System.out.println("bhumi");
             for (Type type : Organization.Type.values()){
                if (!type.getValue().equals(Type.Admin.getValue()) && 
                        !type.getValue().equals(Type.EmergencyServicesAdmin.getValue()) &&
                        !type.getValue().equals(Type.Ambulance.getValue()) &&
                        !type.getValue().equals(Type.Doctor.getValue()) &&
                    !type.getValue().equals(Type.Lab.getValue()) &&
                     !type.getValue().equals(Type.EmergencyServicesManager.getValue()) &&
                     !type.getValue().equals(Type.Patient.getValue()) &&
                     !type.getValue().equals(Type.NGO.getValue())){
                    organizationJComboBox.addItem(type);
              //      System.out.println("abhi");
                 }
             }
            
        }
        
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : directory.getOrganizationList()){
            Object[] row = new Object[2];
            row[0] = organization.getOrganizationID();
            row[1] = organization.getName();
            
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
            organizationJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 60, 480, 92));

        addJButton.setText("Add Organization");
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 308, -1, 20));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 225, 81, -1));

        jLabel1.setText("Organization Type ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 228, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 308, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed

        Type type = (Type) organizationJComboBox.getSelectedItem();
        directory.createOrganization(type);
        populateTable();
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    // End of variables declaration//GEN-END:variables
}
