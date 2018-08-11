package src.stringSorter;

/**
 * @author Kevin Neag
 */

import java.util.ArrayList;

/**
 * Create a method that organizes that organizes a series of given string arrays both alphabetically and numerically.
 * Expected output:
 *
 * String eight = "ABC111AB";
 * String one = "ABC123AB";
 * String two = "ABC234XY";
 * String five = "AXF12SD";
 * String three = "CDF123AB";
 * String four = "CDF345 AB";
 * String six = "XDF345AB";
 * String seven = "XZZ123 BZ";
 *
 */

public class StringSort {

    public static void main(String[] args) {


        String one = "ABC123AB";
        String two = "ABC234XY";
        String three = "CDF123AB";
        String four = "CDF345 AB";
        String five = "AXF12SD";
        String six = "XDF345AB";
        String seven = "XZZ123 BZ";
        String eight = "ABC111AB";

        ArrayList<String> fullStrings = new ArrayList<String>();
        fullStrings.add(one);
        fullStrings.add(two);
        fullStrings.add(three);
        fullStrings.add(four);
        fullStrings.add(five);
        fullStrings.add(six);
        fullStrings.add(seven);
        fullStrings.add(eight);

        //sorts the strings alphabetically
        fullStrings.sort(String::compareToIgnoreCase);










    }

}
