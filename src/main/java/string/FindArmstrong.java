package string;
import java.util.Scanner;

public class FindArmstrong {

	/* Armstrong Number Examples:
	An Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.

		1: 1 ^1 = 1

		2: 2 ^1 = 2

		3: 3 ^1 = 3

		153: 1 ^3 + 5 ^3 + 3 ^3 = 1 + 125+ 27 = 153

		125: 1 ^3 + 2 ^3 + 5 ^3 = 1 + 8 + 125 = 134 (Not an Armstrong Number)

		1634: 1 ^4 + 6 ^4 + 3 ^4 + 4 ^4 = 1 + 1296 + 81 + 256 = 1643  */

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