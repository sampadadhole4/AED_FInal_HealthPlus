/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AttendantWorkArea;

import Healthplus.E_System;
import Healthplus.Enterprises.Enterprise;
import Healthplus.SeniorCare.SeniorCare;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import Healthplus.WorkQueue.SeniorCareWorkRequest;
import Healthplus.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageSeniorCare_Page extends javax.swing.JPanel {

    /**
     * Creates new form ManageSeniorCare_Page
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Org organization;
    private Enterprise enterprise;
    private E_System system;
    
    public ManageSeniorCare_Page(JPanel userProcessContainer, E_System system, UserAccount userAccount, Org organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        populateAgencyTable();
    }
    
    public void populateAgencyTable() {
        DefaultTableModel model = (DefaultTableModel) tblFundingAgency.getModel();

        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof SeniorCareWorkRequest) {
                if (((SeniorCareWorkRequest) request).getSenior().isStatus() == true) {
                    Object[] row = new Object[3];
                    row[0] = (SeniorCareWorkRequest) request;
                    row[1] = ((SeniorCareWorkRequest) request).getSenior().isIllness();
                    row[2] = ((SeniorCareWorkRequest) request).getSenior().isMedicines();
                    model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblFundingAgency = new javax.swing.JTable();
        btn_back = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        tblFundingAgency.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Illness", "Medicines Received"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFundingAgency);

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Senior Care");

        btn_add.setBackground(new java.awt.Color(113, 160, 160));
        btn_add.setText("Accept");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(202, 202, 202)
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFundingAgency.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        SeniorCareWorkRequest seniorRequest = (SeniorCareWorkRequest) tblFundingAgency.getValueAt(selectedRow, 0);

        //Updating account and account directory
        SeniorCare senior = new SeniorCare();
        senior.setName(seniorRequest.getSenior().getName());
        senior.setIllness(seniorRequest.getSenior().isIllness());
        senior.setMedicines(seniorRequest.getSenior().isMedicines());
        enterprise.getSeniorCareDirectory().getSeniorCareList().add(senior);
        System.out.println(enterprise.getSeniorCareDirectory().getSeniorCareList().size());

        system.getSeniorCareDirectory().createSeniorCare(seniorRequest.getSenior().getName(), seniorRequest.getSenior().isIllness());
        System.out.println(system.getSeniorCareDirectory().getSeniorCareList().size());
        //set agency status to false ie amount =0
        seniorRequest.getSenior().setStatus(false);
        seniorRequest.setReceiver(userAccount);
        seniorRequest.setStatus("Accepted");
        populateAgencyTable();
        JOptionPane.showMessageDialog(null, "Accepted");
    }//GEN-LAST:event_btn_addActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_back;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblFundingAgency;
    // End of variables declaration//GEN-END:variables
}