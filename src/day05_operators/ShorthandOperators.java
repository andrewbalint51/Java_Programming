package day05_operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        int a = 20;

        System.out.println(a);

        //System.out.println(args);

        //args1 [Ljava.lang.String;@3f0ee7cb
        //args2 [Ljava.lang.String;@3f0ee7cb
        double balance = 100;

        balance +=1000;

        System.out.println(balance);

        balance+=500;

        System.out.println(balance);

        balance+=10_000;

        System.out.println(balance);

        balance -= 1000;

        System.out.println(balance);

        balance -= 5000;

        System.out.println(balance);

        System.out.println("-----------------------");

        double salary = 45000;

        System.out.println(salary);

        salary *=2;

        System.out.println(salary);

        salary*=3;

        System.out.println(salary);

        System.out.println("--------------------------");

        double eth = 4;

        System.out.println(eth);

        eth *=250;

        System.out.println(eth);

        eth /= 2;

        System.out.println("eth = " + eth);

        System.out.println("--------------------------");

        System.out.println("salary = " + salary);

        salary /= 2;

        System.out.println("salary = " + salary);

        System.out.println("--------------------------");

        int b = 39;

        b %= 7;

        System.out.println("b = " + b);



    }
}
