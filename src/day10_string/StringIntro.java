package day10_string;

import java.util.Scanner;

public class StringIntro {
    public static void main(String[] args) {
        boolean A = true, B = !A==false;

/*        if(B)
            System.out.println("B");
        else {
            System.out.println("A");
        }
        else if (A)
            System.out.println("C");*/

        //System.out.println(A);
        //System.out.println(B);

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int length = word.length();
        word = word.substring(0, length/2);

        //WRITE YOUR CODE HERE
        System.out.println(word);
        
    }
}
