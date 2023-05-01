package day09_scanner;

import java.util.Scanner;

public class AskUser {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        while (num >=0) {


            if (num < 3) {
                System.out.println("Live with less than 3 people");
            } else if (num <= 6 && num >= 3) {
                System.out.println("Live with 3-6 people");
            } else {
                System.out.println("Live with more than 6 people");
            }
            input.nextLine();
            num = input.nextInt();
        }
        input.close();
    }
}
/*
1. Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */