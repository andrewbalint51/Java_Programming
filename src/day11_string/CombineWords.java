package day11_string;

import day12_customMethods.MethodPracticeTasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two words: ");
        String w1 = scan.next();
        String w2 = scan.next();


        if(w1.endsWith(w2.substring(0,1))){
            System.out.println(w1.concat(w2.substring(1,w2.length())));
        }
        else {
            System.out.println(w1.concat(w2));
        }



    }
}
/*
5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that
    character once.

                Input:
                    one
                    eight
                Output:
                    oneight
 */