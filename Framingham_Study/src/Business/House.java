/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Anil
 */
public class House {

    private String houseNum;
    private String houseName;
    private String houseAddress;
    private FamilyDirectory familyDirectory;
    private static int houseCount = 0;
    private PersonDirectory personDirectory;

    public House() {
        houseCount++;
        houseNum = String.valueOf(houseCount);
        familyDirectory = new FamilyDirectory();
        personDirectory = new PersonDirectory();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public FamilyDirectory getFamilyDirectory() {
        return familyDirectory;
    }

    public void setFamilyDirectory(FamilyDirectory familyDirectory) {
        this.familyDirectory = familyDirectory;
    }

    public String getHouseNum() {
        return houseNum;
    }

    public static int getCount() {
        return houseCount;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }
}
