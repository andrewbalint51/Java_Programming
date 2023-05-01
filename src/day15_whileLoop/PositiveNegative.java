package day15_whileLoop;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int numPos = 0,
                numNeg = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter a number: ");
            int num = in.nextInt();

            if(num>0){
                numPos++;
            }
            else if(num<0){
                numNeg++;
            }


        }
        System.out.println(numPos+" positive and "+numNeg+" negative");
    }

}
/*
2. Create a class named PositiveNegative and write a program that asks user to enter number for 5 times, and
   print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */