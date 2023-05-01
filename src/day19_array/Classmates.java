package day19_array;

import java.util.Arrays;

public class Classmates {

    public static void main(String[] args) {
        String[] classmates = new String[3];

        classmates[0] = "Johnny Bravo";
        classmates[1] = "Kim Possible";
        classmates[2] = "Duke Nukem";

        int[] numbers = {0, 10, 0, 5, 0, 1, 7, 0, 10};
        int [] number2 = {0, 4, 7, 9, 5};

        commonNums(numbers, number2);



        //System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(zeroesToTheEnd(numbers)));


        //printInitials(classmates, 3);

        //reverseNames(classmates, 3);

        //itemsAndPrices();

        }




    public static void printInitials(String[] classmates, int arrayLength) {

        for (int i = 0; i < arrayLength; i++) {
            String initials = "" + classmates[i].charAt(0) + ".";
            for (int j = 0; j < classmates[i].length(); j++) {
                if (classmates[i].charAt(j) == ' ') {
                    initials += classmates[i].charAt(j + 1) + ".";
                }
            }
            System.out.println(initials);
        }
        /*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
    }

    public static void reverseNames(String[] classmates, int arrayLength){

        for (int i = 0; i < arrayLength; i++) {

            String reverse ="";
            for(int j =classmates[i].length()-1;j>=0;j--){
                reverse+=classmates[i].charAt(j);
            }

            System.out.println(reverse);

        }


        /*
        2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
         */
    }

    public static void itemsAndPrices(){

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};



        /*
        3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        1. find out the first index number of "Gloves"

        2. find out if "iPad" is contained in the item list

        3. Print the report of each shopping item
            name - price - #ID
         */
    }

    public static int[] reverseArray(int[] array){

        int[] reversedArray = new int[array.length];

        for(int i = array.length-1;i>=0;i--){

            reversedArray[array.length-1-i]=array[i];
        }

        return reversedArray;
    }

    public static int[] zeroesToTheEnd(int[] array){


        int zeroCount=0;

        //get count of all zeroes
        for(int i = 0;i<array.length-1;i++){



            if(array[i]==0){

                zeroCount+=1;
            }

        }

        boolean isFinished=false;


        while(!isFinished) {//keep moving zeroes to the right until they are all at the end

            for (int i = 0; i < array.length - 1; i++) {


                if (array[i] == 0) {

                    array[i] = array[i + 1];
                    array[i + 1] = 0;
                }

            }



            isFinished=true;


            //check if all zeroes are at the end
           for(int i=array.length-zeroCount;i<array.length;i++){
                if(array[i]!=0){
                    isFinished=false;
                    break;
                }


            }
        }

        return array;

        /*
        7. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
         */
    }

    public static void commonNums(int[] array1, int[] array2){

        String result ="";

        for (int i =0;i<array1.length;i++){
            for(int j=0;j<array2.length;j++){

                if(array1[i]==array2[j]&&!result.contains(""+array1[i])){
                    result+=array1[i]+" ";
                }

            }

        }

        System.out.println(result);

        /*
        8. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */
    }

}

