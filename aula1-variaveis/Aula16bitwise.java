public class Aula16bitwise {
    static public void main(String[] args){
        // & - "E" bit a bit
        // | - "OU" bit a bit
        // ^ - "OU-exclusivo" bit a bit

        // Tabela verdade - Operador E (AND)
        // C1   | C2   | C1 E C2
        // F    | F    | F
        // F    | V    | F
        // V    | F    | F
        // V    | V    | V

        // Tabela verdade - Operador OU (OR)
        // C1   | C2   | C1 OU C2
        // F    | F    | F
        // F    | V    | V
        // V    | F    | V
        // V    | V    | V

        // Tabela verdade - Operador XOR (OU exclusivo)
        // C1   | C2   | C1 XOR C2
        // F    | F    | F
        // F    | V    | V
        // V    | F    | V
        // V    | V    | F

        // Operações Bit a Bit entre os números 89 e 60

        // 89 em binário: 0101 1001
        // 60 em binário: 0011 1100

        // Operação AND (&)
        // 0101 1001
        // 0011 1100
        // ---------
        // 0001 1000 => 24

        // Operação OR (|)
        // 0101 1001
        // 0011 1100
        // ---------
        // 0111 1101 => 125

        // Operação XOR (^)
        // 0101 1001
        // 0011 1100
        // ---------
        // 0110 0101 => 101

        int n1 =  89;
        int n2 = 60;

        System.out.println(n1 & n2);
        System.out.println(n1 | n2);
        System.out.println(n1 ^ n2);

    }
}
