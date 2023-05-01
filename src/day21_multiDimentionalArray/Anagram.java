package day21_multiDimentionalArray;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "listen";
        String str2 = "sildent";

        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        boolean isAnagram=false;




        if(Arrays.equals(word1, word2)){
            isAnagram=true;
        }
        else{
            isAnagram=false;
        }

        System.out.println(isAnagram);

    }
}
