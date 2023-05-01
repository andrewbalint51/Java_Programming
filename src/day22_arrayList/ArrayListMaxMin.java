package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMaxMin {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int max = -2147483647;
        int min = 2147483647;
        for (Integer each : list) {

            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }


        }

        System.out.println(max);
        System.out.println(min);
    }
}
/*
4. Write a program that can find the maximum & minimum numbers from an ArrayList of integers
        Ex:
            list = [1,2,3,4,5];

            output:
                Maximum number is 5
                Minimum number is 1
 */