package src.entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public Product (String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }

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
                +String.format("%.2f ", price)
                +", "
                +quantity
                +"total stock: "
                +String.format("%.2f ", stock());
    }
}
