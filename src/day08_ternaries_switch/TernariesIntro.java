package day08_ternaries_switch;

public class TernariesIntro {
    public static void main(String[] args) {


        int score = 59;

        String result = (score >=60) ? "Passed" : "Failed";

        System.out.println(result);
        System.out.println("--------------------------------------");

        int age = 20;
        String r = "";

        r = (age>=21)?"Eligible":"Not Eligible";
        System.out.println(r);

        System.out.println("--------------------------------------");
    }
}
