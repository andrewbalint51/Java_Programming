package day21_multiDimentionalArray;

import java.util.Arrays;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "     Hello world      I     Love     Java   ";

        //str = str.trim();

        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        str = "";

        for(String each : words){
            if(!each.isEmpty()){
                str+=each+" ";
            }
        }

        str=str.trim();
        System.out.println(str);
    }
}
