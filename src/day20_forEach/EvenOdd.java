package day20_forEach;

public class EvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        int evenCount = 0;
        int oddCount = 0;

        for (int each : numbers){
            if(each%2==0){
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        System.out.println("EvenCount = "+evenCount);
        System.out.println("oddCount = " + oddCount);
    }
}
