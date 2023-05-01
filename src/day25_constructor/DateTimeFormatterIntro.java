package day25_constructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class DateTimeFormatterIntro {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, MMMM/dd/yy");

        LocalDate time = LocalDate.now();

        System.out.println(time.format(df));

        String[] test  = {"Jeff", "dork", "cheeseman"};



    }
}
/*

 */