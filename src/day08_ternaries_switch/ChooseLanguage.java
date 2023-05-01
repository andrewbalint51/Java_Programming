package day08_ternaries_switch;

public class ChooseLanguage {

    public static void main(String[] args) {

        int number = 1;
        String message = "Invalid Number";

       /* message = (number==1)? "Hello, thank you for your call" :(number==2)? "Hola, gracias para llamar"
                :(number==3)? "Merhaba, aradiginiz icin tesekkurler" :(number==4)? "Privet, spasibo za vash zvonok"
                :(number==5)? "Merci ,pour votre appel" : "Invalid Number";*/

        switch (number) {
            case 1:
                message = "Hello, thank you for your call";
                break;
            case 2:
                message = "Hola, gracias para llamar";
                break;
            case 3:
                message = "Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4:
                message = "Privet, spasibo za vash zvonok";
                break;
            case 5:
                message = "Merci ,pour votre appel";
                break;

        }

        System.out.println(message);
    }
}
/*
5. Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the following message:

			for 1: Hello, thank for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel

			for any other numbers print "Invalid Number"

		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */