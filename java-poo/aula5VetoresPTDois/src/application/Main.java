package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < vect.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] =new Product(name, price);
        }
         double som =0.0;

        for (int i = 0 ; i < vect.length; i++){
            som += vect[i].getPrice();
        }

        double avg = som/ vect.length;

        System.out.println(avg);

        sc.close();
    }
}