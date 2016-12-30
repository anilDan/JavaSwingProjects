/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Anil
 */
public class Patient {
    private String fname;
    private String lname;
    private int age;
    private String sex;
    private String contact;
    private static int count = 1000;
    private int patientID;
    private String dateAdmitted;
    private ArrayList<VitalSigns> vitalSignHistory;
    private ArrayList<Comments> commentHistory;
    
    public Patient()
    {
        patientID = count++;
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calender = Calendar.getInstance();
        dateAdmitted = df.format(calender.getTime());
        this.vitalSignHistory = new ArrayList<>();
        this.commentHistory = new ArrayList<>();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getPatientID() {
        return patientID;
    }
    
    @Override
    public String toString()
    {
        return fname + " " + lname;
    }

    public String getDateAdmitted() {
        return dateAdmitted;
    }

    public ArrayList<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public ArrayList<Comments> getCommentHistory() {
        return commentHistory;
    }
    
    
}
