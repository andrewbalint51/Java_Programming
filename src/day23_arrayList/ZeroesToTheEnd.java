package day23_arrayList;

import java.util.ArrayList;

public class ZeroesToTheEnd {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(0);
        list.add(2);
        list.add(0);
        list.add(3);
        list.add(0);
        list.add(4);
        list.add(0);
        list.add(5);


        System.out.println(list);

        ArrayList<Integer> finalList = new ArrayList<>();

        for (int each : list) {
            if(each!=0){
                finalList.add(each);
            }
        }

        for(int i = finalList.size(); i<list.size();i++){
            finalList.add(0);
        }
        System.out.println(finalList);

    }
}
/*
5. Write a program that can move all the zeros to the last indexes of ArrayList
            ex:
                list: {1,0,2,0,3,0,4,0}

            output:
                [1, 2, 3, 4, 0, 0, 0, 0]
 */