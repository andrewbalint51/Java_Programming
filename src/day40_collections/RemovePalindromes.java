package day40_collections;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("kayak", "java", "python", "level", "civic", "whip","smash"));

        System.out.println(list);
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String next = it.next();
            if(next.equalsIgnoreCase(StringUtility.reverse(next))){
                it.remove();
            }
        }

        System.out.println(list);


    }
}
