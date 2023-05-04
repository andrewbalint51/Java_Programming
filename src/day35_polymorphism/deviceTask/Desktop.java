package day35_polymorphism.deviceTask;

public class Desktop extends Computer{
    public Desktop(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void type(){
        System.out.println("Press keys to type");
    }

    @Override
    public void turnOn() {
        System.out.println("Press power button to turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Press power button to turn off");
    }
}
