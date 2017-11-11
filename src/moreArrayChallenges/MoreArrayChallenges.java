package src.moreArrayChallenges;

//- write this method "public int[] resverseArray(int[] t)" - this method needs to reverse an array in place
// - you should only need to use one extra variable.
//- write this method "public void populateAndPrint2DArray()"
// - it should populate a 2D array in one nested loop -
// then in a second nested loop it should print out each number in the 2D array.
//- write this method "public int[][] reverse2DArray(int[][] t)" -
// this method needs to reverse a 2D array in place, using only one extra variable.


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Arrays;

public class MoreArrayChallenges {


    //for reverse array method
    static int[] t = new int []{1,2,3,4,5,6,7};

    //for  populate and print 2dArray and Reverse 2dArray
    //assigned values to help visualize the reversal process better
    static int[][] tt =  new int [][] { {1,2,3,4,5,6,7,8,9}, {21,22,23,24,25,26,27,28,29}};






    public static void main(String[] args) {


        MoreArrayChallenges obj = new MoreArrayChallenges();

        System.out.println("The values of the array before reversing is");

        //method to print out an array in brackets
        System.out.println(Arrays.toString(t));

        System.out.println("The values of the array after reversing is");
        //reverse the original array
        obj.resverseArray(t);
        //print out the array after reversing
        System.out.println(Arrays.toString(t));

        System.out.println("************************");

        System.out.println("The values of the 2D array are");

        //populate the TwoD array, redundante since I already assigned values to them
        obj.populateAndPrint2DArray(tt);

        //cool method to print a twoD arrays in brackets
        System.out.println(Arrays.deepToString(tt));

        System.out.println("The values of the 2D array after reversing");

        //reverse the twoD array
        obj.reverse2DArray(tt);

        System.out.println(Arrays.deepToString(tt));

        }





    public  int[] resverseArray(int[] t) {

        //only switch elements untill you reach the middle of the array
        for(int i = 0; i < t.length/2; i++) {

            //set a temp variable equal to t at the index of i
            int temp = t[i];
            //set t at the index of i = to t at the index of the length of t -i -1
            //this is what actually swicthes the variables untill they reach the middle of the array
            t[i] = t[t.length -i -1];

            //reset that equal to the temporary variable
            t[t.length -i -1] = temp;

        }

        return t;

    }


    //basic population of a twod array
    public void populateAndPrint2DArray(int [][] tt) {

        int counter =0;

        for(int i = 0; i < tt.length -1; i++) {

            for(int j = 0; j <= i; j++) {

                tt[i][j] += counter;
            }

        }
    }





    public int[][] reverse2DArray(int[][] tt) {

        // temporary variable temp
        int temp;

        //as you u go across the  2darray on the horizontal axis to the halfway point
        for(int i = 0; i < tt.length / 2; i++) {

            //travle across the vertical axis of the 2darray
            for (int j = 0; j < tt[i].length; j++) {

                //set temp variable equal to the first element in the 2darray
                temp = tt[i][j];

                // switch all the elements in both the horizontal and vertical axis
                tt[i][j] = tt[tt.length - i -1][tt[i].length - 1 - j];

                //reset that equal to the temp variable
                tt[tt.length - i -1][tt[i].length - 1 - j] = temp;

            }
        }

        return tt;

    }

}
