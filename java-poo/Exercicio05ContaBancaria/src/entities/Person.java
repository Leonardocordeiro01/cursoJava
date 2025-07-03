package entities;

public class Person {

    private String person;
    private int number;

    public Person(String person, int number) {
        this.person = person;
        this.number = number;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
