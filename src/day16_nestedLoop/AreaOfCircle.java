package day16_nestedLoop;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String repeat="";

        do{

            //Ask for radius
            System.out.println("Enter the radius of the circle:");
            int radius=in.nextInt();

            if(radius<=0){//terminate if invalid
                System.out.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            //Print results
            System.out.println("Diameter: "+(radius*2));
            System.out.println("Area: "+(radius*radius*3.14));
            System.out.println("Perimeter: "+(radius*2*3.14));

            //Ask if they want to continue

                System.out.println("Would you like to calculate another circle?");
                repeat = in.next();
            while(!repeat.equalsIgnoreCase("yes")&&
                  !repeat.equalsIgnoreCase("no")){
                System.out.println("Invalid entry, please re-enter:");
                repeat = in.next();
            }


        }while(repeat.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Cydeo Circle Calculator APP");


    }
}
/*
3. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If user enters an invalid entry, ask the user to re-enter until user provides a
                                valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

 */