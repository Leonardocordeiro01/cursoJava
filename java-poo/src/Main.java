import java.util.Scanner;
// MINHA RESOLUÇÃO DO PROBLEMA ANTES DE ESTUDAR O MODULO DE ORIENTAÇÃO A OBJETOS
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double areaX, areaY;

        System.out.println("enter the measures of tringle X: ");
        areaX = readValues();
        System.out.printf("Triangle X area %.2f %n ", areaX);

        System.out.println("enter the measures of tringle Y: ");
        areaY = readValues();
        System.out.printf("Triangle Y area %.2f %n ", areaY);

        if (areaX > areaY){
            System.out.println("Larger area: X");
        } else if (areaX < areaY) {
            System.out.println("Larger area: Y");
        } else {
            System.out.println("Equal areas");
        }

        sc.close();
    }

    public static double readValues() {
        Scanner sc = new Scanner(System.in);
        double area, a, b, c, p;

        System.out.println("enter the value of a: ");
        a = sc.nextDouble();
        System.out.println("enter the value of b: ");
        b = sc.nextDouble();
        System.out.println("enter the value of c: ");
        c = sc.nextDouble();

        p = (a+b+c)/2;

        return area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}