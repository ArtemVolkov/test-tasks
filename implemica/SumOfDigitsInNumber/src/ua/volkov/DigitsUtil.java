package ua.volkov;

public class DigitsUtil {

    /**
     * returns sum of the digits in number
     *
     * @param number number in string format
     * @return sum of the digits
     */
    public static int sumOfDigits(String number){
        int sum=0;
        for(char c: number.toCharArray()){
            sum+= Integer.parseInt(String.valueOf(c));
        }
        return sum;
    }
}
