/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.Role.Role;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anil
 */
public class EcoSystem extends Organization {

    private static EcoSystem system;
    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static EcoSystem getInstance() {
        if (system == null) {
            system = new EcoSystem();
        }
        return system;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<Network>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean isUsernameUnique(String userName) {
        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
            return false;
        }

        for (Network network : this.getNetworkList()) {
            //Step 2-a: Check against each enterprise
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (!enterprise.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                    return false;
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        if (!organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName)) {
                            return false;
                        }
                    }
                }
            }
    
return true;
    }
}