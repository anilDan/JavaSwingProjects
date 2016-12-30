/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Anil
 */
public class Person {

    private String personId;
    private String name;
    private Date birthDate;
    private String gender;
    Person father;
    Person mother;
    private ArrayList<Person> siblings;
    private Encounter encounterHistory;
    private VitalSignHistory vitalSignHistory;
    private static int count = 0;

    public Person() {
        count++;
        personId = String.valueOf(count);
        encounterHistory = new Encounter();
        vitalSignHistory = new VitalSignHistory();
        siblings = new ArrayList<Person>();
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Encounter getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(Encounter encounterHistory) {
        this.encounterHistory = encounterHistory;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public Person addSiblings() {
        Person p = new Person();
        siblings.add(p);
        return p;
    }

    public static int getCount() {
        return count;
    }
}
