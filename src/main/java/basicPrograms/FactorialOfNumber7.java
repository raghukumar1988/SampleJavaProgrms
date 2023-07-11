package basicPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfNumber7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number to find factorial..");
        int number = scanner.nextInt();
        factorialUsingInt(number);
        factorialUsingBigInt(number);
    }

    private static void factorialUsingBigInt(int number) {
        BigInteger result= BigInteger.ONE;
        for (int i = 1; i <=number ; i++) {
            result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Using Big Integer --- "+ result);
    }

    private static void factorialUsingInt(int number) {
        int result=1;
        for (int i = 1; i <=number; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}
