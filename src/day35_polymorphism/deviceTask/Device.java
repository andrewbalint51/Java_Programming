package day35_polymorphism.deviceTask;

public abstract class Device {

    private final String brand, model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {

        if(brand.isEmpty()||brand.equals(null)){
            System.err.println("Invalid brand entered.");
            System.exit(1);
        }
        this.brand = brand;

        if(model.isEmpty()||model.equals(null)){
            System.err.println("Invalid model entered.");
            System.exit(1);
        }
        this.model = model;
        setPrice(price);
        setColor(color);

        if(size.isEmpty()||size.equals(null)){
            System.err.println("Invalid size entered.");
            System.exit(1);
        }

        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public void setPrice(double price) {
        if(price<=0){
            System.err.println("Invalid price entered: $"+price+" must be greater than zero.");
            System.exit(1);
        }
        this.price = price;
    }

    public void setColor(String color) {
        if(color.isEmpty()||color.equals(null)){
            System.err.println("Invalid color entered.");
            System.exit(1);
        }
        this.color = color;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }


}
