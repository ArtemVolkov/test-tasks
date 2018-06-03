package ua.volkov.Factorial;

public class SmallFactorial implements Factorial<Long>{

    private int n;
    @Override
    public Long factorial() {
        return fact(this.n);
    }

    @Override
    public String factorialInStringFormat() {
        return factorial().toString();
    }

    private Long fact(int n){
        if(n == 0 || n == 1) return Long.valueOf(1);

        return n * fact(n-1);
    }

     SmallFactorial(int n){
        this.n=n;
     }


}
