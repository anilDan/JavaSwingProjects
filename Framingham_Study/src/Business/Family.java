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
public class Family {

    private String familyName;
    private String familyId;
    private PersonDirectory personDirectory;
    private static int familyCount = 0;

    public Family() {
        familyCount++;
        familyId = String.valueOf(familyCount);
        personDirectory = new PersonDirectory();
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFamilyId() {
        return familyId;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public static int getFamilyCount() {
        return familyCount;
    }
}
