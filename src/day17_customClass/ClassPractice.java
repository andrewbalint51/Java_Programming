package day17_customClass;

public class ClassPractice {

    public static void main(String[] args) {

        SalaryCalculator sc = new SalaryCalculator();

        sc.setInfo(70, 5,25, 40);

        Item item1 = new Item();
        Item item2 = new Item();


        item1.setInfo("Apples", 4.99, 15);
        item2.setInfo("Apples", 4.99, 37);


       // System.out.println(item1.calcCost());
        System.out.println(item1.toString());
        System.out.println(item2.toString());

        //System.out.println(sc);

    }

    //car.make;

//    car1.setInfo("dodge", "challenger", 2012, "black", 12000);

}
