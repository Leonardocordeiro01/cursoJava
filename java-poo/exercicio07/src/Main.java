import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vet = new double[n];

        for (int i = 0; i < vet.length ; i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            vet[i] = sc.nextDouble();
        }

        double soma = 0.00;

        for (int i = 0; i< vet.length ; i++){
            soma = soma + vet[i];
        }

        double media = soma / vet.length;

        System.out.println("Valores =");
        for (int i = 0; i< vet.length ; i++){
            System.out.println(vet[i]);
        }
        System.out.println("Soma = " + soma);
        System.out.println("Media = " + media);

        sc.close();
    }
}