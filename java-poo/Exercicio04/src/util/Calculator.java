package util;

public class Calculator {

    public static final double valueDollar = 3.10;

    public static double calculator(double dollar){
        double IOF = (dollar * valueDollar) * 0.06;
        return (dollar * valueDollar) + IOF;
    }
}
