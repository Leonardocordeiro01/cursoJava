package application;

import entities.Bank;

import java.util.Scanner;
import  java.util.Locale;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Bank bank;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char answer = sc.next().charAt(0);


        if (answer == 'y') {
            System.out.println("enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bank =  new Bank(number, name, initialDeposit);
        } else {
            bank = new Bank(number, name);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bank.deposit(depositValue);
        System.out.println("Update account data: " );
        System.out.println(bank);

        System.out.println("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bank.withdraw( withdrawValue);
        System.out.println("Update account data: ");
        System.out.println(bank);

       sc.close();
    }
}
