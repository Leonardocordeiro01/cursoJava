import java.util.Scanner;

public class ExercicioBasico7 {
    static public void main(String[] args){

        //Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();

        if (x % 2 == 0 ){
            System.out.println("esse numero é par");
        } else {
        System.out.println("esse numero é impar");
        }

        sc.close();
    }
}
