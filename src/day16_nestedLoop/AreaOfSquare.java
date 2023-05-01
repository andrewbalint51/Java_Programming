package day16_nestedLoop;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String repeat="";

        do{

            //Ask for side
            System.out.println("Enter the side of the square:");
            int side=in.nextInt();

            if(side<=0){//terminate if invalid
                System.out.println("Invalid Entry for the side of the square");
                System.exit(1);
            }

            //Print results
            System.out.println("Area: "+(side*side));
            System.out.println("Perimeter: "+(side*4));

            //Ask if they want to continue

            System.out.println("Would you like to calculate another square?");
            repeat = in.next();
            while(!repeat.equalsIgnoreCase("yes")&&
                    !repeat.equalsIgnoreCase("no")){
                System.out.println("Invalid entry, please re-enter:");
                repeat = in.next();
            }


        }while(repeat.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Cydeo Square Calculator APP");
    }
}
/*
4. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a
                                valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */