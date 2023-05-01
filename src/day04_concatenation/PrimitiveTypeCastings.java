package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {


        byte a = 15;
        short b = a;
        int c = 100;
        a = (byte) c;

        float x = (float) 20.3;

        short z = (short) x;

        System.out.println(z);
        System.out.println("---------------------");

        double d = 2.5;
        byte jk = (byte) d;

        int num = 129;
        byte trash = (byte) num;

        System.out.println(trash);

        int r = 50_000;
        short tuff = (short) r;

        System.out.println(tuff);

    }
}
