package day17_customClass;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "aaabbbcdde";

        String freqOfChars ="";


        //char ch;

        for (int i = 0; i<str.length(); i++){

            int freq=0;
            char ch = str.charAt(i);



            for (int j =0; j<str.length();j++){
                if(ch==str.charAt(j)){
                    freq+=1;
                }
            }

            if(!freqOfChars.contains(""+ch)) {
                freqOfChars += ch + "" + freq;
            }


        }

        System.out.println(freqOfChars);

    }
}
