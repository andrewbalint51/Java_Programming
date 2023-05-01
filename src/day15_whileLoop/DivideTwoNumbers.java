package day15_whileLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 20;
        int result = 0;

        for(int i = num1; i<=num2;i+=num1){
            result++;
        }

        /*while(num2>=num1){
            num2-=num1;
            result++;
        }*/
        System.out.println(result);
    }
}
/*
4.  Create a class named DivideTwoNumbers and Write a program that can divide two positive
    numbers without using / (division) and * (multiplication) operators.
 */