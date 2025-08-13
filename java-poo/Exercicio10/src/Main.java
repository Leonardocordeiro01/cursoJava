import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] numero = new double[n];

        for (int i = 0; i < numero.length; i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            numero[i] = sc.nextDouble();
        }

        double maior = numero[0];
        int posicao = 0;

        for (int i = 1; i < numero.length; i++){
            if (numero[i] > maior){
                maior = numero[i];
                posicao = i;
            }
        }

        System.out.println("Maior Valor = " + maior);
        System.out.println("Posição do Maior Valor = " + posicao);

        sc.close();
    }
}