package day41_maps;

import java.util.*;

public class MapsPractice {
    public static void main(String[] args) {


        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> map2 = new LinkedHashMap<>();
        Map<String, Integer> map3 = new TreeMap<>();
        Map<String, Integer> map4 = new Hashtable<>();

        map.put("Daniel", 95000);
        map.put("Emily", 100000);
        map.put("Bella", 85000);
        System.out.println(map);



    }
}
