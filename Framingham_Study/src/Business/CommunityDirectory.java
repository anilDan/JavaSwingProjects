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
public class CommunityDirectory {

    private ArrayList<Community> communityList;

    public CommunityDirectory() {
        communityList = new ArrayList<Community>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public Community addCommunity() {
        Community c = new Community();
        communityList.add(c);
        return c;
    }
}
