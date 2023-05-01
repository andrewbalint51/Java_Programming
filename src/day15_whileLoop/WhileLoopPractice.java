package day15_whileLoop;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        //System.out.println(maxNum());
        //maxMinNum();
        System.out.println(removeDupes("zzzacccaabhhvrghggghhbbbbbccccc"));
    }

    public static int maxNum(){
        int num =-2147483647;
        Scanner in = new Scanner(System.in);

        for(int i =1; i<=5;i++){
            System.out.println("Enter a number: ");
            int newNum = in.nextInt();
            if(newNum>num)
                num=newNum;

        }

        in.close();
        return num;

    }

    public static int minNum(){
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = in.nextInt();

        for(int i =1; i<=4;i++){
            System.out.println("Enter a number: ");
            int newNum = in.nextInt();
            if(newNum<num)
                num=newNum;

        }

        in.close();

        return num;

    }

    public static void maxMinNum(){
        int max =-2147483647;
        int min = 2147483647;
        Scanner in = new Scanner(System.in);

        for(int i =1; i<=5;i++){
            System.out.println("Enter a number: ");
            int newNum = in.nextInt();
            if(newNum>max)
                max=newNum;
            if(newNum<min)
                min=newNum;
        }

        in.close();
        System.out.println(max);
        System.out.println(min);

    }

    public static String removeDupes(String str){

        String noDupes ="";

        for(int i = 0; i<str.length();i++){

            char each = str.charAt(i);

            if(!noDupes.contains(""+each)){
                noDupes+=each;
            }
        }

        return noDupes;
    }

}
