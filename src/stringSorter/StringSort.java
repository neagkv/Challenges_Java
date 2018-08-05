package src.stringSorter;

/**
 * @author Kevin Neag
 */

/**
 * Create a method that organizes that organizes a series of given string arrays both alphabetically and numerically.
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

        String [] strings = new String[]{one,two,three,four,five,six,seven,eight};

        for( String string : strings) System.out.println(string.toString());



    }

}
