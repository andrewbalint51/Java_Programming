package day35_polymorphism;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Hold power button to turn on");
    }

    @Override
    public void turnOff() {
        System.out.println("Hold power button to turn off");
    }

    @Override
    public void downloadApp() {
        System.out.println("Tap to download app");
    }
}
