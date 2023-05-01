package day30_inheritance.sporttask;

public class TestSport {
    public static void main(String[] args) {


        Baseball baseball = new Baseball("Cards vs Cubs", "Hit the ball", 9, 4);
        Basketball bball = new Basketball("Suns vs Clippers", "Get buckets", 5, 3);

        System.out.println(baseball);
        System.out.println(bball);
    }

}
