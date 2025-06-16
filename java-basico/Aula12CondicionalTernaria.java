import java.util.Scanner;

public class Aula12CondicionalTernaria {
    static public void main(String[] args) {
        // SINTAXE
        //(condicao) ? valor_se_verdadeiro : valor_se_falso;

        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println(desconto);
        sc.close();
    }
}
