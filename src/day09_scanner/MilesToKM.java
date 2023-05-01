package day09_scanner;

import java.util.Scanner;

public class MilesToKM {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter Miles");
        double miles = in.nextDouble();

        System.out.println(miles+" miles equal to "+(miles*1.609)+" kilometers");


    }
}
/*6. Create a class named MilesToKM, write a program that can convert Miles to KM
        Ex:
        Enter miles:
        10.0

        output:
        10.0 miles equal to 16.09 kilometers
*/