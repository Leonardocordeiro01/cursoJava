package application;


import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product;
        product = new Product();

        System.out.println("name of product: ");
        product.name = sc.nextLine();
        System.out.println("price of product: ");
        product.price = sc.nextDouble();
        System.out.println("quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product to be added in stock");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Product data: " + product);

        System.out.println("Enter the number of product be remove for stock");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Product data: " + product);

        sc.close();
    }
}