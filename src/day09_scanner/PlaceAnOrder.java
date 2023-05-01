package day09_scanner;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter product name: ");
        String name = in.nextLine();
        System.out.println("Enter Price: ");
        double price = in.nextDouble();
        System.out.println("Enter quantity: ");
        int quantity = in.nextInt();
        in.nextLine();
        System.out.println("Enter First Name: ");
        String firstName = in.next();

        in.close();

        System.out.println(firstName+" your order for "+quantity+" "+ name +" has been placed. " +
                "Your total is "+(price*quantity));

    }
}
/*
7. Create a class named PlaceAnOrder:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */