package src.countiesChallenege;


/*create an application that can read this file, map every row of csv into a java object and add it to an arraylist
         the method that reads the file should just read the file and map it to objects and return the arraylist
        once you have that arraylist - derive some meaning from it using several different methods

        1) which counties have the highest average weekly wage?
        2) which have the lowest weekly wage?
        3) which counties have the highest and lowest total quarterly wages
        */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Controller {


    public static void main(String[] args) {

        ArrayList<DemoInfo> list = new ArrayList<DemoInfo>();

        File myFile = new File("/Users/kevinneag/Downloads/demographic___All Ages_.csv");

        String line;
        String[] elements;

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                elements = line.split(",");

                DemoInfo di = new DemoInfo();
                System.out.println(elements[0]);
                System.out.println(elements[1]);

                di.setArea_fips(Integer.parseInt(elements[0]));
                di.setIndustry_code(Integer.parseInt(elements[1]));
                di.setYear(Integer.parseInt(elements[2]));
                di.setQrt(Integer.parseInt(elements[3]));
                di.setArea_title(elements[4]);
                di.setNdustry_title(elements[5]);
                di.setQtrly_estabs_count(Integer.parseInt(elements[6]));
                di.setMonth1_emplvl(Integer.parseInt(elements[7]));
                di.setMonth2_emplvl(Integer.parseInt(elements[8]));
                di.setMonth3_emplvl(Integer.parseInt(elements[9]));
                di.setTotal_qtrly_wages(Long.parseLong(elements[10]));
                di.setAvg_wkly_wage(Integer.parseInt(elements[11]));

                list.add(di);
            }


            for (DemoInfo x : list) {
                System.out.println(x.toString());

            }


        } catch (IOException x) {
            System.out.println("Exception Handled");
            ;
        }


    }
}
