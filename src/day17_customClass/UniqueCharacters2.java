package day17_customClass;

public class UniqueCharacters2 {
    public static void main(String[] args) {

        String str = "aabbbrd";

        String unique ="";

        for(int j=0; j<str.length(); j++) {


            char ch = str.charAt(j);

            int freq = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    freq += 1;
                }
            }
            if (freq <= 1) {
                unique += ch;
            }
        }

        System.out.println(unique);
    }
}
