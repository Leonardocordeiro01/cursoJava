import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        double[] A = new double[n];
        double[] B = new double[n];
        double[] resultado = new double[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++){
            sc.nextLine();
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < B.length; i++){
            sc.nextLine();
            B[i] = sc.nextInt();
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < resultado.length; i++){
            resultado[i] =A[i] + B[i];
            System.out.println(resultado[i]);
        }



        sc.close();
    }
}