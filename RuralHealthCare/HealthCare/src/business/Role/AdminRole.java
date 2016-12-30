/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import UserInterface.AdministrativeRole.AdminWorkAreaJPanel;
import business.Network.Network;
import business.Organization.AdminOrganization;
import javax.swing.JPanel;

/**
 *
 * @author Anil
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,Organization organization, Enterprise enterprise, EcoSystem system, Network network) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, (AdminOrganization)organization, enterprise, system, network);
    }

    
    
}
