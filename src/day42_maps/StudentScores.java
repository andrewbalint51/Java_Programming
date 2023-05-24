package day42_maps;

import java.util.*;

public class StudentScores {

    public static void main(String[] args) {


        Map<String, int[]> map = new LinkedHashMap<>();


        map.put("George", new int[] {96, 95, 85, 90, 87});
        map.put("Larry", new int[] {86, 95, 83, 90, 87});
        map.put("Beth", new int[] {96, 95, 81, 90, 87});
        map.put("Edna", new int[] {92, 95, 80, 90, 87});
        map.put("Mack", new int[] {76, 95, 84, 90, 87});


        for (Map.Entry<String, int[]> eachEntry : map.entrySet()) {

            System.out.println(eachEntry.getKey()+": Scores = "+Arrays.toString(eachEntry.getValue()));

        }

    }

}

/*
1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume
that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores

 */