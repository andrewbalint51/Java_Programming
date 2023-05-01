package day17_customClass;

public class Item {

    public String name;
    public double unitPrice;
    public int quantity;


    public void setInfo(String n, double price, int q){
        this.name=n;
        this.unitPrice=price;
        this.quantity=q;
    }

    public double calcCost(){
        return unitPrice*quantity;
    }

    public String toString(){
        return "Item{" +
                "name=" + name +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity+"}";
    }
}
