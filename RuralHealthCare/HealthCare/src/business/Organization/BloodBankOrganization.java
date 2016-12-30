/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.BloodSupplierRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anil
 */
public class BloodBankOrganization extends Organization {
    
    public BloodBankOrganization() {
        super(Organization.Type.BloodSupplier.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodSupplierRole());
        return roles;
    }

    @Override
    public String getType() {
    return "BloodBank Organization";
    }
}
