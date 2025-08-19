import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];

        for (int i=0; i < n; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", i+1);
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
        }

        int maisVelho = idade[0];
        int marcador = 0;
        for (int i=0; i < n; i++){
            if (idade[i] > maisVelho){
                maisVelho = idade[i];
                marcador = i;
            }
        }

        System.out.println("Pessoa mais velha: " + nome[marcador]);

    }
}