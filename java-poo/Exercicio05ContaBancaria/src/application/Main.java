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

        double initialDeposit = 0.00;
        if (answer.equals("y") || answer.equals("Y")) {
            System.out.println("enter initial deposit value: ");
            initialDeposit = sc.nextDouble();
        }

        System.out.println(initialDeposit);
        Bank bank = new Bank(number, name);
        bank.newDeposit(initialDeposit);
        System.out.println("Account data: " + bank);

        System.out.println("Enter a deposit value: ");
        initialDeposit = sc.nextDouble();
        bank.newDeposit(initialDeposit);
        System.out.println("Update account data: " + bank);

        System.out.println("Enter a withdraw value: ");
        initialDeposit = sc.nextDouble();
        bank.newWithdraw(initialDeposit);
        System.out.println("Update account data: " + bank);

       sc.close();
    }
}
