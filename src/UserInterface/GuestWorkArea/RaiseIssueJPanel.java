/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.GuestWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class RaiseIssueJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount userAccount;

    /**
     * Creates new form RaiseIssueJPanel
     */
    public RaiseIssueJPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        btnMedications = new javax.swing.JButton();
        btnTreatmentOldAgeHome = new javax.swing.JButton();
        btnDonation = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Raise A Request");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 180, 26));

        btnMedications.setBackground(new java.awt.Color(113, 160, 160));
        btnMedications.setText("Provide Medications");
        btnMedications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicationsActionPerformed(evt);
            }
        });
        add(btnMedications, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 182, -1));

        btnTreatmentOldAgeHome.setBackground(new java.awt.Color(113, 160, 160));
        btnTreatmentOldAgeHome.setText("Provide Treatment");
        btnTreatmentOldAgeHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreatmentOldAgeHomeActionPerformed(evt);
            }
        });
        add(btnTreatmentOldAgeHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 182, -1));

        btnDonation.setBackground(new java.awt.Color(113, 160, 160));
        btnDonation.setText("Donation of Basic Amenities");
        btnDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonationActionPerformed(evt);
            }
        });
        add(btnDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 182, -1));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back-button.png"))); // NOI18N
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/request.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 560, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMedicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicationsActionPerformed

        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        RaiseIssueWorkRequestJPanel rirwjp = new RaiseIssueWorkRequestJPanel(userProcessContainer, userAccount, "Medications", system);
        userProcessContainer.add("rirwjp", rirwjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnMedicationsActionPerformed

    private void btnTreatmentOldAgeHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreatmentOldAgeHomeActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        RaiseIssueWorkRequestJPanel rirwjp = new RaiseIssueWorkRequestJPanel(userProcessContainer, userAccount, "Treatment Senior", system);
        userProcessContainer.add("rirwjp", rirwjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnTreatmentOldAgeHomeActionPerformed

    private void btnDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonationActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        RaiseIssueWorkRequestJPanel rirwjp = new RaiseIssueWorkRequestJPanel(userProcessContainer, userAccount, "Donation of Basic Amenities", system);
        userProcessContainer.add("rirwjp", rirwjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonation;
    private javax.swing.JButton btnMedications;
    private javax.swing.JButton btnTreatmentOldAgeHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
