package day07_ifStatementsContinued;

public class Grade {
    public static void main(String[] args) {

        char grade = 'f';
        String message = "";

        if(grade != 'A' && grade != 'B' && grade != 'C'
                && grade != 'D' && grade != 'F'){

            message = "Invalid";

        }
        else {
            if(grade=='A'){
                message = "Excellent";
            }
            else if(grade=='B'){
                message = "Great Job";
            }
            else if(grade=='C'){
                message = "Good";
            }
            else if(grade=='D'){
                message = "Passed";
            }
            else if(grade=='F'){
                message = "Failed";
            }

        }

        System.out.println(message);

    }
}
/*
4. Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */