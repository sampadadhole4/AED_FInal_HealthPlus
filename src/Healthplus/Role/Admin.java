/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Healthplus.Role;
import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import UI.AdminWorkArea.AdminHomeJPanel;
import javax.swing.JPanel;

/**
 *
 * @author shalini
 */
public class Admin extends Roles{
    public Admin(){
        super(Roles.RoleType.Admin.getValue());
    }
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, E_System business, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise) {
        return new AdminHomeJPanel(userProcessContainer, business, dB4OUtil, userAccount, enterprise);
    }
}
