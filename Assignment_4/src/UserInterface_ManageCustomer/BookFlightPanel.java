/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface_ManageCustomer;

import Business.CustomerDirectory;
import Business.Flight;
import Business.Seats;
import Business.TravelAgency;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Yash
 */
public class BookFlightPanel extends javax.swing.JPanel {

    /**
     * Creates new form BookFlightJPanel
     */
    private JPanel cardSequenceJPanel;
    private Flight flight;
    private TravelAgency travelAgency;
    public BookFlightPanel(JPanel cardSequenceJPanel,Flight flight,TravelAgency travelAgency) {
        initComponents();
        this.cardSequenceJPanel = cardSequenceJPanel;
        this.flight = flight;
        this.travelAgency = travelAgency;
        txtFlightNumber.setEnabled(false);
        txtFlightNumber.setText(flight.getFlightNumber());
        
        populateSeats();
    }
    
     private boolean emailPattern() {
        Pattern p = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher m = p.matcher(txtEmail.getText());
        boolean b = m.matches();
        return b;
    }
    
    private boolean phoneNumberPattern() {
        Pattern p = Pattern.compile("[0-9]*");
        Matcher m = p.matcher(txtPhone.getText());
        boolean b = m.matches();
        return b;
    }
    
    public void populateSeats(){
        for(Seats seat : flight.getSeatList()){
            if(seat.isSeatAvailability() == true)
            comboSeat.addItem(seat.getSeatNumber());
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

        lblFlightNumber = new javax.swing.JLabel();
        txtFlightNumber = new javax.swing.JTextField();
        lblPastBookings = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        lblSeat = new javax.swing.JLabel();
        comboSeat = new javax.swing.JComboBox<>();
        seatArrangementPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnBookAFlight = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 72, 128));

        lblFlightNumber.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblFlightNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblFlightNumber.setText("Flight Number");

        txtFlightNumber.setBackground(new java.awt.Color(245, 245, 246));
        txtFlightNumber.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblPastBookings.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblPastBookings.setForeground(new java.awt.Color(255, 255, 255));
        lblPastBookings.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPastBookings.setText("BOOK FLIGHT");

        btnBack.setBackground(new java.awt.Color(245, 245, 246));
        btnBack.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(78, 114, 175));
        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(245, 245, 246));
        txtPhone.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Phone");

        txtEmail.setBackground(new java.awt.Color(245, 245, 246));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblEmail.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        lblSeat.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblSeat.setForeground(new java.awt.Color(255, 255, 255));
        lblSeat.setText("Seat");

        comboSeat.setBackground(new java.awt.Color(245, 245, 246));
        comboSeat.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        comboSeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeatActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("1A");
        jButton1.setEnabled(false);
        jButton1.setFocusTraversalPolicyProvider(true);

        jButton2.setText("1C");
        jButton2.setEnabled(false);
        jButton2.setFocusTraversalPolicyProvider(true);

        jButton3.setText("1B");
        jButton3.setEnabled(false);
        jButton3.setFocusTraversalPolicyProvider(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("1F");
        jButton4.setEnabled(false);
        jButton4.setFocusTraversalPolicyProvider(true);

        jButton5.setText("1D");
        jButton5.setEnabled(false);
        jButton5.setFocusTraversalPolicyProvider(true);

        jButton6.setText("1E");
        jButton6.setEnabled(false);
        jButton6.setFocusTraversalPolicyProvider(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Window");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Aisle");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Middle");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Window");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Middle");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aisle");

        javax.swing.GroupLayout seatArrangementPanelLayout = new javax.swing.GroupLayout(seatArrangementPanel);
        seatArrangementPanel.setLayout(seatArrangementPanelLayout);
        seatArrangementPanelLayout.setHorizontalGroup(
            seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, seatArrangementPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(100, 100, 100)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatArrangementPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, seatArrangementPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        seatArrangementPanelLayout.setVerticalGroup(
            seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seatArrangementPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(seatArrangementPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBookAFlight.setBackground(new java.awt.Color(245, 245, 246));
        btnBookAFlight.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btnBookAFlight.setForeground(new java.awt.Color(78, 114, 175));
        btnBookAFlight.setText("Book Flight");
        btnBookAFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAFlightActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(245, 245, 246));
        txtName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N

        lblName.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPastBookings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(456, 456, 456))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addComponent(comboSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(336, 336, 336))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(seatArrangementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPastBookings)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFlightNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboSeat)
                    .addComponent(lblSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(seatArrangementPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(btnBookAFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        cardSequenceJPanel.remove(this);
        CardLayout layout = (CardLayout) cardSequenceJPanel.getLayout();
        layout.previous(cardSequenceJPanel);
        Component[] comps= cardSequenceJPanel.getComponents();
        for(Component c:comps)
        {
            if(c instanceof FlightSearchArea)
            {
                FlightSearchArea panel=(FlightSearchArea) c;
                panel.populateTable();
            }
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void comboSeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboSeatActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBookAFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAFlightActionPerformed
        // TODO add your handling code here:
        
        String customerName = txtName.getText();
        String customerEmail = txtEmail.getText();
        String flightNumber = txtFlightNumber.getText();
        String seatNumber = (String)comboSeat.getSelectedItem();
        long customerContact = 0;
        try{
            customerContact = Integer.parseInt(txtPhone.getText());
            
            if(!phoneNumberPattern())
            {
                JOptionPane.showMessageDialog(null, "Please Enter a valid Phone Number");
                txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblPhone.setForeground(Color.RED);
                return;
            }else if(!emailPattern()) 
            {
                JOptionPane.showMessageDialog(null, "Email should be the form of xxx123@xxx.xxx");
                txtEmail.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblEmail.setForeground(Color.RED);
                return;
            }else if(customerName.equals(" "))
            {
                JOptionPane.showMessageDialog(null, "Please Enter your Name");
                txtFlightNumber.setBorder(BorderFactory.createLineBorder(Color.RED));
                lblFlightNumber.setForeground(Color.RED);
                return;
            }
            else{
                
               travelAgency.getCustomerDirectory().addCustomer(customerName, customerContact, customerEmail, flightNumber, seatNumber);
               flight.setAvailableSeats(flight.getTotalSeats()-1);
               JOptionPane.showMessageDialog(null, "Flight booked successfully\n"+"Airline: "+flight.getAirlinerName()+"\n"+"Flight Number: "+flight.getFlightNumber()+"\n"+"Seat Number: "+seatNumber);
               for(Seats seat:flight.getSeatList()){
                   if(seat.getSeatNumber().equals(seatNumber))
                    seat.setSeatAvailability(false);
               }
               comboSeat.removeItem(seatNumber);
               txtName.setText("");
               txtEmail.setText("");
               txtPhone.setText("");
               comboSeat.setSelectedIndex(0);
            }
        }catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Please enter your Phone Number ");
            return;
        }
         
        
       
        
       

    }//GEN-LAST:event_btnBookAFlightActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookAFlight;
    private javax.swing.JComboBox<String> comboSeat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFlightNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPastBookings;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSeat;
    private javax.swing.JPanel seatArrangementPanel;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFlightNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
