package day16_nestedLoop;


public class FrequencyOfChars {
    public static void main(String[] args) {


        String str = "aabcccdxxxxxa";//search for all common chars 33-122 ASCII

        String result = "";

        for(int i = 0; i<str.length();i++){

            int frequency =0;//The frequency

            for(int j=0;j<str.length();j++){//get the frequency of the char
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }

            if(!result.contains(""+str.charAt(i))){
                result=result+str.charAt(i)+frequency;
            }

        }
        System.out.println(result);


    }
}
/*
7. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all
            the remaining characters
 */