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
public class HouseDirectory {

    private ArrayList<House> houseList;

    public HouseDirectory() {
        houseList = new ArrayList<House>();
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public House addHouse() {
        House h = new House();
        houseList.add(h);
        return h;
    }
}
