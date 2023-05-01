package day11_string;

public class EmailTask1 {
    public static void main(String[] args) {

        String email = "andrew_balint@gmail.com";
//                      012345678901234

        if(email.contains("_")){

            int index1 = email.indexOf("_");//6
            int index2 = email.indexOf("@");//13
            String firstName = email.substring(0,index1);
            String lastName = email.substring(index1+1,index2);
            String address = email.substring(index2,email.length());
            System.out.println(lastName+"_"+firstName+address);


        }
        else{
            System.out.println(email);
        }

    }
}
/*
6. Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
 */