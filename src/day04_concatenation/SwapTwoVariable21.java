package day04_concatenation;

public class SwapTwoVariable21 {
    public static void main(String[] args) {
        int     x = 36,
                y = 18;

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}

/*
9. Create a class named SwapTwoVariable21 and declare the following variables:
            x
            y

    9.1 Write a program that swap variables x & y’ values without using any temporary variables
        Ex:
              x = 10
              y = 15

        output:
                  x = 15
                  y = 10
 */