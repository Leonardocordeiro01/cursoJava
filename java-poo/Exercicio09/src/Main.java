import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] numeros = new int[n];

        int pares = 0;

        for ( int i = 0; i < numeros.length; i++){
            sc.nextLine();
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Numeros Pares: ");
        for ( int i = 0; i < numeros.length; i++){
            if (numeros[i] % 2 == 0){
                System.out.println(numeros[i]);
                pares = pares + 1;
            }
        }

        System.out.println("Quantidade de Pares: " + pares);

        sc.close();
    }
}