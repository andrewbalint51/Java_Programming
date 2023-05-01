package day06_ifStatements;

public class NumberToWord {
    public static void main(String[] args) {

        int num = 6;
        String number;

        if(num==0)
        {
            number = "Zero";
        }
        else if (num==1)
        {
            number = "One";
        }
        else if (num==2)
        {
            number = "Two";
        }
        else if (num==3)
        {
            number = "Three";
        }
        else if (num==4)
        {
            number = "Four";
        }
        else if (num==5)
        {
            number = "Five";
        }
        else if (num==6)
        {
            number = "Six";
        }
        else if (num==7)
        {
            number = "Seven";
        }
        else if (num==8)
        {
            number = "Eight";
        }
        else
        {
            number = "Nine";
        }

        System.out.println("number = " + number);

    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement
 */