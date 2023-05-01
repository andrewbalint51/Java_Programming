package day12_customMethods;

public class MethodPracticeTasks {
    public static void main(String[] args) {

        //emailDomain("andrew.balint@hotmail.com");
       // emailDomain("jeff_bezos@amazon.us");

       // capitalization("cyDeO", "sCHooL");

       // monthName(1);
        //day(33);
        //daysInAMonth("FEBrUaRY");
        //eligibleToVote(20, false);

        //salary(45, 40);




    }


    public static void salary(double hourlyRate, int weeklyHours){
        /*
            7. Create a method named salary that takes two arguments:
                1. hourlyRate (double)
                2. weeklyHours (int)

            Then the method should display the salary of the person.
            Ex:
                salary(45, 40)

            output:
                You make $45.0 per hour
                You work 40 hours in a week
                Your gross income is $93600.0
         */
        System.out.println("You make $"+hourlyRate+" per hour");
        System.out.println("You work "+weeklyHours+" hours in a week");
        System.out.println("Your gross income is $"+(hourlyRate*weeklyHours*52));


    }

    public static void eligibleToVote(int age, boolean isAmerican){
    /*
        6. Create a method named eligibleToVote that takes two arguments:
            1. age (int)
            2. isAmerican (boolean)

        Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)

        output:
            You are eligible to vote
     */
        if(isAmerican && age>=18){
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible to vote");
        }



    }

    public static void daysInAMonth(String month){
        /*
        5. Create a method that can print how many days a month has
             Ex:
                month("jUNe")

                output:
                     June has 30 days
         */
        month = month.substring(0,1).toUpperCase()+month.substring(1).toLowerCase();

        switch (month){
            case "February":
                System.out.println(month+" has 28 days");
                break;
            case "January": case "March": case "May": case "July":
            case "August": case "October": case "December":
                System.out.println(month+" has 31 days");
                break;
            case "April": case "June": case "September":
            case "November":
                System.out.println(month+" has 30 days");
                break;
            default:
                System.out.println("Invalid Input");
        }


    }

    public static void day(int dayNum){
        /*
        4. Create a method named day that can display the name of the day based on the given number to
           the method, if the number is invalid, then the method should print the error message "Invalid
           Number"
    Ex:
        day(5)

        output:
            Friday
         */
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Number");
        }


    }

    public static void monthName(int monthNumber){
       /* 3. Create a method named monthName that can display the name of the month based on the given
             number to the method, if the number is invalid, then the method should print the error
             message "Invalid Number"
        Ex:
        monthName(6)

        output:
        June*/

        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Number");
        }


    }

    public static void capitalization(String firstName, String lastName){

       /* 2. Create a method named capitalization that can format the first and last names of the person and
             display the full name of the person
        Ex:
        capitalization("cyDeO", "sCHooL")

        output:
        full name: Cydeo School*/

        String firstCapped = ""+firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        String lastCapped = ""+lastName.substring(0,1).toUpperCase()+lastName.substring(1).toLowerCase();

        System.out.println(firstCapped+" "+lastCapped);

    }

    public static void emailDomain(String email){

/*
1. Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail

 */
        System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")).toLowerCase());
    }

}

