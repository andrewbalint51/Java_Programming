package day20_forEach;

public class CommonElements {
    public static void main(String[] args) {

        int[] array1 ={1,2,3,4,5,6,7,8};
        int[] array2 = {8,5,4,9};

        String result ="";

        for (int each : array1){
            for(int each2 : array2){

                if(each==each2&&!result.contains(""+each)){
                    result+=each+" ";
                }

            }

        }

        System.out.println(result);
    }
}
/*
2. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5


          MUST use for each loops
 */