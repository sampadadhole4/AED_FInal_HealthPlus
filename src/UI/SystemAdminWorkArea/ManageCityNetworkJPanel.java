/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SystemAdminWorkArea;

import Healthplus.E_System;
import Healthplus.Network.City;
import Healthplus.Network.Country;
import Healthplus.Network.State;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ManageCityNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCityNetworkJPanel
     */
   private JPanel userProcessContainer;
   E_System system;
    public ManageCityNetworkJPanel(JPanel userProcessContainer, E_System system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateCountry();
        populateState();
        populateTable();
        
    }

    private void populateCountry(){
        
         cbCountry.removeAllItems();
        
        for (Country c : system.getNetworkList()){
            cbCountry.addItem(c);
        }
        
    }
     
    private void populateState(){
        
        cbState.removeAllItems();
        if(cbCountry.getSelectedItem() != null){
           for (Country c : system.getNetworkList()){
            if(c.equals(cbCountry.getSelectedItem())){
                  for(State s: c.getStateList()){
                        cbState.addItem(s);
                    }
            }
                  
        }
        }
       
        
    }
     
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblCity.getModel();
        dtm.setRowCount(0);
        
   
          for(Country c : system.getNetworkList()){
           
            for(State s: c.getStateList()){
                for(City city: s.getCityList()){
                     Object row[] = new Object[3];
                    row[0] = c;
                    row[1] = s;
                    row[2] = city;
                    dtm.addRow(row);
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

        tblScrollPane = new javax.swing.JScrollPane();
        tblCity = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtFldName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblState = new javax.swing.JLabel();
        cbCountry = new javax.swing.JComboBox();
        cbState = new javax.swing.JComboBox();
        lblCountry = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(375, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblCity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Country", "State", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCity.setMinimumSize(new java.awt.Dimension(375, 0));
        tblScrollPane.setViewportView(tblCity);
        if (tblCity.getColumnModel().getColumnCount() > 0) {
            tblCity.getColumnModel().getColumn(0).setResizable(false);
            tblCity.getColumnModel().getColumn(1).setResizable(false);
            tblCity.getColumnModel().getColumn(2).setResizable(false);
        }

        add(tblScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, -1, 170));

        lblName.setText("Name of the City:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));
        add(txtFldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 150, -1));

        btnSubmit.setBackground(new java.awt.Color(113, 160, 160));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));

        lblState.setText("Select State:");
        add(lblState, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 370, -1, 20));

        cbCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCountryActionPerformed(evt);
            }
        });
        add(cbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 150, -1));

        cbState.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbState, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 150, -1));

        lblCountry.setText("Select Country:");
        add(lblCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, 20));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 40, 40));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage City Network");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 450, 26));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
          String name = txtFldName.getText();
          Country country = (Country) cbCountry.getSelectedItem();
          State state = (State) cbState.getSelectedItem();
        if(!name.equals("")){
                   // validate name
            String regex = "^[a-z A-Z]+$";
            Pattern namePattern = Pattern.compile(regex);
            Matcher nameMatcher = namePattern.matcher(name);

            if(!nameMatcher.matches()){
                 JOptionPane.showMessageDialog(null, "Invalid characters in city name", "Warning", JOptionPane.WARNING_MESSAGE);
                 return;
            }
            for(Country c: system.getNetworkList()){
               if(c.equals(country)){
                   for(State s: c.getStateList()){
                       if(s.equals(state)){
                          City city = s.createCity();
                          city.setName(name); 
                       }
                   }   
               }
              
            }
            populateTable();
            txtFldName.setText("");
            JOptionPane.showMessageDialog(null, "City added successfully", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "Please enter text", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCountryActionPerformed
        // TODO add your handling code here:
        populateState();
    }//GEN-LAST:event_cbCountryActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sawajp = (SystemAdminWorkAreaJPanel) component;
        sawajp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox cbCountry;
    private javax.swing.JComboBox cbState;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblState;
    private javax.swing.JTable tblCity;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTextField txtFldName;
    // End of variables declaration//GEN-END:variables
}
