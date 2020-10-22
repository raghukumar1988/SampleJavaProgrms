package string;
import java.util.Scanner;

public class FindArmstrong {

	public static void main(String args[]) {
		Scanner inputNum = new Scanner(System.in);
		System.out.println("Enter the number to check armstrong");
		int inputNumber = inputNum.nextInt();
		int copyOfNumber = inputNumber;
		int noOfDigits = String.valueOf(inputNumber).length();
		int sum = 0;
		while (copyOfNumber != 0) {
			int lastDigit = copyOfNumber % 10;
			int lastDigitinPowerOfDigit = 1;
			for (int i = 0; i < noOfDigits; i++) {
				lastDigitinPowerOfDigit = lastDigitinPowerOfDigit * lastDigit;
			}
			sum = sum + lastDigitinPowerOfDigit;
			copyOfNumber = copyOfNumber / 10;
		}
		if (inputNumber == sum) {
			System.out.println("Number is armstrong");

		} else {
			System.out.println("Number is not armstrong");
		}
		inputNum.close();
	}

}