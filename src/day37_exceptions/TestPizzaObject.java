package day37_exceptions;

public class TestPizzaObject {
    public static void main(String[] args) {
        Pizza p1 = new Pizza('L', 3, 3);
        Pizza p2 = new Pizza('L', 3, 3);
        Pizza p3 = new Pizza('M', 2, 2);

        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals("Pizza"));
    }
}
