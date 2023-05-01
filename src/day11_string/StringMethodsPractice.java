package day11_string;

import java.util.Scanner;

public class StringMethodsPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        //WRITE YOUR CODE BELOW

        boolean hasWord = word.equals("earrings");

        System.out.println("Did you just get some "+word+" for Christmas?");
        System.out.println(hasWord);

    }
}
