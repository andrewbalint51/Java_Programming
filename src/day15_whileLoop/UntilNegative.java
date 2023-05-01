package day15_whileLoop;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int nextNum =0;

        while(nextNum>=0){

            sum+=nextNum;
            System.out.println("Enter a number");
            nextNum=in.nextInt();

        }

        System.out.println(sum);
    }
}
/*
5. Create a class named UntilNegative and Write a program that calculates the sum of numbers
   entered by the user until user enters a negative number.
 */