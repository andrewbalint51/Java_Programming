package day24_dateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateIntro {
    public static void main(String[] args) {

        System.out.println(leapYear(1993));
    }


    public static boolean leapYear(int birthYear) {

        boolean bornOnLY = false;

        LocalDate year = LocalDate.of(birthYear, 1,1);

        bornOnLY= year.isLeapYear();

        return bornOnLY;

    }

}