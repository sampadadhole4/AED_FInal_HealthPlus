/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vardhana Bhatt
 */
public class OldAgeHomeAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OldAgeHomeAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public OldAgeHomeAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise,
            EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.system = system;
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
        btnManageOrganization = new javax.swing.JButton();
        btnPublishJobs = new javax.swing.JButton();
        btnManageJobApplications = new javax.swing.JButton();
        btnManageEmpUserAcc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Admin Work Area ");

        btnManageOrganization.setBackground(new java.awt.Color(255, 255, 255));
        btnManageOrganization.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnManageOrganization.setText("Manage Organization");
        btnManageOrganization.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrganizationActionPerformed(evt);
            }
        });

        btnPublishJobs.setBackground(new java.awt.Color(255, 255, 255));
        btnPublishJobs.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnPublishJobs.setText("Publish Jobs");
        btnPublishJobs.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPublishJobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublishJobsActionPerformed(evt);
            }
        });

        btnManageJobApplications.setBackground(new java.awt.Color(255, 255, 255));
        btnManageJobApplications.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnManageJobApplications.setText("Manage Job Applications");
        btnManageJobApplications.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageJobApplications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageJobApplicationsActionPerformed(evt);
            }
        });

        btnManageEmpUserAcc.setBackground(new java.awt.Color(255, 255, 255));
        btnManageEmpUserAcc.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnManageEmpUserAcc.setText("Manage Employee User Account");
        btnManageEmpUserAcc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnManageEmpUserAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmpUserAccActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adminworkarea.gif"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(480, 270));
        jLabel1.setMinimumSize(new java.awt.Dimension(480, 270));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(528, 528, 528)
                        .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(btnManageOrganization)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnManageJobApplications)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPublishJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageEmpUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManageOrganization, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPublishJobs, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManageJobApplications, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnManageEmpUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(221, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrganizationActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeOrganizationJPanel mojp = new ManageOldAgeHomeOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("mojp", mojp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageOrganizationActionPerformed

    private void btnPublishJobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublishJobsActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        PublishOldAgeHomeJobsJPanel pjjp = new PublishOldAgeHomeJobsJPanel(userProcessContainer, system.getJobDirectory(), userAccount, system);
        userProcessContainer.add("pjjp", pjjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnPublishJobsActionPerformed

    private void btnManageJobApplicationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageJobApplicationsActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeJobApplicationsJPanel mjajp = new ManageOldAgeHomeJobApplicationsJPanel(userProcessContainer, enterprise, system, userAccount);
        userProcessContainer.add("mjajp", mjajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageJobApplicationsActionPerformed

    private void btnManageEmpUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmpUserAccActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageOldAgeHomeEmployeeUserAccountJPanel meuajp = new ManageOldAgeHomeEmployeeUserAccountJPanel(userProcessContainer, enterprise, system);
        userProcessContainer.add("meuajp", meuajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEmpUserAccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageEmpUserAcc;
    private javax.swing.JButton btnManageJobApplications;
    private javax.swing.JButton btnManageOrganization;
    private javax.swing.JButton btnPublishJobs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
