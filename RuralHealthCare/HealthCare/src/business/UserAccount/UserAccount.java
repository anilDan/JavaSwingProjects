/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.UserAccount;

import business.Employee.Employee;
import business.Inventory.Medicine;
import business.Inventory.MedicineDirectory;
import business.Role.Role;
import business.WorkQueue.ScheduleDirectory;
import business.WorkQueue.WorkQueue;

/**
 *
 * @author Anil
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;
    //private ArrayList<Schedule> scheduleList;
    private ScheduleDirectory scheduleDirectory;
    private MedicineDirectory medicineDirectory;


    public UserAccount() {
        workQueue = new WorkQueue();
        scheduleDirectory = new ScheduleDirectory();
        medicineDirectory = new MedicineDirectory();
        medicineList();
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public ScheduleDirectory getScheduleDirectory() {
        return scheduleDirectory;
    }
    
    @Override
    public String toString() {
        return username;
    } 
    
    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }
   private void medicineList()
   {
       Medicine medicine= medicineDirectory.add();
        medicine.setMedicineName("Advil");
        medicine.setQuantity(100);
        
        Medicine medicine1=medicineDirectory.add();
        medicine1.setMedicineName("Crocin");
        medicine1.setQuantity(100);
        
        Medicine medicine2=medicineDirectory.add();
        medicine2.setMedicineName("Syringes");
        medicine2.setQuantity(100);
        
        Medicine medicine3=medicineDirectory.add();
        medicine3.setMedicineName("Dolo 650");
        medicine3.setQuantity(100);
        
        Medicine medicine4=medicineDirectory.add();
        medicine4.setMedicineName("Cetrizine");
        medicine4.setQuantity(100);
        
        Medicine medicine5=medicineDirectory.add();
        medicine5.setMedicineName("Combiflam");
        medicine5.setQuantity(100);
        
        Medicine medicine6=medicineDirectory.add();
        medicine6.setMedicineName("Glucose Bottles");
        medicine6.setQuantity(100);
        
        Medicine medicine7=medicineDirectory.add();
        medicine7.setMedicineName("Paracetamol");
        medicine7.setQuantity(100);
        
        Medicine medicine8=medicineDirectory.add();
        medicine8.setMedicineName("Bandages");
        medicine8.setQuantity(100);
        
        Medicine medicine9=medicineDirectory.add();
        medicine9.setMedicineName("Avomine");
        medicine9.setQuantity(100);
        
        Medicine medicine10=medicineDirectory.add();
        medicine10.setMedicineName("Antiseptic Liquid");
        medicine10.setQuantity(100);
   }
}