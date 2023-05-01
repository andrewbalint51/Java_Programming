package day17_customClass;

public class Car {

    String make;
    String model;
    int year;
    String color;
    int price;

    public static void main(String[] args) {
        Car car = new Car();

        car.setInfo("dodge", "challenger", 2012, "black", 12000);
        System.out.println(car);
        car.start();
    }

    public void setInfo(String make, String model, int year, String color, int price){

        this.make=make;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
    }

    public String toString(){
        return "Car{" +
                "make=\'" + make +
                "\', model='" + model + "\'" +
                ", year=" + year +
                ", color='" + color + "\'" +
                ", price=" + price +
                "}";
    }

    public void start(){
        System.out.println("VROOOOOOM!");
    }

}
/*
1. Create a custom class named Car
		Attributes:
			make, model, year, color, price

		Actions:
			setInfo(): sets all the fields of the car object
			toString(): when a car object is passed in print statement, it should display all the information
			            of the car object
			start()
 */