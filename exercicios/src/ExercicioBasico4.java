import java.util.Scanner;
import java.util.Locale;

public class ExercicioBasico4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double hoursW, salary, TotalSalary;
        int numberF;

        System.out.println("Employee number:");
        numberF = sc.nextInt();
        System.out.println("Hours worked:");
        hoursW = sc.nextDouble();
        System.out.println("hourly salary:");
        salary = sc.nextDouble();

        TotalSalary = hoursW * salary;

        System.out.printf("Employee number: %d %n Total salary: %.2f ", numberF, TotalSalary);

        sc.close();
    }
}
