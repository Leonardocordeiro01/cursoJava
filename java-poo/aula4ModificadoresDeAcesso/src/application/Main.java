package application;


import entities.Product;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("name of product: ");
        String name = sc.nextLine();
        System.out.println("price of product: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        System.out.println("Update price: " + product.getPrice());

        System.out.println("Product data: " + product);

        product.setName("Computer");
        System.out.println("update name: " + product.getName());
        product.setPrice(1200.00);
        System.out.println("Enter the number of product to be added in stock ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product be remove for stock ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Product data: " + product);

        sc.close();
    }
}