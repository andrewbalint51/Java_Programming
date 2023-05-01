package day09_scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class MyInfo {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

        System.out.println("Enter your gender: ");
        String gender =  in.next();

        in.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = in.nextLine();

        System.out.println("Enter your phone number: ");
        long phoneNumber = in.nextLong();

        System.out.println("Enter your zip code: ");
        int zipCode = in.nextInt();

        in.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = in.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = in.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = in.next();

        System.out.println("Enter your building number: ");
        int buildingNum = in.nextInt();

        in.nextLine();

        System.out.println("Enter your Street Name: ");
        String streetName = in.nextLine();

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(phoneNumber);
        System.out.println(buildingNum+" "+streetName);
        System.out.println(cityName+", "+stateName+" "+zipCode);
        System.out.println(schoolName);

    }

}
/*
11. Create a class called MyInfo. Write a program that can ask the user to:
            1. Enter your age (int)
            2. Enter your gender (String- One word ONLY)
            3. Enter your full name (String- Multiple words)
            4. Enter your phone number (long)
            5. Enter your zip code (int)
            6. Enter your School name (String- Can be Multiple words)
            7. Enter your city name (String- Can be Multiple words)
            8. Enter your state name (String- One word ONLY)
            9. Enter your building number (int)
            10. Enter your Street name

        MAKE SURE USER CAN ENTER ALL THE INPUT

        Display all the inputs that user entered in following order in separate lines:

            1. full name
            2. age
            3. gender
            4. phone number
            5. address:
                        buildingNumber Street
                        City, State ZipCode

            6. school name



 */