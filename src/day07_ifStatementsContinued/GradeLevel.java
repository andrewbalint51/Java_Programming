package day07_ifStatementsContinued;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 4;
        String message ="";

        if(gradeLevel>0 && gradeLevel <=18){

            if(gradeLevel>=1 && gradeLevel<=5){
                message="Elementary School";
            }
            else if (gradeLevel>=6 && gradeLevel<=8){
                message="Middle School";
            }
            else if (gradeLevel>=9 && gradeLevel<=12){
                message="High School";
            }
            else if (gradeLevel>=13 && gradeLevel<=16){
                message="College";
            }
            else{
                message="Grad School";
            }


        }
        else{
            message = "Invalid grade level given";
        }

        System.out.println(message);

    }
}
/*
7. Create a class called GradeLevel, Given a number(byte) grade level determine and print
which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */