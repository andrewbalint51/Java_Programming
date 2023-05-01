package day04_concatenation;

public class PhoneNumber {
    public static void main(String[] args) {
        int countryCode = 1,
            areaCode = 480,
            localNumber = 8765678;

        System.out.println("+"+countryCode+" ("+areaCode+")-"+localNumber);
    }
}
