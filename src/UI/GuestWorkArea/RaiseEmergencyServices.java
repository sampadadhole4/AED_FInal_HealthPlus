/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GuestWorkArea;

import Healthplus.E_System;
import Healthplus.EmergencyServices.Drivers;
import Healthplus.EmergencyServices.Emergency;
import Healthplus.EmergencyServices.EmergencyRequestDirectory;
import Healthplus.Network.City;
import Healthplus.Network.Country;
import Healthplus.Network.State;
import Healthplus.UserAccount.UserAccount;
import UI.SupervisorWorkArea.OngoingProjects_Page;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Provider;

/**
 *
 * @author sampadadhole
 */
public class RaiseEmergencyServices extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private E_System system;
     private UserAccount userAccount;
     ArrayList<Emergency> emergency;
     private EmergencyRequestDirectory EmergencyList;
     
    public RaiseEmergencyServices(JPanel userProcessContainer, E_System system,EmergencyRequestDirectory EmergencyList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.emergency = emergency;
        this.EmergencyList = EmergencyList;
       // ArrayList<Emergency> emergency = new ArrayList<Emergency>();
        
       
       populateCountry();
       populateState();
       populateCity();
    }
    
    private void populateCountry(){
        
         countrybox.removeAllItems();
        
        for (Country c : system.getNetworkList()){
            countrybox.addItem(c);
        }
        
    }
    
    private void populateState(){
        
        statebox.removeAllItems();
        if(countrybox.getSelectedItem() != null){
           for (Country c : system.getNetworkList()){
            if(c.equals(countrybox.getSelectedItem())){
                  for(State s: c.getStateList()){
                        statebox.addItem(s);
                    }
            }
                  
        }
        }
    }
        private void populateCity(){
        
         citybox.removeAllItems();
         
       if (statebox.getSelectedItem() != null){
        for (Country c : system.getNetworkList()){
            for(State s: c.getStateList()){
                if(s.equals(statebox.getSelectedItem())){
                    for(City city :  s.getCityList()){
                    citybox.addItem(city);
                     }
                }    
            }
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

        jPanel1 = new javax.swing.JPanel();
        label_country = new javax.swing.JLabel();
        Btn_RaiseRequest = new javax.swing.JButton();
        label_state = new javax.swing.JLabel();
        label_city = new javax.swing.JLabel();
        countrybox = new javax.swing.JComboBox();
        statebox = new javax.swing.JComboBox();
        citybox = new javax.swing.JComboBox();
        btn_back = new javax.swing.JButton();
        label_emailId = new javax.swing.JLabel();
        text_emailId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        text_locality = new javax.swing.JTextField();
        label_apartment = new javax.swing.JLabel();
        text_apartment = new javax.swing.JTextField();

        label_country.setText("Country");

        Btn_RaiseRequest.setText("Raise Emergency Service");
        Btn_RaiseRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RaiseRequestActionPerformed(evt);
            }
        });

        label_state.setText("State");

        label_city.setText("City");

        countrybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        statebox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        citybox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        label_emailId.setText("Email:");

        text_emailId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text_emailIdActionPerformed(evt);
            }
        });

        jLabel1.setText("Locality:");

        label_apartment.setText("Apartment:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btn_back)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_country, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_state, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_city, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(citybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(countrybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Btn_RaiseRequest)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(label_apartment)
                                    .addComponent(label_emailId))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(text_locality)
                                    .addComponent(text_apartment)
                                    .addComponent(text_emailId, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 38, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_country)
                    .addComponent(countrybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_state)
                    .addComponent(statebox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_city)
                    .addComponent(citybox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(text_locality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_apartment)
                    .addComponent(text_apartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_emailId)
                    .addComponent(text_emailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(Btn_RaiseRequest)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(btn_back)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RaiseRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RaiseRequestActionPerformed
       
      try{
            Country country= (Country) countrybox.getSelectedItem();
        String countryStr = country.toString();
        State state = (State) statebox.getSelectedItem();
        String stateStr = state.toString();
        City city = (City) citybox.getSelectedItem();
        String cityStr = city.toString();
        String locality = text_locality.getText();
        String apartmentNo = text_apartment.getText();
        
        
      Emergency emer = EmergencyList.AddNewEmergency();
      emer.setCity(cityStr);
      emer.setCountry(countryStr);
      emer.setState(stateStr);
      emer.setDrivername(Drivers.setDriver());
      JOptionPane.showMessageDialog(this, "Your emergency request has been sent successfully");
      String Fromemail = "health.plus.help1@gmail.com";
        String FromemailPass = "qwertyuiop#123";
        String toEmail = text_emailId.getText();
        String subject = "your emergency request has been sent successfully.";
        Properties properties = new Properties();
        //properties.put("mail.smtp.put","true");
        properties.put("mail.smtp.starttls.enable","true");
        //properties.put("mail.smtp.ssl.enable", "false");
        properties.put("mail.debug", "true");
        properties.put("mail.smtp.host","smtp.gmail.com");
        //properties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        //properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.required", "true");
         Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
              protected PasswordAuthentication getPasswordAuthentication(){
                  return new PasswordAuthentication (Fromemail,FromemailPass);
              }
        });
          try{
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(Fromemail));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(toEmail));
            msg.setSubject(subject);
            msg.setText( "We will get back to you soon."
                + "\nHere is your entered address\n" +apartmentNo+", "+locality+", "+cityStr+", "+stateStr);
            Transport.send(msg);
        }
        catch(Exception e){
            System.out.println(""+e);
        }
         
      //populatetransportTable(EmergencyList.getEmergencyList());
       
        }
        catch(Exception e){
                  JOptionPane.showMessageDialog(this, e.getMessage());

        }
         
    }//GEN-LAST:event_Btn_RaiseRequestActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed

    private void text_emailIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text_emailIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_text_emailIdActionPerformed

//   public void populatetransportTable( ArrayList<Emergency>emergency){
//       DefaultTableModel model = (DefaultTableModel) table_transport.getModel();
//        model.setRowCount(3);
//        if(emergency.isEmpty())
//        {
//            JOptionPane.showMessageDialog(this,"Person Doesn't exist!");
//
//        }
//         for(Emergency c : emergency){
//            Object row[] = new Object[3];
//            row[0] = c.getCountry();
//            row[1] = c.getState();
//            row[2] = c.getCity();
//            model.addRow(row);
//   }
//   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_RaiseRequest;
    private javax.swing.JButton btn_back;
    private javax.swing.JComboBox citybox;
    private javax.swing.JComboBox countrybox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_apartment;
    private javax.swing.JLabel label_city;
    private javax.swing.JLabel label_country;
    private javax.swing.JLabel label_emailId;
    private javax.swing.JLabel label_state;
    private javax.swing.JComboBox statebox;
    private javax.swing.JTextField text_apartment;
    private javax.swing.JTextField text_emailId;
    private javax.swing.JTextField text_locality;
    // End of variables declaration//GEN-END:variables
}
