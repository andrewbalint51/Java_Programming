package day11_string;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        word = word.replace("x","a");
        word = word.replace("X", "a");

        System.out.println(word);

    }

}
/*
2. Create a class named ReplaceX, and write a program that asks user to enter a word. and
replace all the x or X with character a

                    Input:
                        xcodeX
                    Output:
                        acodea
 */