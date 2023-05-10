package day38_exceptions;

public class TestPersonObject {
    public static void main(String[] args) {
        Person p1 = new Person("John", 28, 'K');

        System.out.println(p1);

        p1.setAge(-25);

        System.out.println(p1);


    }
}
