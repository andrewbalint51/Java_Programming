package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();

        set.addAll(Arrays.asList(400, 200, 401, 40, 4, 8));
        set2.addAll(Arrays.asList(400, 200, 401, 40, 4, 8));
        set3.addAll(Arrays.asList(400, 200, 401, 40, 4, 8));

        System.out.println(set);
        System.out.println(set2);
        System.out.println(set3);


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,10, 20,20,20, 30,30,30,40,40, 40, 5,5,5,5,5));

        System.out.println(list);

        Set<Integer> sorted = new TreeSet<>(list);

        System.out.println(sorted);


    }
}
