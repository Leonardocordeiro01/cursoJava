package application;

import entities.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        Person person = new Person(name, number);

        System.out.println("Is there na initial deposit (y/n)? ");
        String answer = sc.nextLine();
        double initialDeposit;
        while ( answer == "y" || answer == "n") {
            if (answer == "y") {
                initialDeposit = sc.nextDouble();
            } else if (answer == "n") {
                initialDeposit = 0.00;
            } else {
                System.out.println("Invalid answer: ");
            }
        }

        sc.close();
    }
}
