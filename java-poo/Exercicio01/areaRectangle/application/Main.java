package application;

import entities.Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle;
        rectangle = new Rectangle();

        System.out.println("Enter rectangle Width and Height: ");
        rectangle.width = sc.nextDouble();
        rectangle.heigth = sc.nextDouble();

        double area = rectangle.area();
        double perimeter = rectangle.perimeter();
        double diagonal = rectangle.Diagonal();

        System.out.printf("Area = %.2f %nPerimeter = %.2f %nDiagonal = %.2f", area, perimeter, diagonal);

        sc.close();
    }
}
