package day41_maps;

import java.util.*;

public class MapsPractice {
    public static void main(String[] args) {


        Map<String, Integer> hashMap = new HashMap<>(); //Random order
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(); //Maintains insertion order
        Map<String, Integer> treeMap = new TreeMap<>(); //Key cannot be null. Value can be. ascending order
        Map<String, Integer> hashTable = new Hashtable<>(); //No nulls allowed. Synchronized.

        hashMap.put("Daniel", 95000);
        hashMap.put("Emily", 100000);
        hashMap.put("Bella", 85000);
        hashMap.put("Aaron", 78000);
        hashMap.put("Chris", null);
        hashMap.put("Breanna", null);
        hashMap.put(null, 77000);
        hashMap.put(null, 78000);
        hashMap.put(null, 79000);
        System.out.println(hashMap);

        System.out.println("-----------------------------------------");

        linkedHashMap.put("Daniel", 95000);
        linkedHashMap.put("Emily", 100000);
        linkedHashMap.put("Bella", 85000);
        linkedHashMap.put("Aaron", 78000);
        linkedHashMap.put("Chris", null);
        linkedHashMap.put("Breanna", null);
        linkedHashMap.put(null, 77000);
        linkedHashMap.put(null, 78000);
        linkedHashMap.put(null, 79000);
        System.out.println(linkedHashMap);


        System.out.println("-----------------------------------------");

        treeMap.put("Daniel", 95000);
        treeMap.put("Emily", 100000);
        treeMap.put("Bella", 85000);
        treeMap.put("Aaron", 78000);
        treeMap.put("Chris", null);
        treeMap.put("Breanna", null);
       // treeMap.put(null, 77000);
       // treeMap.put(null, 78000);
       // treeMap.put(null, 79000);
        System.out.println(treeMap);

        System.out.println("------------------------------------------");


        hashTable.put("Daniel", 95000);
        hashTable.put("Emily", 100000);
        hashTable.put("Bella", 85000);
        hashTable.put("Aaron", 78000);
        //hashTable.put("Chris", null);
        //hashTable.put("Breanna", null);
        // hashTable.put(null, 77000);
        // hashTable.put(null, 78000);
        // hashTable.put(null, 79000);

        try {
            hashTable.put("Javon", 79000);
        }
        catch(RuntimeException e){
            e.printStackTrace();
        }


        System.out.println(hashTable);
    }
}
