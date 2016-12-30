/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Patient;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Anil
 */
public class VitalSigns {
    
    private String dateRecorded;
    private float bodyTemp;
    private float pulseRate;
    private float respirationRate;
    private float bloodPressure;
    private String comments;
    
    public VitalSigns()
    {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        Calendar calender = Calendar.getInstance();
        dateRecorded = df.format(calender.getTime());
    }

    public String getDateRecorded() {
        return dateRecorded;
    }

    public float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public float getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(float pulseRate) {
        this.pulseRate = pulseRate;
    }

    public float getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(float respirationRate) {
        this.respirationRate = respirationRate;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
    
//    @Override
//    public String toString()
//    {
//        return bloodPressure;
//    }
}
