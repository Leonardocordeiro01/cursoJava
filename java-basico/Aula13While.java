import java.util.Scanner;

public class Aula13While {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // recomendada quando nao sabemos a previamente a quantidade de repetiçao;
        // TRUE: executa e volta;
        // FALSE: pula fora;

        int x, soma;

        x = sc.nextInt();
        soma = 0;

        while (x != 0){
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);
        sc.close();
    }
}
