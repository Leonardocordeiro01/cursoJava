import java.util.Scanner;

public class ExercicioBasico2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double area, raio, pi;
        pi = 3.14;
        System.out.println("Informe a area do circulo: ");
        raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);

        System.out.println("O valor da area do circulo com raio de " +raio + " é igual a: " + area);

        sc.close();
    }
}
