package day35_polymorphism.deviceTask;

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

        Computer cpu = new Laptop("Dell", "dekstop", 300, "grey", "500mb", false, true);
        Downloadable dl = new Samsung("Samsung", "Galaxy", 500, "black", "124mb", true, true);

        System.out.println(dl instanceof Iphone);
        System.out.println(cpu instanceof Desktop);

        Desktop DK2=null;
        Laptop DK1=null;

        if(cpu instanceof Desktop){
            DK2 = (Desktop) cpu;
        }
        else{
            DK1 = (Laptop) cpu;
        }

        System.out.println(DK2);
        System.out.println(DK1);

    }

}
