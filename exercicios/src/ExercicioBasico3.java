import java.sql.SQLOutput;
import java.util.Scanner;

public class ExercicioBasico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D;
        double diferenca;

        System.out.println("Primeiro valor: ");
        A = sc.nextInt();
        System.out.println("Segundo valor: ");
        B = sc.nextInt();
        System.out.println("Terceiro valor: ");
        C = sc.nextInt();
        System.out.println("Quarto valor: ");
        D = sc.nextInt();

        diferenca = (A * B - C * D);
        System.out.printf("a diferença do produto de %d e %d pelo produto de %d e %d é: %.2f %n", A, B, C, D, diferenca);

        sc.close();
    }

}
