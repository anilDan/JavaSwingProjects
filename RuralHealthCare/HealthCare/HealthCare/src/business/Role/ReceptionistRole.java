/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Organization.ReceptionistOrganization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ReceptionistRole.ReceptionistWorkAreaJPanel;

/**
 *
 * @author Anil
 */
public class ReceptionistRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) 
    {
        return new ReceptionistWorkAreaJPanel(container, account, (ReceptionistOrganization)organization, enterprise, network);
    
    }
}
