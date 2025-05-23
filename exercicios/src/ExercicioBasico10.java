import java.util.Scanner;

public class ExercicioBasico10 {
    static public void main(String[] args){
        //codigo   especificação   preço
        //1        xsalada          4,00
        //2        xbacon           4,50
        //3        xburguer         5,00
        //4        xtudo            2,00
        //5        xfrango          1,50

        Scanner sc = new Scanner(System.in);
        double XS, XBA, XBU, XT, XF, total;
        XS = 4.00;
        XBA = 4.50;
        XBU = 5.00;
        XT = 2.00;
        XF = 1.50;

        int pedido, quantidade;
        pedido = sc.nextInt();
        quantidade = sc.nextInt();

        if(pedido == 1){
            total = XS*quantidade;
            System.out.println("total: " + total);
        } else if(pedido == 2){
            total = XBA*quantidade;
            System.out.println("total: " + total);
        } else if(pedido == 3){
            total = XBU*quantidade;
            System.out.println("total: " + total);
        } else if(pedido == 4){
            total = XT*quantidade;
            System.out.println("total: " + total);
        } else if(pedido == 5){
            total = XF*quantidade;
            System.out.println("total: " + total);
        };

        sc.close();
    }
}
