package day05_operators;

public class RelationalOperators {
    public static void main(String[] args) {

        int a = 200;
        int b = 1000;

        System.out.println(a>b);
        System.out.println(a<b);

        boolean aIsGreater = a > b;

        System.out.println(aIsGreater);

        int score = 60;
        boolean passed = score >= 60;

        System.out.println("passed = " + passed);

        int age = 21;

        boolean eligibleToBuyAlcohol = age >= 21;

        System.out.println("eligibleToBuyAlcohol = " + eligibleToBuyAlcohol);


        boolean eligibleToVote = age >= 18;

        System.out.println("eligibleToVote = " + eligibleToVote);


        System.out.println("------------------------------");

        System.out.println(100>100);//false
        System.out.println(100>=100); //true


        System.out.println("------------------------------");

        score = 48;

        boolean failed = score < 60;
        System.out.println(failed);


    }
}
