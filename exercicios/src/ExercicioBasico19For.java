import java.util.Scanner;

public class ExercicioBasico19For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N, X;
        N = sc.nextInt();
        X = 1;
        for (int i = 1; i <=N ; i++){
            X = X * i;
        }
        System.out.println(X);
    }
}
