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





        sc.close();
    }
}
