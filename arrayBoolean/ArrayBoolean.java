package arrayBoolean;

public class ArrayBoolean {

   /* Challenge #1)
    given this method signature:
    public boolean compareArrays(int[] a, int[] b){...}

    complete the method so that it will return true if both a[] and b[]
    share the same first element and last element in common

    */

   int [] a;
   int[] b;

   public boolean compareArrays(int[] a, int[] b) {

        if(a[0] == b[0] && a[a.length-1] == b[b.length -1]){
           return true;
        }
        else{
            return false;
        }

        }
}
