import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] alturas = new double[n];
        String[] genero = new String[n];

        for (int i = 0; i < n; i++){
            System.out.printf("Altura da %da pessoa: ", i+1);
            alturas[i] = sc.nextDouble();
            sc.nextLine();
            System.out.printf("Genero da %da pessoa: ", i+1);
            genero[i] = sc.nextLine();
        }

        double menor = alturas[0];
        double maior = alturas[0];
        double total = 0;
        int numero = 0;
        for (int i = 0; i < n; i++){
            if (menor > alturas[i]){
                menor = alturas[i];

            }
            if (maior < alturas[i]){
                maior = alturas[i];

            }
            if (genero[i].equals("M")){
                numero = numero + 1;
            }

            total = total + alturas[i];
        }

        double media = total/n;

        System.out.printf("Menor altura = %.2f %n", menor);
        System.out.printf("Maior altura = %.2f %n", maior);
        System.out.printf("Media das alturas das mulheres = %.2f %n", media);
        System.out.printf("Numero de Homens = %d", numero);

        sc.close();
    }
}