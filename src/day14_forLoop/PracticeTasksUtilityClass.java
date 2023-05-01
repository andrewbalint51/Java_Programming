package day14_forLoop;


import java.util.Scanner;

public class PracticeTasksUtilityClass {

    public static void main(String[] args) {
        //printShape();
        //FINRA();
        //System.out.println(sumOfAll(50));
        //System.out.println(factorial(7));
        //DNC("mn@#123Ab!");
        //System.out.println(sumOfDigits("A1B2C3hsdkljfh8jkhhsdjkfh6"));
        //System.out.println(isPalindrome("Levels"));

        //UtilityClass.title()

        System.out.println(maxOfFive());


    }

    public static void printShape(){
        /*
        1. Use a loop to print the following shape:

                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *

         */
        for(int i=0;i<8 ;i++){

            System.out.println("* * * * * *");

        }


    }


    public static void FINRA(){
        /*
        2. Write a method which prints out the numbers from 1 to 100 but for numbers which are a
           multiple of both 3 and 5,print "FINRA" instead of the number,  for numbers which are a
           multiple of 3, print "FIN" instead of the number andfor numbers which are a multiple of 5,
           print "RA" instead of the number.

         ex:
            output:
              1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN
         */

        for(int i=1; i<=100;i++){

            if (i%3==0){

                if (i%5==0)
                {
                    System.out.println("FINRA ");
                }
                else{
                    System.out.println("FIN ");
                }

            }
            else if (i%5==0){
                System.out.println("RA ");

            }
            else{
                System.out.println(i+" ");
            }


        }

    }

    public static int sumOfAll(int num){

        /*
        3. write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
         */


        int sum=0;

        for(int i =1;i<=num;i++){
            sum+=i;
        }

        return sum;

    }

    public static int factorial(int num){
        /*
        4. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120

                	( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
         */
        for(int i = num-1;i>0;i--){
            num*=i;
        }

        return num;

    }

    public static void DNC(String str){

        /*
        5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
         */
        String letters = "";
        String digits = "";
        String specialChars="";

        for (int i =0; i<str.length();i++){

            if(str.charAt(i)>=48 && str.charAt(i)<=57)
            {
                digits+=str.charAt(i);
            }
            else if ((str.charAt(i) >= 65 && str.charAt(i) <=90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122))
            {
                letters+=str.charAt(i);
            }
            else
            {
                specialChars+=str.charAt(i);
            }

        }

        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

    public static int sumOfDigits(String str){
        /*
        6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
         */

        int sum =0;

        for (int i =0; i<str.length();i++){

            if(str.charAt(i)>=48 && str.charAt(i)<=57){
                sum+=str.charAt(i)-48;
            }

        }


        return sum;
    }

    public static boolean isPalindrome(String str){
        /*
        7. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true
         */
        String reversed = "";

        for (int i = str.length()-1; i>=0; i--){
            reversed = reversed+str.charAt(i);
        }



        if(str.equalsIgnoreCase(reversed)){
            return true;
        }
        else{
            return false;
        }

    }

    public static int maxOfFive(){

        Scanner scan = new Scanner(System.in);
        int max=0;

        for(int i=0;i<5;i++){
            System.out.println("Enter a number:");
            int next = scan.nextInt();
            if(next>max)
                max=next;
        }


        return max;

    }

}
