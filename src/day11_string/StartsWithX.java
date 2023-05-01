package day11_string;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word= scan.next();

        if(word.startsWith("x")){
            word=word.replaceFirst("x", "a");

        }


        System.out.println(word);

        scan.close();

    }

}
/*
1. Create a class named StartsWithX and write a program that asks user to enter a word.
If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */