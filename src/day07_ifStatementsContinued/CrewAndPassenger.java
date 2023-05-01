package day07_ifStatementsContinued;

public class CrewAndPassenger {
    public static void main(String[] args) {
        int number = 101;
        String message="";

        if(number != 50 && number != 75 && number != 100){

            message = "Invalid Number of People";

        }
        else {
            if(number==50){
                message ="20 crew, 30 passengers";
            }
            if(number==75){
                message ="25 crew, 50 passengers";
            }
            if(number==100){
                message ="30 crew, 70 passengers";
            }

        }
        System.out.println(message);
    }
}
/*
3. Create a class called CrewAndPassenger, Given a number of people on the ship (int number), determine
   how many need to be crew members and how many can be passengers. Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */