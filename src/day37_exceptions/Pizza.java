package day37_exceptions;

public class Pizza {

    private char size;
    private int numCheeseTopping, numPepperoniTopping;

    public Pizza(char size, int numCheeseTopping, int numPepperoniTopping) {
        setSize(size);
        setNumCheeseTopping(numCheeseTopping);
        setNumPepperoniTopping(numPepperoniTopping);
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getNumCheeseTopping() {
        return numCheeseTopping;
    }

    public void setNumCheeseTopping(int numCheeseTopping) {
        this.numCheeseTopping = numCheeseTopping;
    }

    public int getNumPepperoniTopping() {
        return numPepperoniTopping;
    }

    public void setNumPepperoniTopping(int numPepperoniTopping) {
        this.numPepperoniTopping = numPepperoniTopping;
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

        totalCost+=(2*numCheeseTopping)+(2*numPepperoniTopping);

        return totalCost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numCheeseTopping=" + numCheeseTopping +
                ", numPepperoniTopping=" + numPepperoniTopping +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if( !(obj instanceof Pizza) ){
            System.out.println("Invalid Object added: "+obj);
            System.exit(1);
        }

        if(size == ((Pizza) obj).size){
            if(numPepperoniTopping == ((Pizza) obj).numPepperoniTopping){
                    return true;

            }
        }

        return false;
    }
}
