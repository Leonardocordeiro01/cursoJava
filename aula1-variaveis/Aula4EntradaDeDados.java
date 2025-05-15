import java.util.Scanner;

public class Aula4EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        char a;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble(); // caso queira colocar o numero decimal com . e nao , tera que fazer o import do locale
        a = sc.next().charAt(0); //pegara apenas a primeira letra, e o zero é o seu indice

        System.out.printf("Seu nome: %s %n", x);
        System.out.println("Sua idade: " + y);
        System.out.printf("Sua renda mensal: %.2f %n", z);
        System.out.println("Sexo: " + a);
        sc.close();
    }
}
