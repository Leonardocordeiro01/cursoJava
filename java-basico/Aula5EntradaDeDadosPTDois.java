import java.util.Scanner;

public class Aula5EntradaDeDadosPTDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;

        x = sc.nextInt();
        sc.nextLine(); //esse nextLine puro seve para consumir a quebra de linha que e adicionada quando damos enter no campo x;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("numero digitado: " + x);
        System.out.println("text 1: " + s1);
        System.out.println("texto 2: " + s2);
        System.out.println("texto 3: " + s3);

        sc.close();
    }
}
