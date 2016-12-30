/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author Ankit
 */
public class EquipmentDirectory {
    private ArrayList<Equipment> equipmentDirectory;

    public ArrayList<Equipment> getEquipmentDirectory() {
        return equipmentDirectory;
    }

    public void setEquipmentDirectory(ArrayList<Equipment> equipmentDirectory) {
        this.equipmentDirectory = equipmentDirectory;
    }
    
    

   public Equipment addEquipment()
   {
     Equipment equipment = new Equipment();
     equipmentDirectory.add(equipment);
     return equipment;
   }
   
   
}
