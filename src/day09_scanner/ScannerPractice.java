package day09_scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //int age = input.nextInt();
        //String secondWord = input.nextLine();


        //System.out.println("age = " + age);
        //System.out.println("secondWord = " + secondWord);

       /* String result = (age ==50 || age ==75 || age==100)?
                                        (age==50)? "20, 30"
                                        :(age==75)? "25, 50"
                                        : "30, 70"
                : "Invalid";

        System.out.println(result);*/

        boolean x, z =true;
        int y = 20;

        x = (y!=10) || (z=false);

        System.out.println("x = " + x);
        System.out.println("z = " + z);

        String s1 = new String("");

    }


}
