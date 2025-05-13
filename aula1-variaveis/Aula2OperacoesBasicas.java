import java.util.Locale; //importamos uma biblioteca

public class Aula2OperacoesBasicas {
    public static void main(String[] args) {
        System.out.println("aqui temos quebra de linha");
        System.out.println("observamos que essa frase esta localizada na lina de baixo");

        System.out.print("aqui não teremos quebra de linha ");
        System.out.print("aqui esta na mesma linha ");

        System.out.println(".");

        int y = 32;
        System.out.print(y); //aqui mostramos o valor da variavel

        System.out.println(".");

        double x = 23.65327;
        System.out.printf("%.2f%n", x); // aqui exibimos o numero e controlamos sua forma
        //a quantidade de numeros depois da virgula e definido pelo numero depois do ponto



        System.out.println("RESULTADO = " + y + " METROS");
        System.out.printf("RESULTADO = %.2f metros%n", x);

        //MARCADORES
        //%f = ponto flutuante
        //%d = inteiro
        //%s = texto
        //%n = quebra de linha

        String nome = "Maria";
        int idade = 31;
        double renda = 4500.58499;
        System.out.printf("%s tem %d e recebe %.2f todo mes.%n", nome, idade, renda);

        System.out.println(".");
        System.out.println(".");
        System.out.println("EXERCICIO");
        System.out.println(".");
        System.out.println(".");

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("products:");
        System.out.printf("%s, which price is $ %.2f %n", product1, price1);
        System.out.printf("%s, which price is $ %.2f %n", product2, price2);
        System.out.printf("Record: %d yers old, code %d an gender: %s %n", age, code, gender);
        System.out.printf("Meuse with eight decimal place: %f %n", measure);
        System.out.printf("Rouded (three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US); // aqui definimos o modo de escrita para o americano
        // ao inves de virgula em decimais utilizara o ponto
        System.out.printf("US decimal point: %.3f", measure);
    }
}
