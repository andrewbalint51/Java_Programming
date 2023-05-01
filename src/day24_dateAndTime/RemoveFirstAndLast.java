package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveFirstAndLast {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        names.removeIf(name -> name.toLowerCase().charAt(0)==name.charAt(name.length()-1));

        System.out.println(names);
    }
}
/*
7. Write a program that can remove string elements from an arraylist if the first and last characters of the
   string are same
	ex:
		list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}

	output:
		[Canada, Lan, Ebrahim, Farida]
 */