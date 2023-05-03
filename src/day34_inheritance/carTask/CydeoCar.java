package day34_inheritance.carTask;

public class CydeoCar extends Car implements AutoPilot, AutoPark, Flyable{

    public CydeoCar(String make, String model, int year, double price, String color) {
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

    @Override
    public void autoPark() {
        System.out.println(getMake()+" "+getModel()+" is self parking");
    }

    @Override
    public void selfDrive() {
        System.out.println(getMake()+" "+getModel()+" is on autopilot");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}
