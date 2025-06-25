package application;


import entities.Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        employee.tax = sc.nextDouble();

        double salaryUpdate = employee.netSalary();
        System.out.println("employee: "+ employee.name + ", "+ salaryUpdate);
        System.out.println("which percentage to incriase salary?");
        double perc = sc.nextDouble();
        employee.increaseSalary(perc);

        System.out.println(employee);

        sc.close();
    }
}
