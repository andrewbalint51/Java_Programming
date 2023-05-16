package day39_collections.multiThreading;

public class HelloWorldThread extends Thread{

    @Override
    public void run() {
        for(int i=1; i<6;i++ ){
            System.out.println("Hello World "+i);
            try {
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }


}
