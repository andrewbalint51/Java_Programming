package day41_maps;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("C02", "Bubbles");
        map.put("B03", "Madeleine");
        map.put("D04", "Bubs");
        map.put("C03", "Bubbles");
        map.put("C04", "Bubbles");
        map.put("C05", "Bubbles");


        System.out.println(map.size());

        System.out.println(map);

        System.out.println(map.get("C05"));

        map.put("C05", "Bubba");

        System.out.println(map);

        System.out.println(map.get("B03"));

        map.replace("B03", "Baby");

        System.out.println(map.get("B03"));

        System.out.println(map);

        map.remove("C05");

        System.out.println(map);

        System.out.println(map.containsValue("Bubbles"));

        System.out.println(map.equals(map));

        map.clear();

        System.out.println(map);



    }
}
