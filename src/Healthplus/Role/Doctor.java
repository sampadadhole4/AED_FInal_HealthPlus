package Healthplus.Role;

import Healthplus.DB4OUtil.DB4OUtil;
import Healthplus.E_System;
import javax.swing.JPanel;
import Healthplus.Enterprises.Enterprise;
import Healthplus.Org.Org;
import Healthplus.UserAccount.UserAccount;
import UI.DoctorWorkArea.DoctorHomeJPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author shalini
 */
public class Doctor extends Roles {
    public Doctor(){
        super(Roles.RoleType.Doctor.getValue());
    }
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, E_System business, DB4OUtil dB4OUtil, UserAccount userAccount, Org organization, Enterprise enterprise) {
        return new DoctorHomeJPanel(userProcessContainer, business, dB4OUtil, userAccount, organization, enterprise);
    }
}
