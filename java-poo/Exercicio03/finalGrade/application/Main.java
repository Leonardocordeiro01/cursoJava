package application;

import entities.Studant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Studant studant;
        studant = new Studant();
        studant.name = sc.nextLine();
        studant.grade = sc.nextDouble();
        double grade = 0;
        grade = studant.calculateGrade(grade);
        studant.grade = sc.nextDouble();
        grade = studant.calculateGrade(grade);
        studant.grade = sc.nextDouble();
        grade = studant.calculateGrade(grade);
        System.out.println("Final grade = "+ grade);

        studant.resultFinal();

        sc.close();
    }
}