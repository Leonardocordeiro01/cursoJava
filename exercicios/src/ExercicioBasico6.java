import java.util.Scanner;
import java.util.Locale;

public class ExercicioBasico6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//        mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//                b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//                e) a área do retângulo que tem lados A e B.

        double A, B, C, ATriangulo, ACirculo, ATrapezio, AQuadrado, ARetangulo ;
        System.out.println("Valor de entrada A: ");
        A = sc.nextDouble();
        System.out.println("Valor de entrada B: ");
        B = sc.nextDouble();
        System.out.println("Valor de entrada C: ");
        C = sc.nextDouble();

        ATriangulo = (A * C)/2;
        System.out.println("Area do tringulo: " + ATriangulo);
        ACirculo = 3.14*Math.pow(C, 2.0);
        System.out.println("Area do circulo: " + ACirculo);
        ATrapezio = (A + B)*C/2;
        System.out.println("Area do trapezio: " + ATrapezio);
        AQuadrado = Math.pow(B, 2.0);
        System.out.println("Area do quadrado: " + AQuadrado);
        ARetangulo = A*B;
        System.out.println("Area do retangulo: " + ARetangulo);

        sc.close();
    }
}
