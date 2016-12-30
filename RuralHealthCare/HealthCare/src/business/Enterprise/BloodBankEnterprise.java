/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anil
 */
public class BloodBankEnterprise extends Enterprise {

    
    public BloodBankEnterprise(String name)
    {
        super(name, EnterpriseType.BLOOD_BANK);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
