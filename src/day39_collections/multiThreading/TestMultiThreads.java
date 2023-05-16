package day39_collections.multiThreading;

public class TestMultiThreads {

    public static void main(String[] args) {


        HelloWorldThread thread1 = new HelloWorldThread();
        HelloWorldThread thread2 = new HelloWorldThread();

        thread1.start();
        thread2.start();


    }
}
/*


 */