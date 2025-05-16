import java.util.Scanner;

public class ExercicioBasico1 {
    public static void main(String[] args) {
        // EXRCICIOS SIMPLES PARA PEGAR A SINTAXE E GRAVAR COISAS BASICAS

        Scanner sc = new Scanner(System.in);

        int x, y, resultado;

        System.out.println("Digite o primeiro valor;");
        x = sc.nextInt();
        System.out.println("Digite o segundo valor;");
        y = sc.nextInt();
        resultado = x + y;

        System.out.println(x + " somado com " + y + " é igual a " + resultado);


        sc.close();
    }
}
