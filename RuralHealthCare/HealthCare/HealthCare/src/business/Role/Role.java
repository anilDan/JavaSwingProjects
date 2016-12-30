/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Anil
 */
public abstract class Role {
    
    public enum RoleType{
        ADMIN("Admin"),
        DOCTOR("Doctor"),
        LABASSISTANT("Lab Assistant"),
        NURSE("Nurse"),
        RECEPTIONIST("Receptionist"),
        PHARMACIST("Pharmacist"),
        SUPPLIER("Medicine Supplier"),
        EQUIPMENT_SUPPLIERS("Equipment Supplier")
        ;
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}