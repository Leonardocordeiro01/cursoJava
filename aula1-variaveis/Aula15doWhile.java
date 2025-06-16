import java.util.Scanner;

public class Aula15doWhile {
    static public void main(String[] args){
        //faça enquanto
        //true: volta
        //false: pula fora

        Scanner sc = new Scanner(System.in);
        double C, F;
        char resp;

        do {
            System.out.println("Digite a temperatura em celsius");
            C = sc.nextDouble();
            F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Temperatura em Fahrenheit: %.1f%n", F);
            System.out.println("Deseja repetir (s/n):");
            resp = sc.next().charAt(0);
        } while (resp != 'n');


        sc.close();
    }
}
