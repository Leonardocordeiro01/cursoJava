import java.util.Scanner;

public class ExercicioBasico12 {
    public static void main(String[] args) {
        //Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
        //mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
        //Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
        //salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
        //de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
        //duas casas decimais.

        //TABELA
        //RENDA                IMPOSTO DE RENDA
        //0.00 / 2000              ISENTO
        //2000.01 / 3000              8%
        //3000.01 / 4500.00           18%
        //ACIMA DE 4500               28%

        Scanner sc = new Scanner(System.in);

        double salario, imposto;
        salario = sc.nextDouble();

        if ( salario <= 2000.00 ) {
            imposto = 0.0;
        } else if ( salario <= 3000.00 ) {
            imposto = ( salario - 2000.00) * 0.08;
        } else if ( salario <= 4500.0 ) {
            imposto = (salario - 3000.0) *0.18 + 1000 * 0.08;
        } else {
            imposto = (salario - 4500.0 ) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
        }

        if (imposto == 0.0 ){
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n ", imposto);
        }


        sc.close();
    }
}
