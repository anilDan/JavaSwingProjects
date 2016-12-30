/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import Business.City;
import Business.Community;
import Business.Family;
import Business.House;
import Business.Person;
import Business.VitalSigns;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Anil
 */
public class DisplayResults {

    //RiskScores riskScores;
    // Method to calcualate riskscore for all the male
    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public static double calculateRiskMale(VitalSigns v, Person p) {
        RiskScoreHCHD risk = new RiskScoreHCHD();
        int ageScore;
        int[] cholScore;
        int[] smokeScore;
        int hdlScore;
        int bp;
        int totalScore;

        int ageGrp;

        ageGrp = (int) risk.ageGrp.floorEntry(v.getDate().getYear() - p.getBirthDate().getYear()).getValue();

        ageScore = (int) risk.ageMale.floorEntry(v.getDate().getYear() - p.getBirthDate().getYear()).getValue();
        cholScore = (int[]) risk.totalCholestrolMale.floorEntry(v.getCholestrol()).getValue();
        hdlScore = (int) risk.hdlMale.floorEntry(v.getHdl_c()).getValue();
        //if(v.get)
        if (v.isBpTreatment() == true) {
            bp = (int) risk.treatedBPMale.floorEntry(v.getCholestrol()).getValue();
        } else {
            bp = (int) risk.unTreatedBPMale.floorEntry(v.getCholestrol()).getValue();
        }

        if (v.isSmoker() == true) {
            smokeScore = (int[]) risk.smokerMale.floorEntry(v.isSmoker()).getValue();
        } else {
            smokeScore = (int[]) risk.smokerMale.floorEntry(v.isSmoker()).getValue();
        }

        //risk.ageMale.fl
        totalScore = ageScore + hdlScore + smokeScore[ageGrp] + bp + cholScore[ageGrp];
        //totalScore = ageScore + hdlScore + smokeScore[ageGrp] + bp;

        return (int) risk.riskScoreMale.floorEntry(totalScore).getValue();

    }

    //Method to calculate risk score for all the females
    public static double calculateRiskFemale(VitalSigns v, Person p) {
        RiskScoreHCHD risk = new RiskScoreHCHD();
        int ageScore;
        int[] cholScore;
        int[] smokeScore;
        int hdlScore;
        int bp;
        int totalScore;

        int ageGrp;

        ageGrp = (int) risk.ageGrp.floorEntry(v.getDate().getYear() - p.getBirthDate().getYear()).getValue();

        ageScore = (int) risk.ageFemale.floorEntry(v.getDate().getYear() - p.getBirthDate().getYear()).getValue();
        cholScore = (int[]) risk.totalCholestrolFemale.floorEntry(v.getCholestrol()).getValue();
        hdlScore = (int) risk.hdlFemale.floorEntry(v.getHdl_c()).getValue();
        //if(v.get)
        if (v.isBpTreatment() == true) {
            bp = (int) risk.treatedBPFemale.floorEntry(v.getCholestrol()).getValue();
        } else {
            bp = (int) risk.unTreatedBPFemale.floorEntry(v.getCholestrol()).getValue();
        }

        if (v.isSmoker() == true) {
            smokeScore = (int[]) risk.smokerFemale.floorEntry(v.isSmoker()).getValue();
        } else {
            smokeScore = (int[]) risk.smokerFemale.floorEntry(v.isSmoker()).getValue();
        }

        //risk.ageMale.fl
        totalScore = ageScore + hdlScore + smokeScore[ageGrp] + bp + cholScore[ageGrp];
        //totalScore = ageScore + hdlScore + smokeScore[ageGrp] + bp;

        return (int) risk.riskScoreFemale.floorEntry(totalScore).getValue();

    }

