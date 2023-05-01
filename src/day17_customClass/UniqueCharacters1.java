package day17_customClass;

public class UniqueCharacters1 {

    public static void main(String[] args) {
        String str = "aabbbrd";

        String unique ="";

        for (int i =0; i<str.length();i++){
            if(str.indexOf(str.charAt(i))== str.lastIndexOf(str.charAt(i))){
                unique+=str.charAt(i);
            }
        }

        System.out.println(unique);
    }
}
