/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.BloodBankOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.BloodSupplier.BloodSupplierWorkAreaJPanel;

/**
 *
 * @author Anil
 */
public class BloodSupplierRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new BloodSupplierWorkAreaJPanel(container, userAccount,(BloodBankOrganization) organization, enterprise, network);
    
    }
}
