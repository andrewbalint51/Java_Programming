package day35_polymorphism;

public abstract class Phone extends Device{

    public Phone(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, price, color, size, hasBattery, hasPowerButton);
    }

    public void call(long phoneNum){
        System.out.println("Calling "+phoneNum);
    }
    public void text(long phoneNum){
        System.out.println("Texting "+phoneNum);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", hasBattery=" + isHasBattery() +
                ", hasPowerButton="  + isHasPowerButton() +
                "}";
    }
}
