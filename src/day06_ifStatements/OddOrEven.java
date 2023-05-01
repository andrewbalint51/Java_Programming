package day06_ifStatements;

public class OddOrEven {
    public static void main(String[] args) {

        int num = 100;

        boolean isEven = num%2 == 0;//remainder == 0 means that num is even
        boolean isOdd = num%2!=0; //If the remainder is not equal to zero, the number is odd

        System.out.println(num + " is an even number: "+isEven);
        System.out.println(num + " is an odd number: "+isOdd);


    }

}


/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)

 */