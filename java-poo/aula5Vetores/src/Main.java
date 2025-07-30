import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0 ; i < n ; i++) {
            vect[i] = sc.nextDouble();
        }

        double som = 0.00;
        for (int i = 0; i < n ; i++){
            som += vect[i];
        }

        double avg = som / n;
        System.out.printf("Average Height: %.2f%n", avg);

        sc.close();
    }
}