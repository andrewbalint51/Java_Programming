package day23_arrayList;

import java.util.ArrayList;

public class RemoveAhmed {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Ahmed");
        list.add("Daniel");
        list.add("Ahmed");
        list.add("James");
        list.add("Muhammed");

        System.out.println(list);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i).equals("Ahmed")){

                list.remove(i);
            }
        }





        System.out.println(list.get(1));


    }
}
/*
2. Write a program that can remove all the names "Ahmed" from an arraylist of String
			ex:
                list = ["John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"];

            output:
            	["John", "Daniel", "James", "Muhammed"];
 */