import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        String[] name = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for (int i = 0 ; i < n ; i++){
            sc.nextLine();
            System.out.printf("Dados da %da pessoa: %n", i+1);
            System.out.printf("Nome: ");
            name[i] = sc.next();
            System.out.printf("Idade: ");
            idade[i] = sc.nextInt();
            System.out.printf("Altura: ");
            altura[i] = sc.nextDouble();
        }

        double alturaTotal = 0.00;
        for (int i = 0; i < n ; i++){
            alturaTotal = alturaTotal + altura[i];
        }
        double alturaMedia = alturaTotal/n;
        System.out.println("Altura média: " + alturaMedia);

        double menores = 0.00;
        for (int i = 0; i < n; i++){
            if (idade[i] < 16){
                menores = menores + 1;
            }
        }
        double porcentagem = menores/n * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem);

        for (int i = 0; i < n; i++){
            if (idade[i] < 16){
                System.out.println(name[i]);
            }
        }

        sc.close();
    }
}