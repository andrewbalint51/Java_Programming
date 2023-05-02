package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDeveloper {
    public static void main(String[] args) {

        CydeoDevStudents student = new CydeoDevStudents("Daniel", 'M', LocalDate.of(1995, 1, 11), "A1", "Zero to Hero", 2);
        System.out.println(student);
    }
}
