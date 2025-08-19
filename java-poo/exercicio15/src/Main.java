import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        double[] primeiraNota = new double[n];
        double[] segundaNota = new double[n];

        for (int i=0; i < n; i++){
            sc.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %do aluno: %n", i+1);
            nome[i] = sc.nextLine();
            primeiraNota[i] = sc.nextDouble();
            segundaNota[i] = sc.nextDouble();
        }

        double[] medias = new double[n];
        System.out.println("Alunos aprovados: ");
        for (int i=0; i < n; i++){
            medias[i] = (primeiraNota[i] + segundaNota[i]) / 2;
            System.out.println(medias[i]);
            if (medias[i] >= 6.0){
                System.out.println(nome[i]);
            }
        }

        sc.close();
    }
}