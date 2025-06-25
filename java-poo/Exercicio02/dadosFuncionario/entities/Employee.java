package entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double perc){
        double salaryUpdate = netSalary();
        this.grossSalary = (perc/100) * grossSalary ;
        this.grossSalary += salaryUpdate;
    }

    public String toString() {
        return "update data: "
                + name
                + ", $ "
                + grossSalary;
    }
}
