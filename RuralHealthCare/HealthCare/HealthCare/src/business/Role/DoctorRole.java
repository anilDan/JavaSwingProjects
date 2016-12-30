/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.DoctorOrganization;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
//import userInterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;
import userInterface.DoctorRole.DoctorContainer;


/**
 *
 * @author Anil
 */
public class DoctorRole extends Role{
    

    @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, Network network) {
        return new DoctorContainer(container, account, (DoctorOrganization)organization, enterprise, network);
    }

    
    
    
    
}
