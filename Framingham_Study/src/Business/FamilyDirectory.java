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
public class FamilyDirectory {

    private ArrayList<Family> familyList;

    public FamilyDirectory() {
        familyList = new ArrayList<Family>();
    }

    public ArrayList<Family> getFamilyList() {
        return familyList;
    }

    public Family addFamily() {
        Family f = new Family();
        familyList.add(f);
        return f;
    }
}
