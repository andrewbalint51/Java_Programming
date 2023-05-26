package day40_collections;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StackReverse {

    public static void main(String[] args) {

        String word = "Shrimply Pibbles";

        List<String> stack = new Stack<>();

        stack.addAll(Arrays.asList(word.split("")));

        String reverse = "";

        while(!stack.isEmpty()){
            reverse+=((Stack<String>) stack).pop();
        }


        System.out.println(reverse);
    }
}
