package day27_accessModifiers;

public class Test {
    public static void main(String[] args) {
        Person andrew = new Person("Andrew", "English", 30, 'M');

        andrew.eat("Wings");
        andrew.drink("Beer");
        Person.printPlanetName();
        System.out.println(andrew);
    }
}
