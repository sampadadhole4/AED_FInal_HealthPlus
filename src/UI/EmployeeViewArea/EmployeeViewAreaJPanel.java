/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EmployeeViewArea;

import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import UI.GuestWorkArea.HelplineJPanel;
import UI.GuestWorkArea.RaiseIssueJPanel;
import UI.GuestWorkArea.ViewOldAgeHomeJPanel;
import UI.GuestWorkArea.ViewTrustJPanel;
import java.awt.CardLayout;
import static java.time.Clock.system;
import javax.swing.JPanel;


public class EmployeeViewAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmployeeViewAreaJPanel
     */
    private JPanel userProcessContainer;
    private E_System system;
    private DB4OUtil dB4OUtil;
    private UserAccount userAccount;
    private Org organization;
    private Enterprise enterprise;
    public EmployeeViewAreaJPanel(JPanel userProcessContainer, E_System system, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.dB4OUtil = dB4OUtil;
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

        jPanel1 = new javax.swing.JPanel();
        btn_viewtrusts = new javax.swing.JButton();
        btn_raiserequest = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btn_projs = new javax.swing.JButton();
        btn_viewResolved = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_oldAge = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_viewtrusts.setBackground(new java.awt.Color(113, 160, 160));
        btn_viewtrusts.setText("Trusts");
        btn_viewtrusts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewtrustsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_viewtrusts, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 115, 251, -1));

        btn_raiserequest.setBackground(new java.awt.Color(113, 160, 160));
        btn_raiserequest.setText("Raise Issue");
        btn_raiserequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_raiserequestActionPerformed(evt);
            }
        });
        jPanel1.add(btn_raiserequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 251, -1));

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("View Area");
        jPanel1.add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 250, 27));

        btn_projs.setBackground(new java.awt.Color(113, 160, 160));
        btn_projs.setText("Projects");
        btn_projs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_projsActionPerformed(evt);
            }
        });
        jPanel1.add(btn_projs, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 250, -1));

        btn_viewResolved.setBackground(new java.awt.Color(113, 160, 160));
        btn_viewResolved.setText("View Resolved Issue Statistics");
        btn_viewResolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewResolvedActionPerformed(evt);
            }
        });
        jPanel1.add(btn_viewResolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 251, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/view.gif"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 330, 400));

        btn_oldAge.setBackground(new java.awt.Color(113, 160, 160));
        btn_oldAge.setText("Old Age Home");
        btn_oldAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oldAgeActionPerformed(evt);
            }
        });
        jPanel1.add(btn_oldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 251, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_viewtrustsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewtrustsActionPerformed
        // TODO add your handling code here:
       CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewTrustJPanel vnjp = new ViewTrustJPanel(userProcessContainer, system);
        userProcessContainer.add("vnjp",vnjp);
        cardLayout.next(userProcessContainer); 
    }//GEN-LAST:event_btn_viewtrustsActionPerformed

    private void btn_raiserequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_raiserequestActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();      
        RaiseIssueJPanel rijp = new RaiseIssueJPanel(userProcessContainer, userAccount, system); 
        userProcessContainer.add("rijp",rijp);
        cardLayout.next(userProcessContainer);
       
    }//GEN-LAST:event_btn_raiserequestActionPerformed

    private void btn_projsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_projsActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ProjectViewJPanel pvjp = new ProjectViewJPanel(userProcessContainer, system, userAccount, organization, enterprise);
        userProcessContainer.add("pvjp",pvjp);
        cardLayout.next(userProcessContainer);
    }//GEN-LAST:event_btn_projsActionPerformed

    private void btn_viewResolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewResolvedActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewResolvedIssuesStatisticsJPanel vrisjp = new ViewResolvedIssuesStatisticsJPanel(userProcessContainer, system, userAccount, enterprise);
        userProcessContainer.add("vrisjp",vrisjp);
        cardLayout.next(userProcessContainer);
        
    }//GEN-LAST:event_btn_viewResolvedActionPerformed

    private void btn_oldAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oldAgeActionPerformed
        // TODO add your handling code here:
        CardLayout  cardLayout = (CardLayout) userProcessContainer.getLayout();
        ViewOldAgeHomeJPanel oahj = new ViewOldAgeHomeJPanel(userProcessContainer, system);
        userProcessContainer.add("oahj",oahj);
        cardLayout.next(userProcessContainer); 
    }//GEN-LAST:event_btn_oldAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_oldAge;
    private javax.swing.JButton btn_projs;
    private javax.swing.JButton btn_raiserequest;
    private javax.swing.JButton btn_viewResolved;
    private javax.swing.JButton btn_viewtrusts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblHeader;
    // End of variables declaration//GEN-END:variables
}
