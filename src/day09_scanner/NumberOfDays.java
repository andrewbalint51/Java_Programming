package day09_scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int month = 11;
        String days = "";

        switch (month){

            case 2:
                days = "28 Days";
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                days = "31 Days";
                break;
            case 11: case 9: case 6: case 4:
                days = "30 Days";
                break;
            default:
                days="Invalid";

        }

        System.out.println(days);

    }
}
