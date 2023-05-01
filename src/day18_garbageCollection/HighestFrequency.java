package day18_garbageCollection;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "aaabbccccddeeee";

        String freqOfChars ="";


        //char ch;
        int maxFreq = 0;

        for (int i = 0; i<str.length(); i++){

            int freq=0;
            char ch = str.charAt(i);



            for (int j =0; j<str.length();j++){
                if(ch==str.charAt(j)){
                    freq+=1;
                }
            }

            if(freq>=maxFreq) {
                maxFreq = freq;
                //System.out.println(ch);
            }


        }

        String maxChar = "";

        for (int i = 0; i<str.length(); i++){

            int freq=0;
            char ch = str.charAt(i);



            for (int j =0; j<str.length();j++){
                if(ch==str.charAt(j)){
                    freq+=1;
                }
            }

            //String maxChar = "";
            if(freq>=maxFreq&&!maxChar.contains(""+ch)) {
                //maxFreq = freq;
                maxChar+=ch+"\n";
            }


        }

        System.out.println(maxChar);

    }
}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"

		output:
			c
			e
 */