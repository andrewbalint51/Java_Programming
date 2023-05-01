package day21_multiDimentionalArray;

import java.util.Arrays;

public class CydeoStudents {
    public static void main(String[] args) {


        String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
        String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
        String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

        String[][] batch1Groups = new String[3][];

        batch1Groups[0]=batch1Group1;
        batch1Groups[1]=batch1Group2;
        batch1Groups[2]=batch1Group3;

       // System.out.println(Arrays.deepToString(batch1Groups));

        String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch2Groups = new String[3][];

        batch2Groups[0]=batch2Group1;
        batch2Groups[1]=batch2Group2;
        batch2Groups[2]=batch2Group3;

        String[][][] CydeoStudents = new String[2][][];

        CydeoStudents[0]=batch1Groups;
        CydeoStudents[1]=batch2Groups;


        for(String[][] students : CydeoStudents){

            for(String[] batchGroup : students){

                for(String name : batchGroup){
                    System.out.println(name);
                }
            }
        }
    }
}
/*
1. CydeoStudents Task:
		1. given the following arrays:
		 		String[] batch1Group1 = {"Ahmet", "Baturay", "Beyza", "Dilara", "Muhtar"};
		 		String[] batch1Group2 = {"Entisar", "Ermek", "Esmira", "Gadir", "Hrvoje", "Igor", "Muhtar"};
		 		String[] batch1Group3 = {"Kramer", "Lorraine", "Lucy", "Madina", "Yasin", "Muhtar"};

		2. declare an array variable named batch1Groups with the length of three
				2.1 Assign batch1Group1, batch1Group2, batch1Group1 to each indexes
				 of the variable batch1Groups

		3. given the following arrays:
				String[] batch2Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
		 		String[] batch2Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
		 		String[] batch2Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

 		4. declare an array variable named batch24Groups with the length of
 				4.1 Assign batch2Group1, batch2Group2, batch2Group1 to each indexes of the variable batch2Groups

		5. declare an array variable named CydeoStudents and assign batch1Groups & batch2Groups to the indexes of
		   CydeoStudents

		6. Print the names of each students
 */