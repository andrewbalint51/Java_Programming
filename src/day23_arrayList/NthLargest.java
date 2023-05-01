package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NthLargest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,8, 9, 4, 3, 5,4, 1,8));

        ArrayList<Integer> nonDupe = new ArrayList<>();

        System.out.println(list);
        int n = 5;

        //remove duplicates
        for(int each : list){
            if(nonDupe.contains(each)){
                continue;
            }
            nonDupe.add(each);
        }

        Collections.sort(nonDupe);

        System.out.println(nonDupe);

        System.out.println(nonDupe.get(nonDupe.size()-n));


    }
}
/*
4. write a program that can return the nth largest number from an arraylist
            ex:
	            arraylist = {1,2,3,4,5,6,7,7,8,8}
	            n = 5

            output:
                4
 */