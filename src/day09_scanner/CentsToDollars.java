package day09_scanner;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int cents;
        int dollars;

        System.out.print("Enter cents: ");
        cents = in.nextInt();

        in.close();

        dollars = cents/100;
        // cents = cents-(dollars*100);

        System.out.println(cents + " cents equals "+dollars+" dollars and "+(cents-(dollars*100))+" cents");

    }

}
/*
5. Create a class named CentsToDollars, write a program that can convert cents to dollars
	if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
 */