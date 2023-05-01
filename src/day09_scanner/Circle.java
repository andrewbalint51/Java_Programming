package day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double radius;

        System.out.println("Enter the radius");
        radius = input.nextDouble();

        input.close();
        System.out.println("The Area is: "+ (radius*radius*3.14));
        System.out.println("The Perimeter is "+ (radius*2*3.14));

    }
}
/*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */