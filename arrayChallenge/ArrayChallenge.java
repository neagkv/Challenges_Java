package arrayChallenge;

import java.util.Scanner;

public class ArrayChallenge {

    /* Create a fully functional Java class (that can be run from the CLI or IntelliJ (IDE) that reverses an int[]
    in place. If the user passes a set of ints from the command line, reverse the ints the user passes in. If the user
    does not pass any arguments from the CLI use a default array - populate this array with 10 ints in any order. Your
    method should not create any additional arrays. Your method should only use one extra variable to accomplish this
    task. (Hint: what do you have to do to swap two items in an array?) (Hint #2: use the index variables already
    available to you while iterating over the array.) When you are done, check this project into a new repository on
    your Github.
     */


    public static void main(String[] args) {

        // if the user enters any command line arguments use them.
        if (args.length > 0) {
            // temporary string variable temp
            String temp;

            // a bubble sort to populate the array with the arguments in reverse order in which they were entered.
            for (int j = 0; j < args.length / 2; j++) {
                temp = args[j];
                args[j] = args[args.length - 1 - j];
                args[args.length - 1 - j] = temp;


            }
            //reiterate through the array and print out each element
            for (int j = 0; j < args.length; j++) {
                System.out.println(args[j]);
            }


        } else {
            //If no arguments were entered create a new 10 element array
            int[] myArray = new int[10];
            //temporary int variable temp
            int temp;
            //iterate and populate the array
            for (int i = 0; i < myArray.length; i++) {
                myArray[i] = i + 1;
                System.out.print(myArray[i]);
            }

            System.out.println();

                //iterate up to 1/2 of the array
            for (int j = 0; j < myArray.length / 2; j++) {
                //set the temporary variable equal to the index of j in the array
                temp = myArray[j];
                //the index of j is equal to the index of the length of the array -1 -j
                myArray[j] = myArray[myArray.length - 1 - j];
                //swap the value of the index of the length of the array -1 -j with the temporary variable
                myArray[myArray.length - 1 - j] = temp;

            }
                //reiterate through the array and print out each element
            for (int i = 0; i < myArray.length; i++) {
                System.out.print(myArray[i]);
            }
        }

    }
}


