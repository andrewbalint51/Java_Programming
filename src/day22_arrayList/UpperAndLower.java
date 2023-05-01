package day22_arrayList;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "JAVA jahva";
        char[] array = str.toCharArray();

        int upperCount = 0;
        int lowerCount = 0;

        for(char each : array){
            if(Character.isUpperCase(each)){
                upperCount++;
            }
            else if(Character.isLowerCase(each)){
                lowerCount++;
            }
        }

        if(upperCount==lowerCount){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
/*
2. Write program that returns true if the total number of upper case characters are equal to total number of
   Lowercase characters of a string
        Ex:
            str = "JAVA java";

        output:
            true
 */
