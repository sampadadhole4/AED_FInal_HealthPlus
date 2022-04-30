/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.SupervisorWorkArea;

import Healthplus.E_System;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class SupervisorWorkArea_Page extends javax.swing.JPanel {

    /**
     * Creates new form SupervisorWorkArea_Page
     */
    private JPanel userProcessContainer;
    private E_System system;
    private UserAccount userAccount;
    private Org organization;
    private Enterprise enterprise;

    public SupervisorWorkArea_Page(JPanel userProcessContainer, E_System system, UserAccount userAccount, Org organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
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
        btn_ongoingporj = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Coordinator Work Area");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 270, 26));

        btn_ongoingporj.setBackground(new java.awt.Color(113, 160, 160));
        btn_ongoingporj.setText("Ongoing Projects");
        btn_ongoingporj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ongoingporjActionPerformed(evt);
            }
        });
        add(btn_ongoingporj, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 180, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/coordinators.gif"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 730, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ongoingporjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ongoingporjActionPerformed
        // TODO add your handling code here:
        CardLayout cardLayout = (CardLayout) userProcessContainer.getLayout();
        OngoingProjects_Page opjp = new OngoingProjects_Page(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("OngoingProjectsJPanel", opjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_ongoingporjActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ongoingporj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}