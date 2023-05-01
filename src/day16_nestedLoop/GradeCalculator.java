package day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String repeat="";

        do{

            //Ask for side
            System.out.println("Enter your score:");
            int score=in.nextInt();

            if(score<0||score>100){//terminate if invalid
                System.out.println("Invalid Entry");
                System.exit(1);
            }

            //Print results
            if(score<=100&&score>=90){
                System.out.println("Your grade is A");
            }
            else if(score<90&&score>=80){
                System.out.println("Your grade is B");
            }
            else if(score<80&&score>=70){
                System.out.println("Your grade is C");
            }
            else if(score<70&&score>=60){
                System.out.println("Your grade is D");
            }
            else{
                System.out.println("Your grade is F");
            }

            //Ask if they want to continue

            System.out.println("Would you like to calculate another grade?");
            repeat = in.next();
            if(!repeat.equalsIgnoreCase("yes")&&
                    !repeat.equalsIgnoreCase("no")){
                System.out.println("Invalid entry");
                System.exit(1);
            }


        }while(repeat.equalsIgnoreCase("yes"));

        System.out.println("Thank you for using Cydeo Grade Calculator APP");
    }
}
/*
6. Write a program for grade calculator:
                        1. Ask the user "Enter your score"
                                If user enters invalid score, terminate the program after displaying the
                                error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If user enters an invalid entry, terminate the program after displaying the
                                error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
 */