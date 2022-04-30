/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminWorkArea;

import Healthplus.E_System;
import Healthplus.Worker.Worker;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Job.Job;
import Healthplus.Org.AdminOrg;
import Healthplus.Org.MedicalOrg;
import Healthplus.Org.Senior_Care_Org;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import Healthplus.WorkQueue.JobWorkRequest;
import Healthplus.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class ManageOldAgeHomeJobApplicationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageOldAgeHomeEmployeeJobApplicationJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private E_System system;
    private UserAccount userAccount;
    
    public ManageOldAgeHomeJobApplicationsJPanel(JPanel userProcessContainer, Enterprise enterprise, E_System system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.system = system;
        this.userAccount = userAccount;
        populateTable();
    }
    
    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblJobWorkRequest.getModel();
        dtm.setRowCount(0);
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof AdminOrg) {
                for (WorkRequest workRequest : organization.getWorkQueue().getWorkRequestList()) {

                    if (workRequest instanceof JobWorkRequest
                            && !workRequest.getStatus().equals("Accepted")
                            && !workRequest.getStatus().equals("Rejected")) {
                        Object row[] = new Object[4];
                        row[0] = workRequest.getSender();
                        row[1] = workRequest.getReceiver();
                        row[2] = workRequest;
                        row[3] = ((JobWorkRequest) workRequest).getJob();
                        dtm.addRow(row);
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

        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        tblScrollPane = new javax.swing.JScrollPane();
        tblJobWorkRequest = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 240, 219));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backicon.jpeg"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Job Application");

        tblJobWorkRequest.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        tblJobWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Status", "Job Title"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblJobWorkRequest.setMinimumSize(new java.awt.Dimension(375, 0));
        tblJobWorkRequest.getTableHeader().setReorderingAllowed(false);
        tblScrollPane.setViewportView(tblJobWorkRequest);

        btnAccept.setBackground(new java.awt.Color(255, 255, 255));
        btnAccept.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnAccept.setText("Accept");
        btnAccept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnDelete.setText("Reject");
        btnDelete.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(486, 486, 486))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblJobWorkRequest.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to accept the applicant?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Job job = (Job) tblJobWorkRequest.getValueAt(selectedRow, 3);
                UserAccount ua = (UserAccount) tblJobWorkRequest.getValueAt(selectedRow, 0);
                WorkRequest workRequest = (WorkRequest) tblJobWorkRequest.getValueAt(selectedRow, 2);
                for (Org org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org instanceof Senior_Care_Org && job.getName().equalsIgnoreCase("caretaker")) {

                        if (org.getEmployeeDirectory().getEmployeeList().size() == 1) {
                            JOptionPane.showMessageDialog(null, "CareTaker already exists", "Information", JOptionPane.INFORMATION_MESSAGE);
                            workRequest.setStatus("Rejected");
                            workRequest.setReceiver(userAccount);
                            populateTable();
                            return;
                        }

                        Worker employee = enterprise.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        org.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        enterprise.getEmployeeDirectory().getEmployeeList().add(employee);
                        enterprise.getJobDirectory().removeJob(job);
                        system.getJobDirectory().removeJob(job);

                        break;
                    } else if (org instanceof MedicalOrg && job.getName().equalsIgnoreCase("doctor")) {

                        if (org.getEmployeeDirectory().getEmployeeList().size() == 1) {
                            JOptionPane.showMessageDialog(null, "Doctor already exists", "Information", JOptionPane.INFORMATION_MESSAGE);
                            workRequest.setStatus("Rejected");
                            workRequest.setReceiver(userAccount);
                            populateTable();
                            return;
                        }

                        Worker employee = enterprise.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        org.getEmployeeDirectory().createEmployee(ua.getApplicant().getName());
                        enterprise.getEmployeeDirectory().getEmployeeList().add(employee);
                        enterprise.getJobDirectory().removeJob(job);
                        system.getJobDirectory().removeJob(job);

                        break;
                    }
                }

                workRequest.setStatus("Accepted");
                workRequest.setReceiver(userAccount);

                populateTable();
                JOptionPane.showMessageDialog(null, "Employee created successfully", "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblJobWorkRequest.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to reject the application?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                WorkRequest workRequest = (WorkRequest) tblJobWorkRequest.getValueAt(selectedRow, 2);
                workRequest.setStatus("Rejected");
                workRequest.setReceiver(userAccount);
                populateTable();
                JOptionPane.showMessageDialog(null, "Job application deleted successfully", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblJobWorkRequest;
    private javax.swing.JScrollPane tblScrollPane;
    // End of variables declaration//GEN-END:variables
}
