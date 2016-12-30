package business.Organization;


import business.Organization.Organization;
import business.Role.Role;
import business.Role.SupplierRole;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankit
 */
public class SupplierOrganization extends Organization{
    public SupplierOrganization() {
        super(Organization.Type.Supplier.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SupplierRole());
        return roles;
    }

    @Override
    public String getType() {
    return "Supplier Organization";
    }
    
}
