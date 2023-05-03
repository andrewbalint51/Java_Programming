package day34_inheritance.carTask;

public class Honda extends Car{

    public Honda(String make, String model, int year, double price, String color) {
        super(make, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Turn key to start "+getMake()+" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Press gas pedal to start "+getMake()+" "+getModel());
    }
}
