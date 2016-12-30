/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;


import business.Inventory.Blood;
import business.Inventory.BloodDirectory;
import business.Role.NurseRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Anil
 */
public class NurseOrganization extends Organization {
 
    BloodDirectory bloodDirectory;
    
        public NurseOrganization() {
        super(Organization.Type.Nurse.getValue());
        bloodDirectory = new BloodDirectory();
        bloodList();
        }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NurseRole());
        return roles;
    }
    @Override
    public String getType() {
    return "Nurse Organization";
    }

    public BloodDirectory getBloodDirectory() {
        return bloodDirectory;
    }
    
    private void bloodList()
    {
        Blood blood1 = bloodDirectory.addBlood();
        blood1.setType("A+");
        blood1.setQuantity(10);
        
        
        Blood blood2 = bloodDirectory.addBlood();
        blood2.setType("A-");
        blood2.setQuantity(5);
        
        Blood blood3 = bloodDirectory.addBlood();
        blood3.setType("B+");
        blood3.setQuantity(10);
        
        Blood blood4 = bloodDirectory.addBlood();
        blood4.setType("B-");
        blood4.setQuantity(5);
        
        Blood blood5 = bloodDirectory.addBlood();
        blood5.setType("AB+");
        blood5.setQuantity(8);
        
        Blood blood6 = bloodDirectory.addBlood();
        blood6.setType("AB-");
        blood6.setQuantity(3);
        
        Blood blood7 = bloodDirectory.addBlood();
        blood7.setType("O+");
        blood7.setQuantity(5);
        
        Blood blood8 = bloodDirectory.addBlood();
        blood8.setType("O-");
        blood8.setQuantity(2);
    }
}
