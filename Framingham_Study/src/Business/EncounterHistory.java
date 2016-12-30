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
public class EncounterHistory {

    private ArrayList<Encounter> encounterList;

    public EncounterHistory() {
        encounterList = new ArrayList<Encounter>();
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public Encounter addEncounter() {
        Encounter e = new Encounter();
        encounterList.add(e);
        return e;
    }
}
