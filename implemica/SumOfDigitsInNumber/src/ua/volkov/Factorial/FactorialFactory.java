package ua.volkov.Factorial;

import java.math.BigInteger;

public class FactorialFactory  {

    public static Factorial factorialFactory(int n){

        if(n<21) return new SmallFactorial(n);
        else  return new BigFactorial(n);
    }
}
