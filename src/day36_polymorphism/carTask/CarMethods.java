package day36_polymorphism.carTask;

import day34_inheritance.carTask.*;

public class CarMethods {

    public static void main(String[] args){

        Car[] cars = {
                new Honda("Honda", "Pilot", 2010, 25000, "White"),
                new Audi("Audi","Q6", 2014,32000, "Red"),
                new Honda("Honda", "Accord", 2011, 20000,"White"  ),
                new Audi("Audi","Q4",  2015, 33000,"Blue"),
                new Audi("Audi","A7", 2019, 35000,"Black"),
                new Audi("Audi","Q8", 2018, 40000,"White"),
                new Audi("Audi","Q5", 2009, 30000,"Purple"),
                new Audi("Audi","A4", 2011, 30000, "Black"),
                new Honda("Honda","Civic", 2018,30000, "Red"),
                new Honda("Honda","CR-V", 2012, 23000, "Red"),
                new Honda("Honda","HR-V", 2019, 35000,"Blue"),
                new Tesla("Tesla","Model 3", 2015, 45000, "White"),
                new Tesla("Tesla","Model Y", 2017, 65000, "Black"),
                new Tesla("Tesla","Model X", 2016, 48000, "White"),
                new Tesla("Tesla","Model X", 2014, 48000,"Blue"),
        };

        eligibleForRecall(cars);
    }

    public static void eligibleForRecall(Car[] cars){

        System.out.println("The following cars are eligible for recall:");

        for(Car each : cars){
            if(each.getMake().equals("Honda")&&(each.getYear()>=2010&&each.getYear()<=2011)){
                System.out.println(each);
            }
            else if(each.getMake().equals("Audi")&&(each.getYear()>=2015&&each.getYear()<=2019)){
                System.out.println(each);
            }
            else if(each.getMake().equals("Tesla")&&(each.getYear()>=2015&&each.getYear()<=2016)){
                System.out.println(each);
            }
        }

        /*
           1.2 Write a program that can display all the cars that are eligible for recall

	        					Cars that are eligible for recall:
	        							Honda: from year 2010 to 2011
	        							Audi: from year 2015 to 2019
	        							Tesla: from year 2015-2016
         */
    }


}
