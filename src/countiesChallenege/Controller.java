package src.countiesChallenege;


/*create an application that can read this file, map every row of csv into a java object and add it to an arraylist
         the method that reads the file should just read the file and map it to objects and return the arraylist
        once you have that arraylist - derive some meaning from it using several different methods

        1) which counties have the highest average weekly wage?
        2) which have the lowest weekly wage?

        */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {

        //array list object
        ArrayList<DemoInfo> list = new ArrayList<DemoInfo>();

        //create a new object called file that is the path to your csv data
        File myFile = new File("/Users/kevinneag/Downloads/demographic___All Ages_.csv");

        //created a string for each line of the file
        String line;
        //a string array elements that holds each instance variables, even the two extra we created
        String[] elements;
        //a string array  that holds the number of instance variables needed, which is 12
        String[] elementsFinal = new String[12];

        //create a buffered reader object that wraps a filereader object and takes it the file object created earlier
        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            //skip the first line of the element
            br.readLine();
            //when the br line object is not equal to zero
            while ((line = br.readLine()) != null) {


                //seperate each row into coloumns by the comma
                elements = line.split(",");

                /*because some coloumns contain commas and others do not, created an if else statement to
                that checks the number of rows and refits them into the elementsFinal array
                 */

                if (elements.length == 12) {
                    for (int i = 0; i <= elements.length - 1; i++) {
                        elementsFinal[i] = elements[i];
                    }
                }
                if (elements.length == 14) {
                    String a = elements[4].concat(",").concat(elements[5]);
                    String b = elements[6].concat(",").concat(elements[7]);

                    for (int i = 0; i <= elementsFinal.length - 1; i++) {
                        if (i < 4) {
                            elementsFinal[i] = elements[i];
                        } else if (i == 4) {
                            elementsFinal[i] = a;
                        } else if (i == 5) {
                            elementsFinal[i] = b;
                        } else {
                            elementsFinal[i] = elements[i + 2];
                        }
                    }
                }
                if (elements.length == 13) {
                    String a = elements[4].concat(",").concat(elements[5]);

                    for (int i = 0; i <= elementsFinal.length - 1; i++) {
                        if (i < 4) {
                            elementsFinal[i] = elements[i];
                        } else if (i == 4) {
                            elementsFinal[i] = a;
                        } else {
                            elementsFinal[i] = elements[i + 1];
                        }
                    }
                }


                //create an object of the DemoInfo class
                DemoInfo di = new DemoInfo();

                    /* set each intsance variable of the di object as an element in the final array
                    taking out the uneeded quotes that were in the csv file
                     */
                di.setArea_fips(Integer.parseInt(elementsFinal[0].replace("\"", "")));
                di.setIndustry_code(Integer.parseInt(elementsFinal[1].replace("\"", "")));
                di.setYear(Integer.parseInt(elementsFinal[2].replace("\"", "")));
                di.setQrt(Integer.parseInt(elementsFinal[3].replace("\"", "")));
                //this line is also split by a comma, which I created another row for
                di.setArea_title(elementsFinal[4].replace("\"", ""));
                di.setNdustry_title(elementsFinal[5].replace("\"", ""));
                di.setQtrly_estabs_count(Integer.parseInt(elementsFinal[6].replace("\"", "")));
                di.setMonth1_emplvl(Integer.parseInt(elementsFinal[7].replace("\"", "")));
                di.setMonth2_emplvl(Integer.parseInt(elementsFinal[8].replace("\"", "")));
                di.setMonth3_emplvl(Long.parseLong(elementsFinal[9].replace("\"", "")));
                di.setTotal_qtrly_wages(Long.parseLong(elementsFinal[10].replace("\"", "")));
                di.setAvg_wkly_wage(Integer.parseInt(elementsFinal[11].replace("\"", "")));

                //add each di object to the array list
                list.add(di);


            }


//            //print out each element of each object in the array list
//            for (int i = 0; i < list.size(); i ++) {
//                DemoInfo reader = list.get(i);
//                reader.giveInfo();
//            }

            //catch the io excpetion
        } catch (IOException x) {
            System.out.println("Exception Handled");

        }

        //create an object of the controller class to be able to call other methods from main
        Controller hello = new Controller();
        //

         int max =hello.findMaxAvgWage(list);
        String county = hello.findCountywithMAxWeeklyValue(list, max);
        System.out.println("The county with the highest weekly wage is :" + " " + county);

        String y = hello.findMinAvgWageObject(list).getArea_title();
        System.out.println("The county with the lowest weekly wage is :" + " " + y);





        System.out.println();
        //String county = hello.findCountywithMAxWeeklyValue(list);


    }


    //new method that returns an object to find the lowest
    public DemoInfo findMinAvgWageObject(ArrayList<DemoInfo> a) {
        DemoInfo retObj = new DemoInfo();
        for (int i = 0; i < a.size(); i++) {
            DemoInfo b = a.get(i);
            if (b.getAvg_wkly_wage() <= retObj.getAvg_wkly_wage()) {
                retObj = b;
            }
        }
        return retObj;
    }


    //new method to find the  max value for avegere weekly wage
    public int findMaxAvgWage(ArrayList<DemoInfo> a) {

        int max = 0;
        //iterate through the array list to find the highest avgerage weekly wage
        for (int i = 0; i < a.size(); i++) {
            DemoInfo b = a.get(i);

            max = b.getAvg_wkly_wage() > max ? b.getAvg_wkly_wage() : max;


        }
        return max;


    }


    //method to find the county associated with the greatest min wage
    public String findCountywithMAxWeeklyValue(ArrayList<DemoInfo> a, int max) {

        for (int i = 0; i < a.size(); i++) {
            DemoInfo c = a.get(i);

            if (c.getAvg_wkly_wage() == max) {
                return c.getArea_title();
            }

        }
        return "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz";
    }
}
