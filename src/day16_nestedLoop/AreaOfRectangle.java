package day16_nestedLoop;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String repeat="";

        do{

            //Ask for side
            System.out.println("Enter the length of the rectangle:");
            int length=in.nextInt();

            if(length<=0){//terminate if invalid
                System.out.println("Invalid Entry for the length of the rectangle");
                System.exit(1);
            }

            System.out.println("Enter the width of the rectangle:");
            int width=in.nextInt();

            if(width<=0){//terminate if invalid
                System.out.println("Invalid Entry for the width of the rectangle");
                System.exit(1);
            }

            //Print results
            System.out.println("Area: "+(length*width));
            System.out.println("Perimeter: "+(length*2+width*2));

            //Ask if they want to continue

            System.out.println("Would you like to calculate another rectangle?");
            repeat = in.next();
            while(!repeat.equalsIgnoreCase("yes")&&
                    !repeat.equalsIgnoreCase("no")){
                System.out.println("Invalid entry, please re-enter:");
                repeat = in.next();
            }


        }while(repeat.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Cydeo Rectangle Calculator APP");
    }
}
/*
5. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a
                                valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program
 */