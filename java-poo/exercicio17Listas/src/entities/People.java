package entities;

public class People {
    private String name;
    private Integer id;
    private Double salary;

    public People () {

    }

    public People(String name, Integer id, Double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String nome) {
        this.name = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
