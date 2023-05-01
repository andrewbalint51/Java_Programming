package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class RemovePrior {
    public static void main(String[] args) {
        ArrayList<LocalDate> list = new ArrayList<>();

        list.addAll(Arrays.asList(LocalDate.of(1992, 12, 16),
                                  LocalDate.of(1995, 1, 11),
                                  LocalDate.of(1997, 3,8),
                                  LocalDate.of(2023, 3, 20),
                                  LocalDate.of(2023, 4, 13)));

        System.out.println(list);

        int size = list.size();

        list.removeIf(each -> each.isBefore(LocalDate.of(2016,8,15)));



        System.out.println(list);

    }
}
