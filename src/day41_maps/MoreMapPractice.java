package day41_maps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MoreMapPractice {
    public static void main(String[] args) {


        Map<String, Object> person1 = new LinkedHashMap<>();

        person1.put("name", "Arthur");
        person1.put("gender", 'M');
        person1.put("age", 37);
        person1.put("job_title", "SDET");
        person1.put("salary", 100000.50);
        person1.put("married", false);


        System.out.println(person1);

        System.out.println(person1.get("salary"));

        Map<String, Object> sortedPerson1 = new TreeMap<>();
        sortedPerson1.putAll(person1);

        System.out.println(sortedPerson1);

    }
}
