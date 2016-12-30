/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Inventory;

import java.util.ArrayList;

/**
 *
 * @author ketul
 */
public class MedicineDirectory {
    private ArrayList<Medicine> medicineList;
    
    public MedicineDirectory()
    {
      medicineList= new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }
    
   
   public Medicine add()
   {
     Medicine medicine= new Medicine();
     medicineList.add(medicine);
     return medicine;
    }
    
}
