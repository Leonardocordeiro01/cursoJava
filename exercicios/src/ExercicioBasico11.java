import java.util.Scanner;

public class ExercicioBasico11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x, y;
        x = sc.nextDouble();
        y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("0rigem");
        } else if (x > 0.0 && y < 0.0) {
            System.out.println("Q4");
        }  else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        } else if (x == 0.0 ) {
            System.out.println("eixo x");
        } else if (y == 0.0 ) {
            System.out.println("eixo y");
        } else {
            System.out.println("Q1");
        }


        sc.close();
    }
}
