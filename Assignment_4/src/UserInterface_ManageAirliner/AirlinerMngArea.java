/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_ManageAirliner;
import Business.Airliner;
import Business.Flight;
import Business.TravelAgency;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Bhumika
 */
public class AirlinerMngArea extends javax.swing.JPanel {

    /**
     * Creates new form AirlinersMngWorkAreaJPanel
     */
    private JPanel cardSequenceJPanel;
    private TravelAgency travelAgency;
    public AirlinerMngArea(JPanel cardSequenceJPanel, TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.travelAgency = travelAgency;
        calculateFleetSize();
        populateAirlinersTable();
        btnClearSearch.setEnabled(false);
    }
    
    public void populateAirlinersTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblAirliner.getModel();
        dtm.setRowCount(0);
        for(Airliner airliner: travelAgency.getAirlinerDirectory().getAirlinerList()) {
            Object[] row = new Object[3];
            row[0]=airliner;
            row[1]=airliner.getAirlinerHeadquaters();
            row[2]=airliner.getAirlinerFleetSize();
            
            dtm.addRow(row);
        }
    }
    
    public void calculateFleetSize(){
        int count = 0;
        for(Airliner airliner: travelAgency.getAirlinerDirectory().getAirlinerList()){
            for(Flight flight:airliner.getFlightList()){
                if(airliner.getAirlinerName().equals(flight.getAirlinerName())){
                    count++;
                }
            }
            airliner.setAirlinerFleetSize(count);
            count = 0;
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

        lblHeading = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirliner = new javax.swing.JTable();
        btnCreateNewAirliner = new javax.swing.JButton();
        btnViewAirlinerDetails = new javax.swing.JButton();
        btnDeleteAirliner = new javax.swing.JButton();
        btnAddFlight = new javax.swing.JButton();
        txtSearchAirliner = new javax.swing.JTextField();
        btnSearchAirliner = new javax.swing.JButton();
        btnClearSearch = new javax.swing.JButton();
        btnAddPlanes = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));

        lblHeading.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 255, 255));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("MANAGE AIRLINERS");

        tblAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Headquarters", "Fleet Size"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirliner);
        if (tblAirliner.getColumnModel().getColumnCount() > 0) {
            tblAirliner.getColumnModel().getColumn(0).setResizable(false);
            tblAirliner.getColumnModel().getColumn(1).setResizable(false);
            tblAirliner.getColumnModel().getColumn(2).setResizable(false);
        }

        btnCreateNewAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnCreateNewAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnCreateNewAirliner.setForeground(new java.awt.Color(0, 0, 204));
        btnCreateNewAirliner.setText("Create new Airliner");
        btnCreateNewAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateNewAirlinerActionPerformed(evt);
            }
        });

        btnViewAirlinerDetails.setBackground(new java.awt.Color(245, 245, 246));
        btnViewAirlinerDetails.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewAirlinerDetails.setForeground(new java.awt.Color(0, 0, 204));
        btnViewAirlinerDetails.setText("View Airliner Details");
        btnViewAirlinerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAirlinerDetailsActionPerformed(evt);
            }
        });

        btnDeleteAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnDeleteAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDeleteAirliner.setForeground(new java.awt.Color(0, 0, 204));
        btnDeleteAirliner.setText("Delete Airliner");
        btnDeleteAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAirlinerActionPerformed(evt);
            }
        });

        btnAddFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnAddFlight.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddFlight.setForeground(new java.awt.Color(0, 0, 204));
        btnAddFlight.setText("Add Flight to Airliner");
        btnAddFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFlightActionPerformed(evt);
            }
        });

        txtSearchAirliner.setBackground(new java.awt.Color(245, 245, 246));
        txtSearchAirliner.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        btnSearchAirliner.setBackground(new java.awt.Color(245, 245, 246));
        btnSearchAirliner.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnSearchAirliner.setForeground(new java.awt.Color(0, 0, 204));
        btnSearchAirliner.setText("Search Airliner");
        btnSearchAirliner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAirlinerActionPerformed(evt);
            }
        });

        btnClearSearch.setBackground(new java.awt.Color(245, 245, 246));
        btnClearSearch.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnClearSearch.setForeground(new java.awt.Color(0, 0, 204));
        btnClearSearch.setText("Clear Search");
        btnClearSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSearchActionPerformed(evt);
            }
        });

        btnAddPlanes.setBackground(new java.awt.Color(245, 245, 246));
        btnAddPlanes.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddPlanes.setForeground(new java.awt.Color(0, 0, 204));
        btnAddPlanes.setText("Add Planes to Airliner");
        btnAddPlanes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlanesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeading, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddPlanes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreateNewAirliner)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewAirlinerDetails)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addComponent(btnAddFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClearSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchAirliner, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblHeading)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateNewAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewAirlinerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchAirliner, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClearSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btnAddFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnAddPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateNewAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateNewAirlinerActionPerformed
        // TODO add your handling code here:
        CreateNewAirliner panel = new CreateNewAirliner(cardSequenceJPanel,travelAgency);
        cardSequenceJPanel.add("CreateNewAirliner", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
    }//GEN-LAST:event_btnCreateNewAirlinerActionPerformed

    private void btnViewAirlinerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAirlinerDetailsActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
         if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
         }
         else {
           Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
           ViewAirlinerDetails panel = new ViewAirlinerDetails(cardSequenceJPanel,airliner);
           cardSequenceJPanel.add("ViewAirlinerDetailsJPanel",panel);
           CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
           layout.next(cardSequenceJPanel);
         }


    }//GEN-LAST:event_btnViewAirlinerDetailsActionPerformed

    private void btnDeleteAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAirlinerActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow  >= 0) {
           int dialogButton = JOptionPane.YES_NO_OPTION;
           int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the airliner details ?","Warning",dialogButton);
           if(dialogResult == JOptionPane.YES_OPTION) {
               Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
               travelAgency.getAirlinerDirectory().deleteAirliner(airliner);
               populateAirlinersTable();
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAirlinerActionPerformed

    private void btnAddFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFlightActionPerformed
        // TODO add your handling code here:
        
        try{
           
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
         }
        else{
        Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
        CreateNewFlight panel = new CreateNewFlight(cardSequenceJPanel, airliner);
        cardSequenceJPanel.add("CreateNewFlightJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnAddFlightActionPerformed

    private void btnSearchAirlinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAirlinerActionPerformed
        // TODO add your handling code here:
        btnClearSearch.setEnabled(true);
        btnSearchAirliner.setEnabled(false);
        String searchText = txtSearchAirliner.getText();
        if(searchText.equals("") || searchText == null){
            JOptionPane.showMessageDialog(null, "Please enter Airliner name or Headquaters name to search");
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel) tblAirliner.getModel();
            dtm.setRowCount(0);
            for(Airliner airliner: travelAgency.getAirlinerDirectory().getAirlinerList()) {
            if(airliner.getAirlinerName().equalsIgnoreCase(searchText) || airliner.getAirlinerHeadquaters().equalsIgnoreCase(searchText)){
                Object[] row = new Object[3];
                row[0]=airliner;
                row[1]=airliner.getAirlinerHeadquaters();
                row[2]=airliner.getAirlinerFleetSize();

                dtm.addRow(row);
            }
          }
        }
    }//GEN-LAST:event_btnSearchAirlinerActionPerformed

    private void btnClearSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSearchActionPerformed
        // TODO add your handling code here:
        populateAirlinersTable();
        btnClearSearch.setEnabled(false);
        btnSearchAirliner.setEnabled(true);
        txtSearchAirliner.setText("");
    }//GEN-LAST:event_btnClearSearchActionPerformed

    private void btnAddPlanesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlanesActionPerformed
         try{
           
        int selectedRow = tblAirliner.getSelectedRow();
        if(selectedRow<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
         }
        else{
        Airliner airliner = (Airliner)tblAirliner.getValueAt(selectedRow,0);
        CreateNewPlane panel = new CreateNewPlane(cardSequenceJPanel, airliner);
        cardSequenceJPanel.add("CreateNewPlaneJPanel", panel);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.next(cardSequenceJPanel);
        }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Please select a row from table first to view flight details","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddPlanesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFlight;
    private javax.swing.JButton btnAddPlanes;
    private javax.swing.JButton btnClearSearch;
    private javax.swing.JButton btnCreateNewAirliner;
    private javax.swing.JButton btnDeleteAirliner;
    private javax.swing.JButton btnSearchAirliner;
    private javax.swing.JButton btnViewAirlinerDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JTable tblAirliner;
    private javax.swing.JTextField txtSearchAirliner;
    // End of variables declaration//GEN-END:variables
}
