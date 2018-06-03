package ua.volkov.Factorial;

import java.math.BigInteger;

public class BigFactorial implements Factorial<BigInteger> {
    int n;
    private BigInteger value;

    BigFactorial(int n){
        this.n = n;
    }

    @Override
    public BigInteger factorial() {
        long res = new SmallFactorial(20).factorial();
        value= BigInteger.valueOf(res);
        for(int i=21;i<=n;i++){
            value = value.multiply(BigInteger.valueOf(i));
        }

        return value;
    }

    @Override
    public String factorialInStringFormat() {
        return factorial().toString();
    }
}
