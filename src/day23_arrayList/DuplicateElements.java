package day23_arrayList;

import java.util.ArrayList;

public class DuplicateElements {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        System.out.println(list);

        int size = list.size();

        for(int i =0; i<size; i++){
            list.add(list.get(i));
        }

        System.out.println(list);

    }
}
/*
3. Write a program that can duplicate the elements of an arraylist
		 	ex:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];

 */