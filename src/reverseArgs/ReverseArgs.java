package src.reverseArgs;

public class ReverseArgs {


    /* Challenge #1)
given this method signature:
public boolean compareArrays(int[] a, int[] b){...}
complete the method so that it will return true if both a[] and b[]
 share the same first element and last element in common
*/




    public static void main(String[] args) {

        System.out.println("Command-line arguments");

        for(int i =0; i < args.length/2; i++){

            String s = args[i];
            args[i] = args[args.length - i - 1];
            args[args.length - i - 1] = s;

        }

        for(int i =0; i < args.length; i++) {

            System.out.println(args[i]);
        }

    }
}
