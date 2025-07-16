package entities;

public class Bank {

    private final int number;
    private String  person;
    private double deposit;


    public Bank(int number,  String  person, double deposit ) {
        this.deposit = deposit;
        this.person = person;
        this.number = number;

    }

    public double newDeposit( double deposit ){
        return this.deposit += deposit;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance %.2f%n: ",
                number,
                person,
                deposit);
    }
}
