package src.moreArrayChallenges;

//- write this method "public int[] resverseArray(int[] t)" - this method needs to reverse an array in place
// - you should only need to use one extra variable.
//- write this method "public void populateAndPrint2DArray()"
// - it should populate a 2D array in one nested loop -
// then in a second nested loop it should print out each number in the 2D array.
//- write this method "public int[][] reverse2DArray(int[][] t)" -
// this method needs to reverse a 2D array in place, using only one extra variable.



public class MoreArrayChallenges {


    //for reverse array method
    static int[] t = new int [6];

    //for  populate and print 2dArray and Reverse 2dArray
    static int[][] tt =  new int [6][6];






    public static void main(String[] args) {


        MoreArrayChallenges obj = new MoreArrayChallenges();



        System.out.println("************************");

        System.out.println("The values of the TwoD array are");

        obj.populateAndPrint2DArray(tt);

        System.out.println("************************");

        System.out.println("After reversing the values are");

        obj.reverse2DArray(tt);

        obj.populateAndPrint2DArray(tt);



        }



    public  int[] resverseArray(int[] t) {


        for(int i = 0; i < t.length/2; i++) {

            int temp = t[i];

            t[i] = t[t.length -i -1];

            t[t.length -i -1] = temp;

        }

        return t;

    }


    public void populateAndPrint2DArray(int [][] tt) {

        int counter =0;

        for(int i = 0; i < tt.length -1; i++) {

            for(int j = 0; j <= i; j++){

                tt[i][j] = counter ++;

            }

            for(int[] x : tt) {

                for(int y : x) {

                    System.out.println(y);
                }

            }
        }
    }


    public int[][] reverse2DArray(int[][] tt) {


        int temp;

        for (int i = 0; i < tt.length; i++) {

            for (int j = 0; tt[i].length <= i / 2; j++) {

                temp = tt[i][j];

                tt[i][j] = tt[tt.length - i -1][tt[i].length - 1 - j];

                tt[tt.length - i -1][tt[i].length - 1 - j] = temp;

            }
        }

        return tt;

    }

}
