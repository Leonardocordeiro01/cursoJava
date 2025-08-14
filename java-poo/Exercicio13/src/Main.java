import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];
        double pares = 0.00;

        for ( int i = 0; i < numeros.length; i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        int quantidade = 0;
        for ( int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                quantidade = quantidade + 1;
                pares = pares + numeros[i];
            }
        }


        if (pares == 0) {
            System.out.println("Nenhum numero Par");
        } else {
            double media = pares / quantidade;
            System.out.println("Media dos pares: " + media);
        }



    }
}