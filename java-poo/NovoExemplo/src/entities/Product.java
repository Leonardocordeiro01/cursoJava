package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double stock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                +", "
                +String.format("%.2f", price)
                +", "
                +quantity
                +"total stock: "
                +String.format("%.2f", stock());
    }
}
