import java.util.Scanner;

public class Aula9EstruturasCondicionais {
     public static void main(String[] args){
        // if e else | se e se nao

        // condicional simples

        int x = 12;

       if (x >= 5 && x < 12) {
           System.out.println("bom dia");
       };
        if (x >= 12 && x < 18) {
            System.out.println("boa tarde");
        };
        if (x >= 18 && x < 5) {
            System.out.println("boa noite");
        }

        //condicional composta
        Scanner sc = new Scanner(System.in);
        int hora;
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("bom dia");
        } else if (hora < 18 && hora >= 12) {
            System.out.println("boa tarde");
        } else {
            System.out.println("boa noite");
        }
        sc.close();
    }
}
