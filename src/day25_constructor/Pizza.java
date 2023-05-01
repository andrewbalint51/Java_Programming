package day25_constructor;

public class Pizza {

    public static void main(String[] args) {

        Pizza pepperoni = new Pizza('S', 4, 4);

        System.out.println(pepperoni.calcCost());
        System.out.println(pepperoni);
    }

    public char size;
    public int numberOfCheeseTopping,
               numberofPepperoniTopping;

    public Pizza(char size, int numCheese, int numPep){
        this.size=size;
        this.numberOfCheeseTopping=numCheese;
        this.numberofPepperoniTopping=numPep;
    }

    public double calcCost(){
        double totalCost =0;

        if(this.size=='S'){
            totalCost+=10;
        }
        else if(this.size=='M'){
            totalCost+=12;
        }
        else if(this.size=='L'){
            totalCost+=14;
        }

        totalCost+=(2*numberOfCheeseTopping)+(2*numberofPepperoniTopping);

        return totalCost;
    }

    public String toString(){
        return "{size = "+size+", Number of Cheese: "+numberOfCheeseTopping+", Number of Pepperoni: "
                +numberofPepperoniTopping+"}";
    }


}
/*
Task01:
    Create a custom class named Pizza:
        Attributes:
            size, numberOfCheeseTopping, numberOfPepperoniTopping

            Add a constructor that can set all the fields

        Actions:
            calcCost(): returns the totalCost of the pizza
            toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

        Pizza cost is determined by:
                        S: $10 + $2 per topping
                        M: $12 + $2 per topping
                        L: $14 + $2 per topping
 */