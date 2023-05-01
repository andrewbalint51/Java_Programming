package day15_whileLoop;

import java.util.Scanner;

public class LogInFunction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean lockedOut = false;
        int attempts=0;

        while(!lockedOut){

            System.out.print("username: ");
            String username = in.next();

            System.out.print("password: ");
            String pw = in.next();

            if(username.equals("Cydeo")&&pw.equals("Cydeo123")){
                System.out.println("Logged in");
                break;
            }
            else{
                System.out.println("Incorrect Username or Password");
                attempts+=1;
            }

            if(attempts==4){
                System.out.println("Your account is locked");
                lockedOut=true;
            }

        }


    }
}
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */