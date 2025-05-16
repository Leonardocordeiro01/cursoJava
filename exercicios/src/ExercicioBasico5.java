import java.util.Scanner;
import java.util.Locale;

public class ExercicioBasico5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor, total, P1, P2;
        int numero, quantidade;

        System.out.println("Codigo da peça 1: ");
        numero = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        quantidade = sc.nextInt();
        System.out.println("Valor da peça 1: ");
        valor = sc.nextDouble();
        P1 = quantidade * valor;

        System.out.println("Codigo da peça 2: ");
        numero = sc.nextInt();
        System.out.println("Quantidade de peças: ");
        quantidade = sc.nextInt();
        System.out.println("Valor da peça 2: ");
        valor = sc.nextDouble();
        P2 = quantidade * valor;

        total = P2+P1;

        System.out.println("Valor a pagar: " + total);

        sc.close();
    }
}
