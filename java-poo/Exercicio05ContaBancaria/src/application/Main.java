package application;

import entities.Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        String answer = sc.nextLine();
        sc.nextLine();

        double initialDeposit = (answer == "y" || answer == "Y") ? initialDeposit = sc.nextDouble() : 0.00;

        System.out.println(initialDeposit);
        Bank bank = new Bank(number, name, initialDeposit);
        bank.newDeposit(initialDeposit);

        System.out.println("Account data: " + bank);

       sc.close();
    }
}
