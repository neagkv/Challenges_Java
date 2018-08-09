package src.stringSorter;

/**
 * @author Kevin Neag
 */


/**
 * Create a method that organizes that organizes a series of given string arrays both alphabetically and numerically.
 */
public class StringSort {



   public static void main(String[] args) {

        StringDivide stringDivide = new StringDivide();

        String one = "ABC123AB";
        String two = "ABC234XY";
        String three = "CDF123AB";
        String four = "CDF345 AB";
        String five = "AXF12SD";
        String six = "XDF345AB";
        String seven = "XZZ123 BZ";
        String eight = "ABC111AB";

        String [] strings = new String[]{one,two,three,four,five,six,seven,eight};

        for( String string : strings) {

            String [] firstArray = new String[8];
//            String [] secondArray = new String[8];
//            String [] thirdArray = new String[8];

            stringDivide.setFirst(string.substring(0,3));



//            stringDivide.setSecond(string.substring(3,6));
//            stringDivide.setThird(string.substring(6));



            System.out.println(stringDivide.first.toString());
//            System.out.println(stringDivide.second.toString());
//            System.out.println(stringDivide.third.toString());

        }



    }

}
