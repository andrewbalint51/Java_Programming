package day35_polymorphism;

import org.w3c.dom.ls.LSOutput;

public class DeviceShop {

    public static void main(String[] args) {


        Iphone iphone = new Iphone("iPhone", "11", 500, "black", "124mg", true, true);
        Samsung samsung = new Samsung("Samsung", "Galaxy", 500, "black", "124mb", true, true);
        Google googlePhone = new Google("Google", "phone", 300, "black", "111", true, true);
        Desktop dt = new Desktop("Dell", "dekstop", 300, "grey", "500mb", false, true);
        Laptop lt = new Laptop("Apple", "macbook", 2000, "grey", "500mb", true, true);
        PersonalComputer pc = new PersonalComputer("Dell", "Computer", 700, "grey", "1111", false, true);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(googlePhone);
        System.out.println(dt);
        System.out.println(lt);
        System.out.println(pc);

    }

}
