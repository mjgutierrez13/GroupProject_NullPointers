/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.UserAccount.UserAccount;
import Business.VitalSign.VitalSign;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yash
 */


public class ProcessWorkRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    UserAccount ua;
    
    /**
     * Creates new form ProcessWorkRequestJPanel
     */
    public ProcessWorkRequestJPanel(JPanel userProcessContainer, LabTestWorkRequest request, UserAccount ua) {
        initComponents();
        this.ua = ua;
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        infectedRadioButton.setSelected(true);
        
        populateTable();
    }
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) VitalSignsJTable.getModel();
        model.setRowCount(0);
        for (VitalSign vitalSign : ua.getPatientAccount().getVitalSignHistory().getVitalSigns()) {
            Object[] row = new Object[7];
            row[0] = vitalSign.getBodyTemperature();
            row[2] = vitalSign.getRespiratoryRate();
            row[3] = vitalSign.getCoughType();
            row[1] = vitalSign.getHeadache();
            row[4] = vitalSign.getMusclePain();
            row[5] = vitalSign.getDate();
            row[6] = vitalSign;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        submitJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VitalSignsJTable = new javax.swing.JTable();
        infectedRadioButton = new javax.swing.JRadioButton();
        noIinfectedRadioButton = new javax.swing.JRadioButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        submitJButton.setText("Submit Result");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Result");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 280, -1, -1));

        resultJTextField.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 240, 50));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/Image/lab.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 600, 560));

        VitalSignsJTable.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        VitalSignsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Body Temp", "Headache", "Respiratory Rate", "Cough Type", "Muscle Pain", "Date", "Health Conditions"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(VitalSignsJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 800, 90));

        infectedRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(infectedRadioButton);
        infectedRadioButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        infectedRadioButton.setText("Infected");
        add(infectedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        noIinfectedRadioButton.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(noIinfectedRadioButton);
        noIinfectedRadioButton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        noIinfectedRadioButton.setText("Not Infected");
        noIinfectedRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noIinfectedRadioButtonActionPerformed(evt);
            }
        });
        add(noIinfectedRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel dwjp = (LabAssistantWorkAreaJPanel) component;
        dwjp.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        request.setTestResult(resultJTextField.getText());
        request.setStatus("Completed");
      
        if (infectedRadioButton.isSelected()) {
               
               ua.getPatientAccount().setInfected(true);
            }
      JOptionPane.showMessageDialog(null, "Lab report sent to Hospital");
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void noIinfectedRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noIinfectedRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noIinfectedRadioButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable VitalSignsJTable;
    private javax.swing.JButton backJButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton infectedRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton noIinfectedRadioButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}
