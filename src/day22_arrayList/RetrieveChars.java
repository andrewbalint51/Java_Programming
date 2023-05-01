package day22_arrayList;

import java.util.ArrayList;

public class RetrieveChars {
    public static void main(String[] args) {

        String str = "Wooden Spoon!";
        String letters ="",
               numbers ="",
               specialChars="";


        for(int i =0; i <str.length(); i++){

            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                letters+=""+ch;
            }
            else if(Character.isDigit(ch)){
                numbers+=""+ch;
            }
            else if (!Character.isLetterOrDigit(ch)) {
                specialChars+=""+ch;
            }
        }

        System.out.println("Letters: \""+letters+"\";");
        System.out.println("Digits: \""+numbers+"\";");
        System.out.println("specialChars: \""+specialChars+"\";");

    }
}
/*
1. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
            str = "Wooden Spoon!"

        output:
            letters= "WoodenSpoon";
            Digits = "";
            specialChars = " !";
 */