public class Aula6FuncoesMatematicas {
    public static void main(String[] args){

        double A, B;
        int C, x, y;
        x = 2;
        y = 3;

        A = Math.sqrt(x); // Variavel "a" recebe a raiz quadrada de x
        B = Math.pow(x, y); // Variavel b recebe o valor de x elevado a y
        C = Math.abs(x); // Variavel c recebe o valor absoluto de x

        double r = 3.0; // lembrando que quando o numero e double é sempre bom colocar o ".0"
        double s = 4.0;
        double t = -5.0;
        double D, E, F;

        D = Math.sqrt(r);
        E = Math.sqrt(s);
        F = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + r + " é igual a " + D);
        System.out.println("Raiz quadrada de " + s + " é igual a " + E);
        System.out.println("Raiz quadrada de 25 é igual a " + F);

        D = Math.pow(r, s);
        E = Math.pow(r, 2.0);
        F = Math.pow(5.0, 3.0);
        System.out.println(r + " elevado a " + s + " é " + D);
        System.out.println(x + " elevado ao quadrado é " + E);
        System.out.println("5 elevado a 3 é " + F);

        D = Math.abs(s);
        E = Math.abs(t);
        System.out.println("o valor inteiro de " + s + " é " + D);
        System.out.println("o valor inteiro de " + t + " é " + E);

        // INCLUINDO EM UMA EXPREÇÃO MAIOR

        double delta, b, a, c, x1, x2;
        a = 2;
        b = 4;
        c = 6;

        delta = Math.pow(b, 2.0) + 4*a*c;

        x1 =  (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 + a);

        System.out.println("o valor do x1 é: " + x1 + " e do x2 é: " + x2);
    }
}
