package day07_ifStatementsContinued;

public class CappuccinoBuyer {

    public static void main(String[] args) {

        String size = "Grand";

        if(size != "Tall" && size != "Venti" && size != "Grande"){

            System.out.println("Invalid Size");

        }
        else {
            if(size=="Tall"){
                System.out.println("price is $3.69\n90 calories\n");
            }
            if(size=="Grande"){
                System.out.println("price is $3.99\n120 calories\n");
            }
            if(size=="Venti"){
                System.out.println("price is $4.29\n150 calories\n");
            }

        }


    }
}
/*
1. Create a class called  CappuccinoBuyer. A variable named Size is given, write a program that can
    display the price and calories of cappuccino

			Valid sizes are tall, grande, venti and their price & calories are:

						tall:
								price is $3.69
								90 calories

						grande:
								price is $3.99;
								120 calories

						venti:
								price is $4.29
								150 calories

			If the size is invalid then the output should be "Invalid Size"

			Note: MUST use nested if

 */