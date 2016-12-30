/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.EquipmentSupplierRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankit
 */
public class EquipmentSupplierOrganization extends Organization{
    
    public EquipmentSupplierOrganization() {
        super(Organization.Type.EquipmentSupplier.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EquipmentSupplierRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Equipment Organization";
    }
    
}
