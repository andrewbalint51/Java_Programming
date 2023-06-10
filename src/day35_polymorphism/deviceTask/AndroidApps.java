package day35_polymorphism.deviceTask;

public interface AndroidApps extends Downloadable{
    String appStoreName="Android Store", OS="Android";

    private static void eat(){
        //sensitive code.
    }

    default void eat(int chomp) {
        //sensitive code
    }
}
