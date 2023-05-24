package day42_maps;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {


        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        int countMale = 0;
        int countFemale = 0;

        for (String each : employeeMap.keySet()){
            String gender = employeeMap.get(each);

            if(gender.equals("M"))
                countMale++;
            else if (gender.equals("F"))
                countFemale++;

        }

        System.out.println("countFemale = " + countFemale);
        System.out.println("countMale = " + countMale);


        System.out.println("--------------------------------------------");

        for (Map.Entry<String, String> each : employeeMap.entrySet()) {

            if(each.getValue().equals("M")){
                each.setValue("Male");
            }
            else{
                each.setValue("Female");
            }
        }

        System.out.println(employeeMap);

    }
}