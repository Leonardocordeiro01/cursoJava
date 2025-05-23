import java.util.Scanner;

public class ExercicioBasico9 {
    static public void main(String[] args) {
        //Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
        //começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
        Scanner sc = new Scanner(System.in);

        int inicio, fim, total;
        inicio = sc.nextInt();
        fim = sc.nextInt();


        if(inicio < fim) {
            total = fim - inicio;
            System.out.println("o jogo durou "+ total + " horas");
        } else {
            total = 24 - inicio + fim;
            System.out.println("o jogo durou "+ total + " horas");
        }

        sc.close();
    }
}
