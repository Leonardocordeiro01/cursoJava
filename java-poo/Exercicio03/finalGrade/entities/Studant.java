package entities;

public class Studant {

    public String name;
    public double grade;

    public double calculateGrade(double grade) {
        return this.grade += grade;
    }

    public void resultFinal() {
        if (grade >= 60){
            System.out.println("Pass");
        } else {
            System.out.println("Failed");
            double missing = 60 - grade;
            System.out.println("Missing "+ missing +" Points");
        }
    }
}
