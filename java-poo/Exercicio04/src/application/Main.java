package application;

import java.util.Scanner;
import util.Calculator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price? "+ Calculator.valueDollar);
        System.out.println("how many dollars will be bougt? ");
        double dollar = sc.nextDouble();

        double amountToPaid = Calculator.calculator(dollar);
        System.out.println("Amount to be paid in reais = "+ amountToPaid);

        sc.close();
    }
}