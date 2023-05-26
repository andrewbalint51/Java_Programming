package day40_collections;

import day31_inheritance.testingPackage.A;

import java.util.*;

public class SortAndRemoveDupes {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(2,5,78,5,3,2));

        System.out.println(list);

        Set<Integer> set = new TreeSet<>();

        set.addAll(list);

        list.clear();
        list.addAll(set);

        System.out.println(list);

        Set<Integer> hashSet = new LinkedHashSet<>();

        hashSet.addAll(list);

        hashSet.add(79);
        hashSet.add(null);
        hashSet.add(15);
        hashSet.add(6);

        System.out.println(hashSet);

    }
}
