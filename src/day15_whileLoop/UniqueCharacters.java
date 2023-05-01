package day15_whileLoop;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AACCBCCDDDDDfGh";

        for(int i = 0; i<str.length();i++){//go through each char in the string
            char c = str.charAt(i); //the char we are on
            int frequency=0; //the frequency it occurs

            //Check how often that char occurs
            for(int j = 0; j<str.length();j++){
                if(c==str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency==1) {//If it only occurs once, print it
                System.out.print(c);
            }
        }

    }
}
/*
9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD
 */