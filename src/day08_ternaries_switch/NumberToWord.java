package day08_ternaries_switch;

public class NumberToWord {

    public static void main(String[] args) {
        String result;
        int number = 7;

        result = (number ==1) ? "One" :(number ==2)? "Two" :(number ==3)? "Three"
                :(number ==4)? "Four" :(number ==5)? "Five" :(number ==6)? "Six"
                :(number ==7)? "Seven" :(number ==8)? "Eight" :(number ==2)? "Two"
                : "Invalid";

        System.out.println(result);

    }

}
/*
1. Create a class called NumberToWord,
		write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: MUST use ternary

 */