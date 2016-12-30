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
public class Community {

    private String communityId;
    private String communityName;
    private HouseDirectory houseDirectory;
    private PersonDirectory personDirectory;
    private static int communityCount = 0;

    public Community() {
        communityCount++;
        communityId = String.valueOf(communityCount);
        houseDirectory = new HouseDirectory();
        personDirectory = new PersonDirectory();
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

    public HouseDirectory getHouseDirectory() {
        return houseDirectory;
    }

    public void setHouseDirectory(HouseDirectory houseDirectory) {
        this.houseDirectory = houseDirectory;
    }

    public String getCommunityId() {
        return communityId;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public static int getCount() {
        return communityCount;
    }
}
