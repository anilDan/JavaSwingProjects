/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.NurseOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.NurseRole.NurseWorkAreaJPanel;

/**
 *
 * @author Anil
 */
public class NurseRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new NurseWorkAreaJPanel(userProcessContainer, account, (NurseOrganization)organization, enterprise, network);
    
    }
}
