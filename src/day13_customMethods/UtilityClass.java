package day13_customMethods;

public class UtilityClass {
    public static void main(String[] args) {

        //System.out.println(isOdd(4));
        //System.out.println(isEven(5));
        //System.out.println(max(4,4));
        //System.out.println(min(5, 5));
        //System.out.println(combine("Tool", "Lick"));
        //System.out.println(frequencyOfWord("Python is cool and so is Java", "Java"));
        //System.out.println(title("ANDreW"));


    }

    public static boolean isOdd(int num){

        //1. Create a method named isOdd, that can return true if a number is an odd number, otherwise returns false
        if(num%2!=0)
            return true;
        else
            return false;


    }

    public static boolean isEven(int num){
        //2. Create a method named isEven, that can return true if a number is an even number, otherwise returns false
        if(num%2==0)
            return true;
        else
            return false;

    }

    public static int max(int num1, int num2){

        //3. Create a method named max, that can return the maximum number between two numbers
        if (num1>=num2)
            return num1;
        else
            return num2;

    }

    public static int min(int num1, int num2){
        //Create a method named min, that can return the minimum number between two numbers
        if (num1<=num2)
            return num1;
        else
            return num2;
    }

    public static String combine(String line1, String line2){
        /*
        Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same,
        return that character once.
        Ex:
            combine("one", "eight")  ==> oneight
         */

        if(line1.charAt(line1.length()-1)==line2.charAt(0)){
            return line1+line2.substring(1);
        }
        else{
            return line1+line2;
        }

    }

    public static int frequencyOfWord(String sentence, String word){
        /*
            6. Create a method named frequencyOfWord that takes two arguments:
                 1. sentence (String)
                 2. word (String)

             The method should return the frequency of the word from the sentence

            Ex:
                frequencyOfWord("Java java jAvA", "java")  ==> 4
         */

        String temp = sentence.toLowerCase();
        int count = 0;

        count = (temp.length()-temp.replace(word.toLowerCase(), "").length())/word.length();

        return count;


    }

    public static String title(String word){
        /*
        7. Create a method named title that takes a string arguments

            The method returns the proper capitalized version of the given argument

         Ex:
            title("jAvA") ===> Java
         */
        return word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

    }

}
