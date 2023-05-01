package day11_string;

public class EmailTask2 {
    public static void main(String[] args) {

        String email = "grima_wormtongue@hotmail.com";
//                      01234567890123456789012...

        int index1 = email.indexOf("_");//6
        int index2 = email.indexOf("@");//13
        int index3 = email.indexOf(".");//19

        String firstName = email.substring(0,index1);
        String lastName = email.substring(index1+1,index2);
        String domain = email.substring(index2+1,index3);

        String firstNameCapped =firstName.substring(0,1).toUpperCase()+firstName.substring(1,firstName.length());
        String lastNameCapped = lastName.substring(0,1).toUpperCase()+lastName.substring(1,lastName.length());

        System.out.println("First Name:" +firstNameCapped);
        System.out.println("Last Name: " +lastNameCapped);
        System.out.println("Domain: " + domain);



    }
}
/*
7. Create a class called EmailTask2.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

   Write a program that will print out information about user based on email. Print first name, last name, and domain.

   First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

           Ex:
               input:
                   craig_federighi@apple.com

            Output:
                First name: Craig
                Last name: Federighi
                Domain: apple
 */