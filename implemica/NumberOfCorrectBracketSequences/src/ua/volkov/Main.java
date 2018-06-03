package ua.volkov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CorrectBracket cb = new CorrectBracket(Main.inputValue());
        System.out.println(cb.numberOfCorrecrBrSequences());
    }

    /**
     * asks user to input the value
     * @return inputed value
     */
    public static int inputValue(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        return n;
    }
}
