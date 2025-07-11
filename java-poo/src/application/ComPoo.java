package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class ComPoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Triangle X area %.2f %n", areaX);
        System.out.printf("Triangle Y area %.2f %n", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else if (areaX < areaY) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Equal areas");
        }
    }
}