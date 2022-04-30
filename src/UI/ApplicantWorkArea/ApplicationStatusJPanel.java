/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ApplicantWorkArea;

import Healthplus.E_System;
import Healthplus.UserAccount.UserAccount;
import Healthplus.WorkQueue.JobWorkRequest;
import Healthplus.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class ApplicationStatusJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ApplicationStatusJPanel
     */
    private JPanel userProcessContainer;
    private E_System system;
    private UserAccount userAccount;

    public ApplicationStatusJPanel(JPanel userProcessContainer, E_System system, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        populateTable();
    }

    public void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblJobWorkRequest.getModel();
        dtm.setRowCount(0);

        for (WorkRequest workRequest : userAccount.getWorkQueue().getWorkRequestList()) {

            if (workRequest instanceof JobWorkRequest) {
                Object row[] = new Object[4];
                row[0] = workRequest.getSender();
                row[1] = workRequest.getReceiver();
                row[2] = workRequest;
                row[3] = ((JobWorkRequest) workRequest).getJob();
                dtm.addRow(row);
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
        tblJobWorkRequest = new javax.swing.JTable();
        lblHeader = new javax.swing.JLabel();
        btnBack2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(tblScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 480, 178));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Application Status");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 250, 27));

        btnBack2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });
        add(btnBack2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack2;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblJobWorkRequest;
    private javax.swing.JScrollPane tblScrollPane;
    // End of variables declaration//GEN-END:variables
}
