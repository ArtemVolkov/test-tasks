package ua.volkov.Factorial;

import java.math.BigInteger;

public class FactorialFactory  {

    /**
     * Returns better factorial class
     * @param n number
     * @return if n<21 : SmallFactorial(returns Long) else : BigFatorial(returns BigInteger)
     */
    public static Factorial factorialFactory(int n){

        if(n<21) return new SmallFactorial(n);
        else  return new BigFactorial(n);
    }
}
