public class Main {
    public static void main(String[] args){

        // ---------- Tipo Primitivo ----------
        int a = 10;                  // variável tipo caixa (stack)
        int b = a;                   // b recebe uma CÓPIA do valor de a
        b = 20;                      // altera b, mas a continua sendo 10
        System.out.println("a = " + a); // saída: a = 10
        System.out.println("b = " + b); // saída: b = 20

        // ---------- Tipo Referência ----------
        Pessoa p1 = new Pessoa("João"); // objeto instanciado no heap
        Pessoa p2 = p1;                 // p2 aponta para o MESMO objeto de p1
        p2.nome = "Maria";              // altera o nome no objeto que ambos apontam
        System.out.println("p1.nome = " + p1.nome); // saída: Maria
        System.out.println("p2.nome = " + p2.nome); // saída: Maria

        // ---------- Null ----------
        Pessoa p3 = null;               // tipos referência aceitam null
        // int x = null;               // erro de compilação: tipos primitivos não aceitam null
    }
}

class Pessoa {
    String nome;

    Pessoa(String nome) {
        this.nome = nome;
    }
}