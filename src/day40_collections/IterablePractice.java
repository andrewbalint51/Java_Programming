package day40_collections;

import java.util.*;


public class IterablePractice {
    public static void main(String[] args) {


        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ahmed");
        names.add("Daniel");
        names.add("Ahmed");
        names.add("James");
        names.add("Muhammed");
        names.addAll(Arrays.asList("ahmed", "AhMed", "AHMED"));

        System.out.println(names);

        Iterator<String> it = names.iterator();


        while(it.hasNext()){
            String name = it.next();
            if(name.equalsIgnoreCase("ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("--------------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.add("John");
        names2.add("Ahmed");
        names2.add("Daniel");
        names2.add("Ahmed");
        names2.add("James");
        names2.add("Muhammed");
        names2.addAll(Arrays.asList("ahmed", "AhMed", "AHMED"));

        System.out.println(names2);

        names2.removeIf(p->p.equalsIgnoreCase("ahmed"));

        System.out.println(names2);

        System.out.println("--------------------------------------------");
        List<Integer> ints = new ArrayList<>();
        ints.addAll(Arrays.asList(1,2,3,4,5,6,7,7,9,9,0,10,10));

        int n = 4;

        for(int i =0; i<n-1;i++){
            ints.removeIf(p-> Collections.max(ints)==p);
        }

        int max = Collections.max(ints);

        System.out.println(max);

        System.out.println("--------------------------------------------------");

    }
}
