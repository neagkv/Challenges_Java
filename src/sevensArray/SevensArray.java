package src.sevensArray;

    /* Challenge #2)
if you want another one:

Given an array of ints, return true if the array contains two 7's next to each
other, or there are two 7's separated by one element, such as with {7, 1, 7}.

has77([1, 7, 7]) → true
has77([1, 7, 1, 7]) → true
has77([1, 7, 1, 1, 7]) → false
*/


public class SevensArray {

    int[] sevens;

    public static void main(String[] args) {

        int [] sevens = {1,2,3,6,7,8,7};

        boolean x = findSevens(sevens);
        System.out.println(x);
    }


    public static boolean findSevens(int[] sevens) {

        for (int i = 0; i < sevens.length; i++) {

            if (sevens[i] == 7 && sevens[i + 1] == 7) {
                return true;
            }
            else if (sevens[i] == 7 && sevens[i + 2] == 7) {
                return true;
            }

        }
        return false;
    }
}





