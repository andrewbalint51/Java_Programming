package day07_ifStatementsContinued;

public class AgeGroups {
    public static void main(String[] args) {

        int age = 151;
        String message="";

        if (age < 0 || age >150)
        {
            message="invalid";
        }
        else {
            if(age<21){
                message="Teenager";
            }
            else if (age>=21 && age<55) {
                message="Adult";
            }
            else if(age>=55){
                message="Senior";
            }


        }
        System.out.println(message);

    }
}
/*
5. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */