package ua.volkov;

import ua.volkov.Factorial.Factorial;
import ua.volkov.Factorial.FactorialFactory;
import ua.volkov.Factorial.SmallFactorial;

public class Main {

    public static void main(String[] args) {
            String factorial=
                    FactorialFactory.factorialFactory(100)
                            .factorialInStringFormat();
            System.out.println(DigitsUtil.sumOfDigits(factorial));
    }
}
