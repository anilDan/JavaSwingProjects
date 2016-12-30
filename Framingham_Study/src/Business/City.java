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
public class City {

    private String cityName = "FramingHam";
    private CommunityDirectory communityDirectory;
    private PersonDirectory personDirectory;

    public City() {
        communityDirectory = new CommunityDirectory();
        personDirectory = new PersonDirectory();
    }

    public CommunityDirectory getCommunityDirectory() {
        return communityDirectory;
    }

    public void setCommunityDirectory(CommunityDirectory communityDirectory) {
        this.communityDirectory = communityDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public String getCityName() {
        return cityName;
    }
}
