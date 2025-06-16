import java.util.Scanner;

public class ExercicioBasico17For {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X, N, in, out;
        in = 0;
        out = 0;
        X = sc.nextInt();
        for ( int i = 0; i < X; i++){
            N = sc.nextInt();
            if (N >= 10 && N <= 20){
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("in: %d %n out: %d", in, out);
        sc.close();
    }
}
