package test.stringSorter;

import org.junit.Test;

/**
 * @author Kevin Neag
 */
public class StringSorterTest {

    //given
//    String one = "ABC123AB";
//    String two = "ABC234XY";
   // String three = "CDF123AB";
   // String four = "CDF345 AB";
//    String five = "AXF12SD";
//    String six = "XDF345AB";
//    String seven = "XZZ123 BZ";
//    String eight = "ABC111AB";

    String [] strings = new String[]{one,two,three,four,five,six,seven,eight};

    @Test
    public String[] sort(String [] input) {

        return input;


    }

    //expected
    String eight = "ABC111AB";
    String one = "ABC123AB";
    String two = "ABC234XY";
    String five = "AXF12SD";
    String three = "CDF123AB";
    String four = "CDF345 AB";
    String six = "XDF345AB";
    String seven = "XZZ123 BZ";



}
