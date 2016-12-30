/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import java.util.Date;

/**
 *
 * @author Anil
 */
public class Schedule {
    
    private Date date;
    private String time;
    private String location;
    private float availHours;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAvailHours(float availHours) {
        this.availHours = availHours;
    }

    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public float getAvailHours() {
        return availHours;
    }
    
    @Override
    public String toString()
    {
        return location;
    }
    
}
