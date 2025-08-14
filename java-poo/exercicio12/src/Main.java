import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numero = new double[n];

        for (int i = 0; i < numero.length; i++){
            sc.nextLine();
            System.out.printf("Digite um numero: ");
            numero[i] = sc.nextDouble();
        }

        double soma = 0.00;
        for (int i = 0; i < numero.length; i++){
            soma = soma + numero[i];
        }

        double media = soma / numero.length;

        System.out.println("Media do vetor = " + media);
        System.out.println("Elementos abaixo da media:");
        for (int i = 0; i < numero.length; i++) {
            if (numero[i] < media){
                System.out.println(numero[i]);
            }
        }

        sc.close();
    }
}