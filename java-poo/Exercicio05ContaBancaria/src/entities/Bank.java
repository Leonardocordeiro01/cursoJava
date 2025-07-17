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

    public Bank(int number,  String  person) {
        this.person = person;
        this.number = number;

    }

    public void newDeposit( double deposit ){
        this.deposit += deposit;
    }

    public void newWithdraw( double deposit ){
        this.deposit -= deposit ;
        this.deposit -= 5;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance %.2f%n: ",
                number,
                person,
                deposit);
    }
}
