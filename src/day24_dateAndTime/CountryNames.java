package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.addAll(Arrays.asList("Japan", "United States", "Canada", "Jamaica", "United Kingdom"));

        countries.removeIf(name -> name.length()>10);

        System.out.println(countries);
        System.out.println(Arrays.toString(countries.toArray()));
    }
}
/*
6. Create an ArrayList of string called country names, write a program that can remove all the country
   names that have length of 10 or greater
 */