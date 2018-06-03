package ua.volkov;

public class DigitsUtil {

    public static int sumOfDigits(String number){
        int sum=0;
        for(char c: number.toCharArray()){
            sum+= Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
