package day23_arrayList;

import java.util.ArrayList;

public class Extraction {
    public static void main(String[] args) {
        String str  = "ABCD123$%#@&456EFG!";
        char[] ch = str.toCharArray();

        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> specials = new ArrayList<>();

        for (char each : ch){
            if(Character.isLetter(each)){
                letters.add(each);
            }
            else if(Character.isDigit(each)){
                numbers.add(each);
            }
            else{
                specials.add(each);
            }
        }

        System.out.println(letters);
        System.out.println(numbers);
        System.out.println(specials);

    }
}
/*
7. Write a program that can extract the special characters, digits and letters from a string and stores them
   into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */