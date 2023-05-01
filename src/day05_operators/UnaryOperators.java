package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //pre-increment and pre-decrement

        int x = 10;

        System.out.println(++x);

        int y = 100;

        System.out.println(--y);

        System.out.println("----------------------------------");

        int a = 50;
        System.out.println(a++);
        System.out.println(a);

        int b = 25;
        System.out.println(b--);
        System.out.println(b);

        System.out.println("----------------------------------");

        int n = 30;
        int m = n++;

        System.out.println("n = " + n);
        System.out.println("m = " + m);


    }
}
