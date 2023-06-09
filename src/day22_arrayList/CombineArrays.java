package day22_arrayList;

import java.util.ArrayList;

public class CombineArrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        //list.add(arr1);

        for(String each : arr1){
            list.add(each);
        }

        for(String each : arr2){
            list.add(each);
        }

        System.out.println(list);



    }
}
/*
3. write a program that can combine two String arrays into one arrayList
                ex:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */