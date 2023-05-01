package day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String proceed ="";

        System.out.println("Do you want to reserve a room?");
        proceed=in.next();
        in.nextLine();

        while(!proceed.equals("yes")&&!proceed.equals("no")) {

            System.out.println("Invalid entry. Please re-enter");
            proceed=in.next();
            in.nextLine();

        }

        if(proceed.equals("yes")){
            System.out.println("What type of room would you like to reserve?");
            String roomType = in.nextLine();

            while(!roomType.equalsIgnoreCase("King Bed")&&
                  !roomType.equalsIgnoreCase("Queen Bed")&&
                  !roomType.equalsIgnoreCase("single bed")){

                System.out.println("Invalid entry. Please re-enter");
                roomType=in.nextLine();

            }

            if(roomType.equalsIgnoreCase("King Bed")){
                System.out.println("King Bed ==> 120$");
            }
            else if (roomType.equalsIgnoreCase("Queen Bed")){
                System.out.println("Queen Bed ==> 100$");
            }
            else{
                System.out.println("single Bed ==> 80$");
            }

        }
        else {
            System.out.println("Have a nice day");
        }

    }
}
/*
8. Create a class called RoomReservation, write a program for the room reservation, your program asks the user wants
   to reserve a room.

   if user entered yes, then ask which type of room the user wants to reserve. if user entered no, print "have a nice
   day"

   (if user entered any invalid answer (other than yes/no) ask user to reenter until user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

         the program should be able to display the room he/she reserved and total price of the room.

         (if the user selected an invalid room, ask the user to reselect the room until user provides a valid entry)
 */