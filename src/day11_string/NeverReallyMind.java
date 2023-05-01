package day11_string;

import java.util.Scanner;

public class NeverReallyMind {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.endsWith("ly")){
            System.out.println("really???");
        }
        else{
            System.out.println("Never mind");
        }
    }
}
/*
3. Create a class named ReallyNeverMind. Ask the user to enter a word. if the
   word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */