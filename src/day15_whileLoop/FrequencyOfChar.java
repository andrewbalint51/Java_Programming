package day15_whileLoop;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int frequency =0;
        System.out.println("Enter a String: ");
        String str = in.nextLine();
        System.out.println("Enter a char: ");
        char c = in.next().charAt(0);

        for(int i = 0; i<str.length();i++){
            if(c==str.charAt(i)){
                frequency++;
            }
        }

        System.out.println(frequency);

    }
}
/*
3. Create a class named FrequencyOfChar and Write a program that asks user to enter a string and a char, the
   returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4

 */