import java.util.Scanner;

public class ExercicioBasico21For {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int N;
        double cubo, quadrado;
        N = sc.nextInt();

        for (int i = 1; i <=N ; i++){
            quadrado = Math.pow(i, 2);
            cubo = Math.pow(i, 3);
            System.out.println(quadrado +" "+ cubo);
        }

        sc.close();
    }
}
