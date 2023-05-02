package day11_string;

import java.util.Scanner;

public class WithoutFirstChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1.substring(1,word1.length())+word2.substring(1,word2.length()));

    }
}
/*
4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana
 */