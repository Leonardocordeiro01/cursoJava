import java.util.Scanner;

public class ExercicioBasico14While {
    static public void main(String[] args){
        //Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
        //cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
        //menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        Scanner sc = new Scanner(System.in);
        int x , y;
        x = sc.nextInt();
        y = sc.nextInt();

        while ( x != 0 && y != 0) { // aqui usamos o "e" no lugar do "ou" pelo retorno, nao pela logica da palavra, no caso se x ou y for 0 ele vai retornar false e a estrutura vai finalizar
            if ( x > 0 && y > 0 ) {
                System.out.println("primeiro");
            } else if ( x > 0 && y < 0 ) {
                System.out.println("quarto");
            } else if ( x < 0 && y < 0 ) {
                System.out.println("terceiro");
            } else {
                System.out.println("segundo");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        };

        sc.close();
    }
}
