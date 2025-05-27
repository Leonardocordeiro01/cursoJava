import java.util.Scanner;

public class ExercicioBasico15While {
    static public void main(String[] args){
        //Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
        //um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
        //4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
        //que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
        //mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
        //exemplo.

        Scanner sc = new Scanner(System.in);

        int a, g, d;
        int x = sc.nextInt();
        a = 0;
        g = 0;
        d = 0;
        while (x != 4) {
            if ( x == 1) {
                a += 1;
            } else if ( x == 2) {
                g += 1;
            } else if ( x == 3 ) {
                d += 1;
            } else if ( x == 4 ) {
                System.out.println("muito obrigado");
            } else {
                System.out.println("informe um valor valido");
            }
            x = sc.nextInt();
        }
        System.out.println("Alcool: " + a);
        System.out.println("Gasolina: " + g);
        System.out.println("Diesel: " + d);

        sc.close();
    }
}
