/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Anil
 */
public class VitalSignHistory {

    private ArrayList<VitalSigns> vitalSignsList;

    public VitalSignHistory() {
        vitalSignsList = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignsList() {
        return vitalSignsList;
    }

    public VitalSigns addVitalSigns() {
        VitalSigns v = new VitalSigns();
        vitalSignsList.add(v);
        return v;
    }
}
