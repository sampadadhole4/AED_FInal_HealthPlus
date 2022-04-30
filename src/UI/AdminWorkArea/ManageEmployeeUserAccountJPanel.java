/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.AdminWorkArea;

import Healthplus.UserAccount.UserAccount;
import Healthplus.E_System;
import Healthplus.Worker.Worker;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.AdminOrg;
import Healthplus.Org.Org;
import Healthplus.Role.Admin;
import Healthplus.Role.Roles;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Vardhana Bhatt
 */
public class ManageEmployeeUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeUserAccountJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private E_System system;
    
    public ManageEmployeeUserAccountJPanel(JPanel userProcessContainer, Enterprise enterprise, E_System system) {
        initComponents();
        this.enterprise = enterprise;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateOrganization();
        populateEmployee();
        populateRole();
        populateTable();
    }

    private void populateOrganization() {
        cbOrg.removeAllItems();

        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (!(organization instanceof AdminOrg)) {
                cbOrg.addItem(organization);
            }
        }
    }

    private void populateEmployee() {
        cbEmp.removeAllItems();
        Org org = (Org) cbOrg.getSelectedItem();
        if (org != null) {
            for (Worker employee : org.getEmployeeDirectory().getEmployeeList()) {
                cbEmp.addItem(employee);
            }
        }
    }

    private void populateRole() {
        cbRole.removeAllItems();
        Org org = (Org) cbOrg.getSelectedItem();
        if (org != null) {
            for (Roles role : org.getSupportedRole()) {
                if (!(role instanceof Admin)) {
                    cbRole.addItem(role);
                }
            }
        }
    }

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblUserAcc.getModel();
        dtm.setRowCount(0);
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                if (!ua.getRole().getName().equals(Roles.RoleType.Applicant.getValue())) {
                    Object row[] = new Object[2];
                    row[0] = ua;
                    row[1] = ua.getRole();
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

        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        tblScrollPane = new javax.swing.JScrollPane();
        tblUserAcc = new javax.swing.JTable();
        btnDeleteAcc = new javax.swing.JButton();
        cbOrg = new javax.swing.JComboBox();
        lblOrg = new javax.swing.JLabel();
        lblEmp = new javax.swing.JLabel();
        cbEmp = new javax.swing.JComboBox();
        cbRole = new javax.swing.JComboBox();
        lblRole = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        txtFldUserName = new javax.swing.JTextField();
        txtFldPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        btnAddAccount = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 242, 225));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backicon.jpeg"))); // NOI18N
        btnBack.setMaximumSize(new java.awt.Dimension(200, 212));
        btnBack.setMinimumSize(new java.awt.Dimension(2200, 212));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 110, 90));

        lblHeader.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage User Account");
        add(lblHeader, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 270, 26));

        tblUserAcc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblUserAcc.setMinimumSize(new java.awt.Dimension(375, 0));
        tblScrollPane.setViewportView(tblUserAcc);

        add(tblScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 500, 170));

        btnDeleteAcc.setBackground(new java.awt.Color(113, 160, 160));
        btnDeleteAcc.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnDeleteAcc.setText("Delete Account");
        btnDeleteAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccActionPerformed(evt);
            }
        });
        add(btnDeleteAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 310, -1, -1));

        cbOrg.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        cbOrg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOrgActionPerformed(evt);
            }
        });
        add(cbOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 146, -1));

        lblOrg.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblOrg.setText("Organization");
        add(lblOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        lblEmp.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblEmp.setText("Employee");
        add(lblEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 80, -1));

        cbEmp.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        cbEmp.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmpActionPerformed(evt);
            }
        });
        add(cbEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 146, -1));

        cbRole.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        cbRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cbRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 146, -1));

        lblRole.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblRole.setText("Role");
        add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 61, -1));

        lblUserName.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblUserName.setText("User Name");
        add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, -1, -1));
        add(txtFldUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, 146, -1));
        add(txtFldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 146, -1));

        lblPassword.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        lblPassword.setText("Password");
        add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 70, -1));

        btnAddAccount.setBackground(new java.awt.Color(113, 160, 160));
        btnAddAccount.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnAddAccount.setText("Add Account");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });
        add(btnAddAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDeleteAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblUserAcc.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the user account?", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                UserAccount ua = (UserAccount) tblUserAcc.getValueAt(selectedRow, 0);

                if (ua.getRole().getName().equals("Admin Type")) {
                    JOptionPane.showMessageDialog(null, "You are not authorized to delete admin", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                enterprise.getUserAccountDirectory().deleteUserAccount(ua);
                for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount userAccount : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (userAccount.equals(ua)) {
                            organization.getUserAccountDirectory().deleteUserAccount(ua);
                            break;
                        }
                    }
                }

                populateTable();
                JOptionPane.showMessageDialog(null, "User account deleted successfully", "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } else {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteAccActionPerformed

    private void cbOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOrgActionPerformed

        populateEmployee();
        populateRole();
    }//GEN-LAST:event_cbOrgActionPerformed

    private void cbEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmpActionPerformed

    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        // TODO add your handling code here:

        try {
            String userName = txtFldUserName.getText();
            String password = txtFldPassword.getText();
            Org organization = (Org) cbOrg.getSelectedItem();
            Worker employee = (Worker) cbEmp.getSelectedItem();
            Roles role = (Roles) cbRole.getSelectedItem();

            if (!userName.equals("") && !password.equals("")) {

                // validate username
                String regex = "^[a-z A-Z]+$";
                Pattern namePattern = Pattern.compile(regex);
                Matcher unameMatcher = namePattern.matcher(userName);

                if (!unameMatcher.matches()) {
                    JOptionPane.showMessageDialog(null, "Invalid characters in user name", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (password.length() > 10) {
                    JOptionPane.showMessageDialog(null, "Password should not have more than 10 characters", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                } else if (password.length() < 4) {
                    JOptionPane.showMessageDialog(null, "Password should have 4 to 10 characters", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                // check if username is unique
                if (system.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                    if (role.getName() == "Manager Type") {
                        // dont add manager is already exists
                        if (!organization.getUserAccountDirectory().checkIfManagerExists(organization)) {
                            organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                            enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                            system.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                            JOptionPane.showMessageDialog(null, "User account added successfully", "Warning", JOptionPane.WARNING_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Manager already already exists", "Info", JOptionPane.INFORMATION_MESSAGE);
                        }
                    } else {
                        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                        enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                        system.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                        JOptionPane.showMessageDialog(null, "User account added successfully", "Warning", JOptionPane.WARNING_MESSAGE);

                    }

                } else {
                    JOptionPane.showMessageDialog(null, "User name already exists", "Info", JOptionPane.INFORMATION_MESSAGE);
                }

                populateTable();
                txtFldPassword.setText("");
                txtFldUserName.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Enter values for all field", "Warning", JOptionPane.WARNING_MESSAGE);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter values for all field", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAddAccountActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAccount;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteAcc;
    private javax.swing.JComboBox cbEmp;
    private javax.swing.JComboBox cbOrg;
    private javax.swing.JComboBox cbRole;
    private javax.swing.JLabel lblEmp;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblOrg;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JTable tblUserAcc;
    private javax.swing.JTextField txtFldPassword;
    private javax.swing.JTextField txtFldUserName;
    // End of variables declaration//GEN-END:variables
}