    // Method to calculate the risk of an individaul
    public static void calculateRisk() {
        System.out.println("Please Enter below details:");
        try {
            System.out.println("Age:");
            Scanner lineReader = new Scanner(System.in);
            int age = lineReader.nextInt();

            if ((age < 10 || age > 120)) {
                System.out.println("Please enter valid age.");
                return;
            }

            System.out.println("Gender(M/F):");
            String gender = lineReader.next();
            if (!gender.matches("[MFmf]")) {
                System.out.println("Please enter valid gender");
                return;
            }

            System.out.println("Cholestrol(120-400):");
            int cholestrol = lineReader.nextInt();

            if (cholestrol < 120 || cholestrol > 400) {
                System.out.println("Please enter values in the given range.");
                return;
            }

            System.out.println("High Density Lipoprotien - HDL(20-80):");
            int hdl = lineReader.nextInt();
            if (hdl < 20 || hdl > 80) {
                System.out.println("Please enter values in the given range.");
                return;
            }

            System.out.println("Systolic BP(100-200):");
            int bp = lineReader.nextInt();
            if (bp < 100 || bp > 200) {
                System.out.println("Please enter values in the given range.");
                return;
            }

            System.out.println("Is BP treated(1 for Yes, 0 for No):");
            int bpStatus = lineReader.nextInt();
            if (bpStatus != 1 && bpStatus != 0) {
                System.out.println("Please enter valid answer.");
                return;
            }

            System.out.println("Are you a smoker?(1 for Yes, 0 for No):");
            int smokerStatus = lineReader.nextInt();
            if (bpStatus != 1 && bpStatus != 0) {
                System.out.println("Please enter valid answer.");
                return;
            }

            RiskScoreHCHD risk = new RiskScoreHCHD();
            int ageScore;
            int[] cholScore;
            int[] smokeScore;
            int hdlScore;
            int bpScore;
            int totalScore;
            int ageGrp;

            if (gender.equalsIgnoreCase("m")) {
                ageGrp = (int) risk.ageGrp.floorEntry(age).getValue();
                ageScore = (int) risk.ageMale.floorEntry(age).getValue();
                cholScore = (int[]) risk.totalCholestrolMale.floorEntry(cholestrol).getValue();
                hdlScore = (int) risk.hdlMale.floorEntry(hdl).getValue();
                if (smokerStatus == 1) {
                    smokeScore = (int[]) risk.smokerMale.floorEntry(Boolean.TRUE).getValue();
                } else {
                    smokeScore = (int[]) risk.smokerMale.floorEntry(Boolean.FALSE).getValue();
                }
                if (bpStatus == 1) {
                    bpScore = (int) risk.treatedBPMale.floorEntry(bp).getValue();
                } else {
                    bpScore = (int) risk.unTreatedBPMale.floorEntry(bp).getValue();
                }

                totalScore = ageScore + cholScore[ageGrp] + hdlScore + smokeScore[ageGrp] + bpScore;
                int riskScore = (int) risk.riskScoreMale.floorEntry(totalScore).getValue();
                System.out.println("Your Risk Score is " + totalScore);
                System.out.println("Your 10-year Risk is " + riskScore + "%");
                System.out.println("");
                System.out.println("Suggestions:");
                if (riskScore < 5) {
                    System.out.println("Coronary Heart Disease extremely Unlikely");
                } else if (riskScore > 3 && riskScore < 10) {
                    System.out.println("You are doing most things right, but you can probably do some fine-tuning.");
                    System.out.println(" If you pay attention, you will live a long, healthy, active, and productive life.");
                } else if (riskScore > 9 && riskScore < 14) {
                    System.out.println("You do some things right, but you have work to do.");
                    System.out.println(" Identify your risk factors and take corrective action.");
                } else if (riskScore > 13 && riskScore < 17) {
                    System.out.println("You stand a good chance of having a coronary heart disease.");
                    System.out.println(" If you have already had a encounter, you are at high risk for a repeat performance.");
                } else if (riskScore > 16) {
                    System.out.println("Unless you have a death wish, you have work to do.It will take time and effort to move to the lower risk categories.  ");
                    System.out.println("Don’t bite off too much at one time.The process of change should be slow, committed, persistent, and permanent.   ");
                }
            } else {
                ageGrp = (int) risk.ageGrp.floorEntry(age).getValue();
                ageScore = (int) risk.ageFemale.floorEntry(age).getValue();
                cholScore = (int[]) risk.totalCholestrolFemale.floorEntry(cholestrol).getValue();
                hdlScore = (int) risk.hdlFemale.floorEntry(hdl).getValue();
                if (smokerStatus == 1) {
                    smokeScore = (int[]) risk.smokerFemale.floorEntry(Boolean.TRUE).getValue();
                } else {
                    smokeScore = (int[]) risk.smokerFemale.floorEntry(Boolean.FALSE).getValue();
                }
                if (bpStatus == 1) {
                    bpScore = (int) risk.treatedBPFemale.floorEntry(bp).getValue();
                } else {
                    bpScore = (int) risk.unTreatedBPFemale.floorEntry(bp).getValue();
                }

                totalScore = ageScore + cholScore[ageGrp] + hdlScore + smokeScore[ageGrp] + bpScore;
                System.out.println("Your Risk Score is " + totalScore);
                int riskScore = (int) risk.riskScoreFemale.floorEntry(totalScore).getValue();
                System.out.println("Your 10-year Risk is " + riskScore + "%");
                System.out.println("");
                System.out.println("Suggestions:");
                if (riskScore < 5) {
                    System.out.println("Coronary Heart Disease extremely Unlikely");
                } else if (riskScore > 3 && riskScore < 10) {
                    System.out.println("You are doing most things right, but you can probably do some fine-tuning.");
                    System.out.println(" If you pay attention, you will live a long, healthy, active, and productive life.");
                } else if (riskScore > 9 && riskScore < 14) {
                    System.out.println("You do some things right, but you have work to do.");
                    System.out.println(" Identify your risk factors and take corrective action.");
                } else if (riskScore > 13 && riskScore < 17) {
                    System.out.println("You stand a good chance of having a coronary heart disease.");
                    System.out.println(" If you have already had a encounter, you are at high risk for a repeat performance.");
                } else if (riskScore > 16) {
                    System.out.println("Unless you have a death wish, you have work to do.It will take time and effort to move to the lower risk categories.  ");
                    System.out.println("Don’t bite off too much at one time.The process of change should be slow, committed, persistent, and permanent.   ");
                }
            }
        } catch (Exception e) {
            System.out.println("Please enter proper values.");
        }
    }

