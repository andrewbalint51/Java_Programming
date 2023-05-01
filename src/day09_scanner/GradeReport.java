package day09_scanner;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int grade = in.nextInt();

        in.close();

        if (grade>=90)
            System.out.println("A");
        else if (grade>=80)
            System.out.println("B");
        else if (grade>=70)
            System.out.println("C");
        else if (grade>=60)
            System.out.println("D");
        else
            System.out.println("F");


    }
}
/*
3. Create a class named GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */