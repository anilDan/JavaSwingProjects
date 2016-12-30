/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;
import java.util.TreeMap;

/**
 *
 * @author Anil
 */
public class RiskScoreHCHD {
    public TreeMap ageGrp;
    
    //Male
    public TreeMap ageMale;
    public TreeMap hdlMale;
    public TreeMap<Integer, int[]> totalCholestrolMale;
    public TreeMap<Boolean, int[]> smokerMale;
    public TreeMap treatedBPMale;
    public TreeMap unTreatedBPMale;
    public TreeMap riskScoreMale;
    
    //Female
    public TreeMap ageFemale;
    public TreeMap hdlFemale;
    public TreeMap<Integer, int[]> totalCholestrolFemale;
    public TreeMap<Boolean, int[]> smokerFemale;
    public TreeMap treatedBPFemale;
    public TreeMap unTreatedBPFemale;
    public TreeMap riskScoreFemale;
    
    public RiskScoreHCHD()
    {
        ageGrp = new TreeMap<>();
        ageGrp.put(0, 0);
        ageGrp.put(20, 0);
        ageGrp.put(40, 1);
        ageGrp.put(50, 2);
        ageGrp.put(60, 3);
        ageGrp.put(70, 4);
        
        //Male
        ageMale = new TreeMap<>();
        ageMale.put(0,-9);
        ageMale.put(20,-9);
        ageMale.put(35,-4);
        ageMale.put(40,0);
        ageMale.put(45,3);
        ageMale.put(50,6);
        ageMale.put(55,8);
        ageMale.put(60,10);
        ageMale.put(65,11);
        ageMale.put(70,12);
        ageMale.put(75,13);
        
        
        hdlMale = new TreeMap<>();
        hdlMale.put(60, -1);
        hdlMale.put(50, 0);
        hdlMale.put(40, 1);
        hdlMale.put(20, 2);
        
        totalCholestrolMale = new TreeMap<>();
        totalCholestrolMale.put(100, new int[]{0, 0, 0, 0, 0});
        totalCholestrolMale.put(160, new int[]{4, 3, 2, 1, 0});
        totalCholestrolMale.put(200, new int[]{7, 5, 3, 1, 0});
        totalCholestrolMale.put(240, new int[]{9, 6, 4, 2, 1});
        totalCholestrolMale.put(280, new int[]{11, 8, 5, 3, 1});
        
        smokerMale = new TreeMap<>();
        smokerMale.put(false, new int[]{0,0,0,0,0});
        smokerMale.put(true, new int[]{8,5,3,1,1});
        
        treatedBPMale = new TreeMap<>();
        treatedBPMale.put(100, 0);
        treatedBPMale.put(120, 1);
        treatedBPMale.put(130, 2);
        treatedBPMale.put(140, 2);
        treatedBPMale.put(160, 3);
        
        unTreatedBPMale = new TreeMap<>();
        unTreatedBPMale.put(100, 0);
        unTreatedBPMale.put(120, 0);
        unTreatedBPMale.put(130, 1);
        unTreatedBPMale.put(140, 1);
        unTreatedBPMale.put(160, 2);
        
        riskScoreMale = new TreeMap<>();
        riskScoreMale.put(-10, 0);
        riskScoreMale.put(0, 1);
        riskScoreMale.put(1, 1);
        riskScoreMale.put(2, 1);
        riskScoreMale.put(3, 1);
        riskScoreMale.put(4, 1);
        riskScoreMale.put(5, 2);
        riskScoreMale.put(6, 2);
        riskScoreMale.put(7, 3);
        riskScoreMale.put(8, 4);
        riskScoreMale.put(9, 5);
        riskScoreMale.put(10, 6);
        riskScoreMale.put(11, 8);
        riskScoreMale.put(12, 10);
        riskScoreMale.put(13, 12);
        riskScoreMale.put(14, 16);
        riskScoreMale.put(15, 20);
        riskScoreMale.put(16, 25);
        riskScoreMale.put(17, 30);
        
        
    
        //Female
        ageFemale = new TreeMap<>();
        ageFemale.put(0,-7);
        ageFemale.put(20,-7);
        ageFemale.put(35,-3);
        ageFemale.put(40,0);
        ageFemale.put(45,3);
        ageFemale.put(50,6);
        ageFemale.put(55,8);
        ageFemale.put(60,10);
        ageFemale.put(65,12);
        ageFemale.put(70,14);
        ageFemale.put(75,16);
        
        
        hdlFemale = new TreeMap<>();
        hdlFemale.put(60, -1);
        hdlFemale.put(50, 0);
        hdlFemale.put(40, 1);
        hdlFemale.put(20, 2);
        
        totalCholestrolFemale = new TreeMap<>();
        totalCholestrolFemale.put(100, new int[]{0, 0, 0, 0, 0});
        totalCholestrolFemale.put(160, new int[]{4, 3, 2, 1, 1});
        totalCholestrolFemale.put(200, new int[]{8, 6, 4, 2, 1});
        totalCholestrolFemale.put(240, new int[]{11, 8, 5, 3, 2});
        totalCholestrolFemale.put(280, new int[]{13, 10, 7, 4, 2});
        
        smokerFemale = new TreeMap<>();
        smokerFemale.put(false, new int[]{0,0,0,0,0});
        smokerFemale.put(true, new int[]{9,7,4,2,1});
        
        treatedBPFemale = new TreeMap<>();
        treatedBPFemale.put(100, 0);
        treatedBPFemale.put(120, 3);
        treatedBPFemale.put(130, 4);
        treatedBPFemale.put(140, 5);
        treatedBPFemale.put(160, 6);
        
        unTreatedBPFemale = new TreeMap<>();
        unTreatedBPFemale.put(100, 0);
        unTreatedBPFemale.put(120, 1);
        unTreatedBPFemale.put(130, 2);
        unTreatedBPFemale.put(140, 3);
        unTreatedBPFemale.put(160, 4);
        
        riskScoreFemale = new TreeMap<>();
        riskScoreFemale.put(-10, 0);
        riskScoreFemale.put(9, 1);
        riskScoreFemale.put(10, 1);
        riskScoreFemale.put(11, 1);
        riskScoreFemale.put(12, 1);
        riskScoreFemale.put(13, 2);
        riskScoreFemale.put(14, 2);
        riskScoreFemale.put(15, 3);
        riskScoreFemale.put(16, 4);
        riskScoreFemale.put(17, 5);
        riskScoreFemale.put(18, 6);
        riskScoreFemale.put(19, 8);
        riskScoreFemale.put(20, 11);
        riskScoreFemale.put(21, 14);
        riskScoreFemale.put(22, 17);
        riskScoreFemale.put(23, 22);
        riskScoreFemale.put(24, 27);
        riskScoreFemale.put(25, 30);
    }
    
    
}