    //Method to calculate the risk of the whole city
    public static void cityRisk(int pid) throws ParseException {

        City city = InitializationData.initializeCity();
        System.out.println("City : " + city.getCityName());
        for (Community community : city.getCommunityDirectory().getCommunityList()) {
            //System.out.println("Community : " + community.getCommunityName());
            for (House house : community.getHouseDirectory().getHouseList()) {
                //System.out.println("House Number: " + house.getHouseNum());
                for (Family family : house.getFamilyDirectory().getFamilyList()) {
                    //System.out.print("Family: ");
                    //System.out.println(family.getFamilyId() + ". " + family.getFamilyName());
                    for (Person person : family.getPersonDirectory().getPersonList()) {
                        //System.out.println( person.getPersonId() + ". " + person.getName() + " " +family.getFamilyName() );
                        //for(Person p: person.getSiblings())
                        //{
                        // System.out.println(p.getPersonId() + ". " + p.getName() + " " + family.getFamilyName());
                        //}
                        if (pid == Integer.parseInt(person.getPersonId()) && person.getGender().equalsIgnoreCase("male")) {
                            System.out.println("ID: " + person.getPersonId());
                            System.out.println("Name: " + person.getName() + " " + family.getFamilyName());

                            //for(VitalSigns vs:person.getVitalSignHistory().getVitalSignsList())
                            //{
                            int s = person.getVitalSignHistory().getVitalSignsList().size();
                            //VitalSigns vs = person.getVitalSignHistory().getVitalSignsList().get(s - 1);
                            VitalSigns v = new VitalSigns();
                            for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                                v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                                v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                                v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                                v.setDate(vs.getDate());
                                v.setBpTreatment(vs.isBpTreatment());
                                v.setSmoker(vs.isSmoker());
                            }

                            double x = calculateRiskMale(v, person);
                            System.out.println("Age: " + (v.getDate().getYear() - person.getBirthDate().getYear()));
                            System.out.println("10-year Risk: " + x + "%");
                            //}

                        } else if (pid == Integer.parseInt(person.getPersonId()) && person.getGender().equalsIgnoreCase("female")) {
                            System.out.println("ID: " + person.getPersonId());
                            System.out.println("Name: " + person.getName() + " " + family.getFamilyName());

                            //for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                            VitalSigns v = new VitalSigns();
                            for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                                v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                                v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                                v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                                v.setDate(vs.getDate());
                                v.setBpTreatment(vs.isBpTreatment());
                                v.setSmoker(vs.isSmoker());
                            }

                            double x = calculateRiskFemale(v, person);
                            System.out.println("Age: " + (v.getDate().getYear() - person.getBirthDate().getYear()));
                            System.out.println("10-year Risk: " + x + "%");
                        }

                    }
                }
            }

        }
    }

