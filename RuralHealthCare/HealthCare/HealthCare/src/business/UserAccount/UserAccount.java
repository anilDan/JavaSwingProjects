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
         medicine1.setMedicineName("Ipill");
         medicine1.setQuantity(100);
    }
    
}