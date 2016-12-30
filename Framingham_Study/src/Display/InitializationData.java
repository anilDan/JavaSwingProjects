/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Display;

import Business.City;
import Business.Community;
import Business.Encounter;
import Business.Family;
import Business.House;
import Business.Person;
import Business.VitalSigns;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Anil
 */
public class InitializationData {

    public static boolean getRandomBoolean() {
        return Math.random() < 0.5;
    }

    public static City initializeCity() throws ParseException {
        SimpleDateFormat simpleDateFormate = new SimpleDateFormat("MM-dd-yyyy");
        Date date;
        Random random = new Random();
        int randomNum;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetCapitals = "ABCDEFGHIJKLMNOPQRSTUVWXYD";
//        int N = random.nextInt((6 - 3) + 1) + 3;
        StringBuilder sb;

        //City 
        City city = new City();

        //Community of City
        int numCommunity = random.nextInt((15 - 10) + 1) + 10;
        for (int m = 0; m <= numCommunity; m++) {

            Community community = city.getCommunityDirectory().addCommunity();
            sb = new StringBuilder();
            sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
            for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
            }
            community.setCommunityName(sb.toString());
            int numHouse = random.nextInt((15 - 10) + 1) + 10;

            for (int k = 0; k <= numHouse; k++) {

                //House of Community
                House house = community.getHouseDirectory().addHouse();
                //house.setHouseNum(random.nextInt((500 - 100) + 1) + 100);
                sb = new StringBuilder();
                sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                    sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                }
                house.setHouseName(sb.toString());

                sb = new StringBuilder();
                sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                for (int i = 0; i < 10; i++) {
                    sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                }
                house.setHouseAddress(sb.toString());
                int numFamily = random.nextInt((4 - 1) + 1) + 1;
                for (int j = 0; j <= numFamily; j++) {

                    //Family of house
                    Family family = house.getFamilyDirectory().addFamily();
                    //family.setFamilyId("1");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    family.setFamilyName(sb.toString());

                    //Person Details of Family
                    Person grandFather = new Person();
                    //grandFather.setPersonId("1");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    grandFather.setName(sb.toString());
                    grandFather.setGender("Male");
                    int x = random.nextInt((1951 - 1916) + 1) + 1916;
                    int y = random.nextInt((31 - 1) + 1) + 1;
                    int z = random.nextInt((12 - 1) + 1) + 1;
                    date = simpleDateFormate.parse(z + "-" + y + "-" + x);                                     //range of age for grandfather from 1951-1980 ie 65 to 100 years
                    grandFather.setBirthDate(date);
                    family.getPersonDirectory().addPerson(grandFather);
                    city.getPersonDirectory().addPerson(grandFather);
                    community.getPersonDirectory().addPerson(grandFather);
                    house.getPersonDirectory().addPerson(grandFather);

                    Encounter encounter = new Encounter();
                    String values[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                    encounter.setName(values[new Random().nextInt(values.length)]);
                    if (!encounter.getName().equalsIgnoreCase("")) {
                        VitalSigns vs = new VitalSigns();
                        vs.setSmoker(getRandomBoolean());
                        vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vs.setBpTreatment(getRandomBoolean());
                        vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2015 - 2000) + 1) + 2000;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vs.setDate(date);
                        encounter.setVitalSigns(vs);
                    }
                    grandFather.setEncounterHistory(encounter);

                    for (int n = 1; n <= 5; n++) {
                        VitalSigns vitalSigns = grandFather.getVitalSignHistory().addVitalSigns();
                        vitalSigns.setSmoker(getRandomBoolean());
                        vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vitalSigns.setBpTreatment(getRandomBoolean());
                        vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2016 - 2015) + 1) + 2015;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vitalSigns.setDate(date);
                    }

                    Person grandMother = new Person();
                    //grandMother.setPersonId("2");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    grandMother.setName(sb.toString());
                    grandMother.setGender("Female");
                    x = random.nextInt((1951 - 1916) + 1) + 1916;
                    y = random.nextInt((31 - 1) + 1) + 1;
                    z = random.nextInt((12 - 1) + 1) + 1;
                    date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                    grandMother.setBirthDate(date);
                    family.getPersonDirectory().addPerson(grandMother);
                    city.getPersonDirectory().addPerson(grandMother);
                    house.getPersonDirectory().addPerson(grandMother);
                    community.getPersonDirectory().addPerson(grandMother);

                    //encounter = grandMother.getEncounterHistory();
                    String valuesd[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                    encounter.setName(valuesd[new Random().nextInt(valuesd.length)]);
                    if (!encounter.getName().equalsIgnoreCase("")) {
                        VitalSigns vs = new VitalSigns();
                        vs.setSmoker(getRandomBoolean());
                        vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vs.setBpTreatment(getRandomBoolean());
                        vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2015 - 2000) + 1) + 2000;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vs.setDate(date);
                        encounter.setVitalSigns(vs);
                    }
                    grandMother.setEncounterHistory(encounter);

                    for (int n = 1; n <= 5; n++) {
                        VitalSigns vitalSigns = grandMother.getVitalSignHistory().addVitalSigns();
                        vitalSigns.setSmoker(getRandomBoolean());
                        vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vitalSigns.setBpTreatment(getRandomBoolean());
                        vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2016 - 2015) + 1) + 2015;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vitalSigns.setDate(date);
                    }

                    Person father = new Person();
                    //father.setPersonId("3");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    father.setName(sb.toString());
                    father.setGender("Male");
                    x = random.nextInt((1986 - 1950) + 1) + 1950;            //years between 86 and 50 adults with ages 30 to 64
                    y = random.nextInt((31 - 1) + 1) + 1;
                    z = random.nextInt((12 - 1) + 1) + 1;
                    date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                    father.setBirthDate(date);
                    father.setFather(grandFather);
                    father.setMother(grandMother);
                    family.getPersonDirectory().addPerson(father);
                    city.getPersonDirectory().addPerson(father);
                    community.getPersonDirectory().addPerson(father);
                    house.getPersonDirectory().addPerson(father);

                    //encounter = father.getEncounterHistory().addEncounter();
                    //String valuesd[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                    encounter.setName(valuesd[new Random().nextInt(valuesd.length)]);
                    if (!encounter.getName().equalsIgnoreCase("")) {
                        VitalSigns vs = new VitalSigns();
                        vs.setSmoker(getRandomBoolean());
                        vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vs.setBpTreatment(getRandomBoolean());
                        vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2015 - 2000) + 1) + 2000;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vs.setDate(date);
                        encounter.setVitalSigns(vs);
                    }
                    father.setEncounterHistory(encounter);

                    for (int n = 1; n <= 5; n++) {
                        VitalSigns vitalSigns = father.getVitalSignHistory().addVitalSigns();
                        vitalSigns.setSmoker(getRandomBoolean());
                        vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vitalSigns.setBpTreatment(getRandomBoolean());
                        vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2016 - 2015) + 1) + 2015;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vitalSigns.setDate(date);
                    }

                    Person mother = new Person();
                    //mother.setPersonId("4");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    mother.setName(sb.toString());
                    mother.setGender("Female");
                    x = random.nextInt((1986 - 1950) + 1) + 1950;            //years between 86 and 50 adults with ages 30 to 64
                    y = random.nextInt((31 - 1) + 1) + 1;
                    z = random.nextInt((12 - 1) + 1) + 1;
                    date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                    mother.setBirthDate(date);
                    mother.setFather(grandFather);
                    mother.setMother(grandMother);
                    family.getPersonDirectory().addPerson(mother);
                    city.getPersonDirectory().addPerson(mother);
                    house.getPersonDirectory().addPerson(mother);
                    community.getPersonDirectory().addPerson(mother);

                    //encounter = mother.getEncounterHistory().addEncounter();
                    //String valuesd[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                    encounter.setName(valuesd[new Random().nextInt(valuesd.length)]);
                    if (!encounter.getName().equalsIgnoreCase("")) {
                        VitalSigns vs = new VitalSigns();
                        vs.setSmoker(getRandomBoolean());
                        vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vs.setBpTreatment(getRandomBoolean());
                        vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2015 - 2000) + 1) + 2000;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vs.setDate(date);
                        encounter.setVitalSigns(vs);
                    }
                    mother.setEncounterHistory(encounter);

                    for (int n = 1; n <= 5; n++) {
                        VitalSigns vitalSigns = mother.getVitalSignHistory().addVitalSigns();
                        vitalSigns.setSmoker(getRandomBoolean());
                        vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vitalSigns.setBpTreatment(getRandomBoolean());
                        vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2016 - 2015) + 1) + 2015;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vitalSigns.setDate(date);
                    }

                    Person son = new Person();
                    //son.setPersonId("5");
                    sb = new StringBuilder();
                    sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                    for (int i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                        sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                    }
                    son.setName(sb.toString());
                    String value[] = {"Male", "Female"};
                    son.setGender(value[new Random().nextInt(value.length)]);
                    x = random.nextInt((1999 - 1987) + 1) + 1987;            //years between 1987 and 1999 childrens between ages 16-29years
                    y = random.nextInt((31 - 1) + 1) + 1;
                    z = random.nextInt((12 - 1) + 1) + 1;
                    date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                    son.setBirthDate(date);
                    son.setFather(father);
                    son.setMother(mother);
                    family.getPersonDirectory().addPerson(son);
                    city.getPersonDirectory().addPerson(son);
                    community.getPersonDirectory().addPerson(son);
                    house.getPersonDirectory().addPerson(son);

                    //encounter = son.getEncounterHistory().addEncounter();
                    //String valuesd[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                    encounter.setName(valuesd[new Random().nextInt(valuesd.length)]);
                    if (!encounter.getName().equalsIgnoreCase("")) {
                        VitalSigns vs = new VitalSigns();
                        vs.setSmoker(getRandomBoolean());
                        vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vs.setBpTreatment(getRandomBoolean());
                        vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2015 - 2000) + 1) + 2000;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vs.setDate(date);
                        encounter.setVitalSigns(vs);
                    }
                    son.setEncounterHistory(encounter);

                    for (int n = 1; n <= 5; n++) {
                        VitalSigns vitalSigns = son.getVitalSignHistory().addVitalSigns();
                        vitalSigns.setSmoker(getRandomBoolean());
                        vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                        vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                        vitalSigns.setBpTreatment(getRandomBoolean());
                        vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                        x = random.nextInt((2016 - 2015) + 1) + 2015;
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        vitalSigns.setDate(date);
                    }

                    int numSiblings = random.nextInt((3 - 1) + 1) + 1;
                    for (int i = 1; i <= numSiblings; i++) {
                        Person sib = son.addSiblings();
                        //daughter.setPersonId("6");
                        sb = new StringBuilder();
                        sb.append(alphabetCapitals.charAt(random.nextInt(alphabetCapitals.length())));
                        for (i = 0; i < random.nextInt((6 - 3) + 1) + 3; i++) {
                            sb.append(alphabet.charAt(random.nextInt(alphabet.length())));
                        }
                        sib.setName(sb.toString());
                        String value1[] = {"Male", "Female"};
                        sib.setGender(value1[new Random().nextInt(value1.length)]);
                        x = random.nextInt((1999 - 1987) + 1) + 1987;            //years between 1987 and 1999 childrens between ages 16-29years
                        y = random.nextInt((31 - 1) + 1) + 1;
                        z = random.nextInt((12 - 1) + 1) + 1;
                        date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                        sib.setBirthDate(date);
                        sib.setFather(father);
                        sib.setMother(mother);
                        family.getPersonDirectory().addPerson(sib);
                        city.getPersonDirectory().addPerson(sib);
                        house.getPersonDirectory().addPerson(sib);
                        community.getPersonDirectory().addPerson(sib);

                        //encounter = sib.getEncounterHistory().addEncounter();
                        //String valuesd[] = {"Coronary artery disease", "", "Heart attack", "", "arrhythmias", "", "Congenital heart disease", "", "cardiomyopathy", "", "Heart valve disease", ""};
                        encounter.setName(valuesd[new Random().nextInt(valuesd.length)]);
                        if (!encounter.getName().equalsIgnoreCase("")) {
                            VitalSigns vs = new VitalSigns();
                            vs.setSmoker(getRandomBoolean());
                            vs.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                            vs.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                            vs.setBpTreatment(getRandomBoolean());
                            vs.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                            x = random.nextInt((2015 - 2000) + 1) + 2000;
                            y = random.nextInt((31 - 1) + 1) + 1;
                            z = random.nextInt((12 - 1) + 1) + 1;
                            date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                            vs.setDate(date);
                            encounter.setVitalSigns(vs);
                        }
                        sib.setEncounterHistory(encounter);

                        for (int n = 1; n <= 5; n++) {
                            VitalSigns vitalSigns = sib.getVitalSignHistory().addVitalSigns();
                            vitalSigns.setSmoker(getRandomBoolean());
                            vitalSigns.setBloodPressure(randomNum = random.nextInt((180 - 100) + 1) + 100);
                            vitalSigns.setCholestrol(randomNum = random.nextInt((300 - 100) + 1) + 100);
                            vitalSigns.setBpTreatment(getRandomBoolean());
                            vitalSigns.setHdl_c(randomNum = random.nextInt((80 - 20) + 1) + 20);
                            x = random.nextInt((2016 - 2015) + 1) + 2015;
                            y = random.nextInt((31 - 1) + 1) + 1;
                            z = random.nextInt((12 - 1) + 1) + 1;
                            date = simpleDateFormate.parse(z + "-" + y + "-" + x);
                            vitalSigns.setDate(date);
                        }
                    }
                }
            }
        }
        return city;
    }
//   
}
