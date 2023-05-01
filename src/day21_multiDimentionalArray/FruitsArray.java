package day21_multiDimentionalArray;

public class FruitsArray {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };

        //Task1
        for(String[] group : items){
            for(String fruit : group){
                System.out.print(fruit+"\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        //Task2
        for(String[] group : items){
            for(int i = group.length-1;i>=0;i--){
                System.out.print(group[i]+"\t\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("----------------------------------");
        System.out.println();

        //Task3
        for(int i = items.length-1;i>=0;i--){
            for(String fruit : items[i]){
                System.out.print(fruit+"\t");
            }
            System.out.println();
        }

    }
}
/*
2. Given the Array:
		String[][] items = {
					{"Apple", "Banana", "Grape", "Avocado"},
					{"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
					{"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
					};

		1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water

		2. print the following output: (add \t between two words)
				Avocado   Grape    Banana    Apple
				Diapers   Tissues   Toilet Papers   Paper Towels
				Water    Pepsi    Arizona Tea    Fanta   Coke

		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */