public class Aula8ExprecoesLogicas {
    public static void main(String[] args) {
        int x;
        x = 5;

        // && e todas as condições devem ser verdadeiras
        System.out.println(x < 20 && x == 10); //false
        System.out.println(x > 0 && x != 3); //true

        // || ou apenas uma dessas condições deve ser verdadeira
        System.out.println(x == 10 || x <= 20); // true
        System.out.println(x >= 0 || x != 3); // true

        // ! não  inverte as condições
        System.out.println(!(x == 10)); //true
        System.out.println(!(x >= 2)); //false
    }
}
