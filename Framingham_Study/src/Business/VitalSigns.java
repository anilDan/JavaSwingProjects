/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author Anil
 */
public class VitalSigns {

    private Date date;
    //Stroke Paramenters
    private int cholestrol;
    private int ldl_c;
    private int hdl_c;
    private int bloodPressure;
    private boolean bpTreatment;
    private boolean smoker;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCholestrol() {
        return cholestrol;
    }

    public void setCholestrol(int cholestrol) {
        this.cholestrol = cholestrol;
    }

    public int getHdl_c() {
        return hdl_c;
    }

    public void setHdl_c(int hdl_c) {
        this.hdl_c = hdl_c;
    }

    public int getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean isBpTreatment() {
        return bpTreatment;
    }

    public void setBpTreatment(boolean bpTreatment) {
        this.bpTreatment = bpTreatment;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public int getLdl_c() {
        return ldl_c;
    }

    public void setLdl_c(int ldl_c) {
        this.ldl_c = ldl_c;
    }
}