// Method to calculate the risk for the particular community of the city
    private static void communityRisk(City city) {
        System.out.println("City: " + city.getCityName());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Community ID", "Community Name", "Total Population", "Male Count", "Average Male Risk", "Female Count", "Average Female Risk");
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
        for (Community community : city.getCommunityDirectory().getCommunityList()) {
            int maleCount = 0;
            int femaleCount = 0;
            double maleRisk = 0;
            double femaleRisk = 0;
            for (Person person : community.getPersonDirectory().getPersonList()) {
                int x = person.getVitalSignHistory().getVitalSignsList().size();
                //VitalSigns v = person.getVitalSignHistory().getVitalSignsList().get(x - 1);
                VitalSigns v = new VitalSigns();
                for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                    v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                    v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                    v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                    v.setDate(vs.getDate());
                    v.setBpTreatment(vs.isBpTreatment());
                    v.setSmoker(vs.isSmoker());
                }

                if (person.getGender().matches("Male")) {
                    maleCount++;
                    maleRisk = maleRisk + calculateRiskMale(v, person);

                } else if (person.getGender().matches("Female")) {

                    femaleCount++;
                    femaleRisk = femaleRisk + calculateRiskFemale(v, person);
                }
            }
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", community.getCommunityId(), community.getCommunityName(), community.getPersonDirectory().getPersonList().size(), maleCount, Math.round((maleRisk / maleCount) * 100.0) / 100.0 + "%", femaleCount, Math.round((femaleRisk / femaleCount) * 100.0) / 100.0 + "%");
            System.out.println("");
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

    }

    // Method to calculate the risk for the particular house of the community
    private static void houseRisk(City city) {
        System.out.println("City: " + city.getCityName());
        System.out.println("============================================");
        System.out.println("");
        for (Community community : city.getCommunityDirectory().getCommunityList()) {
            System.out.println("Community: " + community.getCommunityId() + ". " + community.getCommunityName());
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "House ID", "House Name", "Total Population", "Male Count", "Average Male Risk", "Female Count", "Average Female Risk");
            System.out.println("");
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            for (House house : community.getHouseDirectory().getHouseList()) {
                int maleCount = 0;
                int femaleCount = 0;
                double maleRisk = 0;
                double femaleRisk = 0;
                for (Person person : house.getPersonDirectory().getPersonList()) {
                    int x = person.getVitalSignHistory().getVitalSignsList().size();
                    //VitalSigns v = person.getVitalSignHistory().getVitalSignsList().get(x - 1);
                    VitalSigns v = new VitalSigns();
                    for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                        v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                        v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                        v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                        v.setDate(vs.getDate());
                        v.setBpTreatment(vs.isBpTreatment());
                        v.setSmoker(vs.isSmoker());
                    }
                    if (person.getGender().matches("Male")) {
                        maleCount++;
                        maleRisk = maleRisk + calculateRiskMale(v, person);

                    } else if (person.getGender().matches("Female")) {

                        femaleCount++;
                        femaleRisk = femaleRisk + calculateRiskFemale(v, person);
                    }
                }
                System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", house.getHouseNum(), house.getHouseName(), house.getPersonDirectory().getPersonList().size(), maleCount, Math.round((maleRisk / maleCount) * 100.0) / 100.0 + "%", femaleCount, Math.round((femaleRisk / femaleCount) * 100.0) / 100.0 + "%");
                System.out.println("");
            }
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("");
        }
    }

    //Method to calculate the risk for the family in the house
    private static void FamilyRisk(City city, int familyID) {
        if (familyID <= Family.getFamilyCount()) {
            System.out.println("City: " + city.getCityName());
            System.out.println("============================================");
            System.out.println("");
            for (Community community : city.getCommunityDirectory().getCommunityList()) {
                for (House house : community.getHouseDirectory().getHouseList()) {
                    for (Family family : house.getFamilyDirectory().getFamilyList()) {
                        if (family.getFamilyId().equals(String.valueOf(familyID))) {
                            System.out.println("Community: " + community.getCommunityId() + ". " + community.getCommunityName());
                            System.out.println("House: " + house.getHouseNum() + ". " + house.getHouseName());
                            System.out.println("Family: " + family.getFamilyId() + " - " + family.getFamilyName());
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
                            System.out.format("%-20s%-20s%-20s%-20s%-20s", "Person ID", "Person Name", "Age", "Gender", "10 year Risk");
                            System.out.println("");
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");
                            for (Person person : family.getPersonDirectory().getPersonList()) {
                                int x = person.getVitalSignHistory().getVitalSignsList().size();
                                double z = 0;
                                //VitalSigns v = person.getVitalSignHistory().getVitalSignsList().get(x - 1);
                                VitalSigns v = new VitalSigns();
                                for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                                    v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                                    v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                                    v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                                    v.setDate(vs.getDate());
                                    v.setBpTreatment(vs.isBpTreatment());
                                    v.setSmoker(vs.isSmoker());
                                }
                                if (person.getGender().equalsIgnoreCase("male")) {
                                    z = calculateRiskMale(v, person);
                                    System.out.format("%-20s%-20s%-20s%-20s%-20s", person.getPersonId(), person.getName(), v.getDate().getYear() - person.getBirthDate().getYear(), person.getGender(), calculateRiskMale(v, person));
                                } else {
                                    z = calculateRiskFemale(v, person);
                                    System.out.format("%-20s%-20s%-20s%-20s%-20s", person.getPersonId(), person.getName(), v.getDate().getYear() - person.getBirthDate().getYear(), person.getGender(), calculateRiskFemale(v, person));
                                }
                                System.out.println("");
                            }
                            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------");

                        }
                    }
                }
            }
        } else {
            System.out.println("NO SUCH FAMILY ID FOUND!");
        }
    }

    // Calculate the risk fot the individaul in the family
    private static void individualsRisk(City city, int personID) {
        if (personID <= Person.getCount()) {
            System.out.println("");
            System.out.println("City : " + city.getCityName());
            for (Community community : city.getCommunityDirectory().getCommunityList()) {
                for (House house : community.getHouseDirectory().getHouseList()) {
                    for (Family family : house.getFamilyDirectory().getFamilyList()) {
                        for (Person person : family.getPersonDirectory().getPersonList()) {
                            if (personID == Integer.parseInt(person.getPersonId()) && person.getGender().equalsIgnoreCase("male")) {
                                System.out.println("ID: " + person.getPersonId());
                                System.out.println("Name: " + person.getName() + " " + family.getFamilyName());
                                System.out.println("Gender: " + person.getGender());
                                //for(VitalSigns vs:person.getVitalSignHistory().getVitalSignsList())
                                //{
                                int s = person.getVitalSignHistory().getVitalSignsList().size();
                                //VitalSigns vs = person.getVitalSignHistory().getVitalSignsList().get(s - 1);
                                VitalSigns v = new VitalSigns();
                                for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                                    v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                                    v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                                    v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                                    v.setDate(vs.getDate());
                                    v.setBpTreatment(vs.isBpTreatment());
                                    v.setSmoker(vs.isSmoker());
                                }
                                double x = calculateRiskMale(v, person);
                                System.out.println("Age: " + (v.getDate().getYear() - person.getBirthDate().getYear()));
                                System.out.println("10-year Risk: " + x + "%");
                                //}

                            } else if (personID == Integer.parseInt(person.getPersonId()) && person.getGender().equalsIgnoreCase("female")) {
                                System.out.println("ID: " + person.getPersonId());
                                System.out.println("Name: " + person.getName() + " " + family.getFamilyName());
                                System.out.println("Gender: " + person.getGender());
                                int s = person.getVitalSignHistory().getVitalSignsList().size();
                                //VitalSigns vs = person.getVitalSignHistory().getVitalSignsList().get(s - 1);
                                VitalSigns v = new VitalSigns();
                                for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                                    v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                                    v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                                    v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                                    v.setDate(vs.getDate());
                                    v.setBpTreatment(vs.isBpTreatment());
                                    v.setSmoker(vs.isSmoker());
                                }

                                double x = calculateRiskFemale(v, person);
                                System.out.println("Age: " + (v.getDate().getYear() - person.getBirthDate().getYear()));
                                System.out.println("10-year Risk: " + x + "%");

                            }
                        }
                    }

                }
            }
            System.out.println("");
            System.out.print("                                                ");
            System.out.println("*****Vital Sign Records*****");
            System.out.format("%-30s%-38s%-30s%-30s%-30s", "Cholestrol(120-400)", "High Density Lipoprotien - HDL(20-80)", "Systolic BP(100-200)", "Is BP treated", "Is a smoker?");
            System.out.println("");
            System.out.println("______________________________________________________________________________________________________________________________________________________________");
            for (Community community : city.getCommunityDirectory().getCommunityList()) {
                for (House house : community.getHouseDirectory().getHouseList()) {
                    for (Family family : house.getFamilyDirectory().getFamilyList()) {
                        for (Person person : family.getPersonDirectory().getPersonList()) {
                            if (personID == Integer.parseInt(person.getPersonId())) {
                                for (VitalSigns vitalSigns : person.getVitalSignHistory().getVitalSignsList()) {
                                    String bPOP = "";
                                    String smokerOP = "";
                                    if (vitalSigns.isBpTreatment()) {
                                        bPOP = "YES";
                                    } else {
                                        bPOP = "NO";
                                    }
                                    if (vitalSigns.isSmoker()) {
                                        smokerOP = "YES";
                                    } else {
                                        smokerOP = "NO";
                                    }
                                    System.out.format("%-30s%-38s%-30s%-30s%-30s", vitalSigns.getCholestrol(), vitalSigns.getHdl_c(), vitalSigns.getBloodPressure(), bPOP, smokerOP);
                                    System.out.println("");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            System.out.println("No Such Person Found !");
        }
    }

    // Risk score of the city
    private static void cityRiskScore(City city) throws ParseException {
        //City city = InitializationData.initializeCity();
        System.out.println("City : " + city.getCityName());
        int cityPopulation = city.getPersonDirectory().getPersonList().size();
        System.out.println("Population: " + cityPopulation);
        int maleCount = 0;
        int femaleCount = 0;
        double maleRisk = 0;
        double femaleRisk = 0;
        //int sib = 0;
        for (Person person : city.getPersonDirectory().getPersonList()) {
            //sib = sib + person.getSiblings().size();
            int x = person.getVitalSignHistory().getVitalSignsList().size();
            //VitalSigns v = person.getVitalSignHistory().getVitalSignsList().get(x - 1);
            VitalSigns v = new VitalSigns();
            for (VitalSigns vs : person.getVitalSignHistory().getVitalSignsList()) {
                v.setBloodPressure(vs.getBloodPressure() + v.getBloodPressure());
                v.setCholestrol(vs.getCholestrol() + v.getCholestrol());
                v.setHdl_c(vs.getHdl_c() + v.getHdl_c());
                v.setDate(vs.getDate());
                v.setBpTreatment(vs.isBpTreatment());
                v.setSmoker(vs.isSmoker());
            }
            if (person.getGender().matches("Male")) {
                maleCount++;
                maleRisk = maleRisk + calculateRiskMale(v, person);

            } else if (person.getGender().matches("Female")) {

                femaleCount++;
                femaleRisk = femaleRisk + calculateRiskFemale(v, person);
            }
        }

        System.out.println("No. of Males: " + maleCount + "          " + "Average Male Risk Score: " + Math.round((maleRisk / maleCount) * 100.0) / 100.0 + "%");
        System.out.println("No. of Females: " + femaleCount + "          " + "Average Female Risk Score: " + Math.round((femaleRisk / femaleCount) * 100.0) / 100.0 + "%");
        //System.out.println(sib);
    }

    public static void main(String args[]) throws ParseException {
        City city = new City();
        city = InitializationData.initializeCity();
        int continueOption = 1;
        while (continueOption == 1) {
            Scanner lineReader = new Scanner(System.in);
            System.out.println("*****Coronary Heart Disease Risk Evaluation*****");
            System.out.println("");
            System.out.println("");
            System.out.println("************************************************");
            System.out.println("Please choose the Level of Risk you want to see...");
            System.out.println("1. City");
            System.out.println("2. Community");
            System.out.println("3. House");
            System.out.println("4. Family");
            System.out.println("5. Individuals");
            System.out.println("6. Calculate your Risk Score");
            System.out.println("************************************************");
            int levelChoice = 0;

            try {
                levelChoice = lineReader.nextInt();
            } catch (Exception e) {
                System.out.println("Please select valid Option");
                continue;
            }
            try
            {
            // The switch calls all the methods in each case to display the result accordingly
            switch (levelChoice) {
                case 1:
                    cityRiskScore(city);
                    break;

                case 2:
                    communityRisk(city);
                    break;

                case 3:
                    houseRisk(city);
                    break;

                case 4:
                    
                    System.out.println("Please Enter Family ID");
                    int x = lineReader.nextInt();
                    FamilyRisk(city, x);
                    break;
                    
                case 5:
                    
                    System.out.println("Please Enter Person ID");
                    int y = lineReader.nextInt();
                    individualsRisk(city, y);
                    break;
                     
                case 6:
                    calculateRisk();
                    break;

                default:
                    System.out.println("Please select Valid option!!!");
                    break;

            }
            }
            catch(Exception e)
                    {
                     System.out.println("Enter integers only.");
                     continue;
                    }
            loops:
            {

                System.out.println();
                System.out.println("Do you want to continue? Press 1 for 'Yes' or 0 for 'No'");
                try {
                    continueOption = lineReader.nextInt();
                } catch (Exception e) {
                    //System.out.println("Please enter 0 or 1 only!");
                    //continue;
                }
            }
        }
    }
}
