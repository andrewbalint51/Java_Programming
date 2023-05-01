package Utilities;

public class StringUtility {

    public static String reverse(String str){

        String reversed = "";

        for (int i = str.length()-1; i>=0; i--){
            reversed = reversed+str.charAt(i);
        }
        return reversed;
    }



}
