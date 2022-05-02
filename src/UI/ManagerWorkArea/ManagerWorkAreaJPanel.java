/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ManagerWorkArea;

import Healthplus.E_System;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class ManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Org organization;
    private Enterprise enterprise;
    private E_System system;
    public ManagerWorkAreaJPanel(JPanel userProcessContainer,E_System system, UserAccount userAccount, Org organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer; 
        this.userAccount = userAccount;
        this.organization = organization;
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

        btn_managerfundraisers = new javax.swing.JButton();
        btn_posttask = new javax.swing.JButton();
        btn_issues = new javax.swing.JButton();
        btn_viewprojects = new javax.swing.JButton();
        btn_acc = new javax.swing.JButton();
        btn_coord = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 219, 203));
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_managerfundraisers.setBackground(new java.awt.Color(255, 255, 255));
        btn_managerfundraisers.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_managerfundraisers.setText("Manage Funding companies");
        btn_managerfundraisers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_managerfundraisers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_managerfundraisersActionPerformed(evt);
            }
        });
        add(btn_managerfundraisers, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 220, -1));

        btn_posttask.setBackground(new java.awt.Color(255, 255, 255));
        btn_posttask.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_posttask.setText("Post Tasks");
        btn_posttask.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_posttask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posttaskActionPerformed(evt);
            }
        });
        add(btn_posttask, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 217, -1));

        btn_issues.setBackground(new java.awt.Color(255, 255, 255));
        btn_issues.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_issues.setText("View Issues");
        btn_issues.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_issues.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_issuesActionPerformed(evt);
            }
        });
        add(btn_issues, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 217, -1));

        btn_viewprojects.setBackground(new java.awt.Color(255, 255, 255));
        btn_viewprojects.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_viewprojects.setText("Projects");
        btn_viewprojects.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_viewprojects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewprojectsActionPerformed(evt);
            }
        });
        add(btn_viewprojects, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 217, -1));

        btn_acc.setBackground(new java.awt.Color(255, 255, 255));
        btn_acc.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_acc.setText("Account");
        btn_acc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_accActionPerformed(evt);
            }
        });
        add(btn_acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 217, -1));

        btn_coord.setBackground(new java.awt.Color(255, 255, 255));
        btn_coord.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btn_coord.setText("View Coordinators");
        btn_coord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_coord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_coordActionPerformed(evt);
            }
        });
        add(btn_coord, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 217, -1));

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manager Work Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 220, 26));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 380, 430));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_managerfundraisersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_managerfundraisersActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ManageFundingAgenciesJPanel mfawajp = new ManageFundingAgenciesJPanel(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("ManageFundingAgenciesJPanel",mfawajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_managerfundraisersActionPerformed

    private void btn_posttaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_posttaskActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        PostTasksJPanel ptjp = new PostTasksJPanel(userProcessContainer, userAccount, organization, enterprise);
        userProcessContainer.add("PostTasksJPanel",ptjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_posttaskActionPerformed

    private void btn_issuesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_issuesActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewIssuesJPanel vijp = new ViewIssuesJPanel(userProcessContainer, userAccount, organization, enterprise);
        userProcessContainer.add("ViewIssuesJPanel",vijp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_issuesActionPerformed

    private void btn_viewprojectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewprojectsActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ProjectsJPanel pjp = new ProjectsJPanel(userProcessContainer,userAccount, organization, enterprise);
        userProcessContainer.add("ProjectsJPanel",pjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_viewprojectsActionPerformed

    private void btn_accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_accActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        AccountJPanel ajp = new AccountJPanel(userProcessContainer,userAccount, organization, enterprise);
        userProcessContainer.add("AccountJPanel",ajp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_accActionPerformed

    private void btn_coordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_coordActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewCoordinatorJPanel vvjp = new ViewCoordinatorJPanel(userProcessContainer,userAccount, organization, enterprise);
        userProcessContainer.add("ViewVolunteerJPanel",vvjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_coordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_acc;
    private javax.swing.JButton btn_coord;
    private javax.swing.JButton btn_issues;
    private javax.swing.JButton btn_managerfundraisers;
    private javax.swing.JButton btn_posttask;
    private javax.swing.JButton btn_viewprojects;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
