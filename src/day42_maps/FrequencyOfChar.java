package day42_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfChar {

    public static void main(String[] args) {

        String split = "aaabbbbbcccccddddd";
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (String each : split.split("")){
            int freq = Collections.frequency(Arrays.asList(split.split("")), each);

            chars.put(each.charAt(0), freq);
        }

        System.out.println(chars);

    }
}
