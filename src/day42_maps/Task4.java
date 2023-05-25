package day42_maps;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {

        String[] group1 = {"Jeff", "betty", "Sharmanarhar", "Bubbles"};
        String[] group2 = {"Andrew", "Natalie", "Mariana", "Andrey"};
        String[] group3 = {"Erdenne", "Zarina", "Serhii"};
        String[] group4 = {"Joseph", "Hayrengul", "Maria"};
        String[] group5 = {"Slim Jimmy", "Calvin", "Hobbs"};

        Map<Integer, String[]> groups = new LinkedHashMap();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);
        groups.put(5, group5);

        System.out.println(Arrays.toString(groups.get(1)));
        System.out.println();
        System.out.println("OR");
        System.out.println();

        for(String each : groups.get(1)){
            System.out.println(each);
        }

        System.out.println("-------------------------------------------");

        for (Map.Entry<Integer, String[]> eachEntry : groups.entrySet()) {

            System.out.println("Group "+eachEntry.getKey());
            for(String each : eachEntry.getValue()){
                System.out.println(each);
            }
            System.out.println();
        }

    }
}
/*
4. Given the following arrays that contains the names of the students from each group:
	        String[] group1 = {};
	        String[] group2 = {};
	        String[] group3 = {};
	        String[] group4 = {};
	        String[] group5 = {};

	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups
 */
