/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Enterprise.Enterprise.EnterpriseType;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankit
 */
public class SupplierEnterprise extends Enterprise{
     
    public SupplierEnterprise(String name)
    {
        super(name, EnterpriseType.SUPPLIER);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
