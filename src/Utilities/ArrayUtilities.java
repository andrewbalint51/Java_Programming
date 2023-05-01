package Utilities;

public class ArrayUtilities {

    public static int[] reverse(int[] array){
     int[] reverse = new int[array.length];

        for (int i = 0, j= array.length-1; i < reverse.length; i++) {

            reverse[j--]=array[i];
        }

     return reverse;
    }
}
