package day34_inheritance.carTask;

public class CarShop {

    public static void main(String[] args) {
        Tesla tesla = new Tesla("Tesla", "model X", 2022, 50000, "black");
        CydeoCar ccar = new CydeoCar("CydeoCar", "Version2.0", 2023, 100000, "white");
        Nio nio = new Nio("Nio", "naughton", 2022, 200000, "pink");
        Mercedes mercedes = new Mercedes("Mercedes", "Benz", 2020, 50000, "silver");
        BMW beamer = new BMW("BMW", "M Class", 2019, 15000, "Grey");
        Toyota yota = new Toyota("Toyota", "Corolla", 2009, 4000, "red");
        Honda honda = new Honda("Honda", "Civic", 2012, 8000, "Green");
        Audi audi = new Audi("Audi", "5000", 2015, 25000, "red");

        System.out.println(tesla);
        System.out.println(ccar);
        System.out.println(nio);
        System.out.println(mercedes);
        System.out.println(beamer);
        System.out.println(yota);
        System.out.println(honda);
        System.out.println(audi);

    }
}
