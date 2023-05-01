package day15_whileLoop;

import java.util.Scanner;

public class MarriageProposal {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String answer=""; //The answer

        while(!answer.equalsIgnoreCase("yes")&&
              !answer.equalsIgnoreCase("no")){

            if(!answer.equals("")){//if it's not the first run, then check for invalid
                System.out.println("Invalid answer, please re-enter");
            }


            System.out.println("Will you marry me?");
            answer=in.next();

        }

        if(answer.equalsIgnoreCase("yes")){
            System.out.println("congrats");
        }
        else{
            System.out.println("Goodbye");
        }

    }
}
/*
1.  Create a class named Marriage proposal and Write a program for the  marriage proposal program asking the
    user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the
    user enters either yes or no

 */