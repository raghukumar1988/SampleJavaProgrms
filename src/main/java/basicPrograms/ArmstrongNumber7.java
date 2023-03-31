package basicPrograms;

public class ArmstrongNumber7 {
    public static void main(String[] args) {
        checkArmstrongNumber(153);
        checkArmstrongNumber(371);
        checkArmstrongNumber(9474);
        checkArmstrongNumber(54748);
        checkArmstrongNumber(407);
        checkArmstrongNumber(1674);
    }

    private static void checkArmstrongNumber(int number) {
        int copyNumber = number;
        int sum = 0;
        int noOfDigits = String.valueOf(number).length();

        while (copyNumber != 0) {
            int lastDigitToThePowerOfNoOfDigits = 1;
            int lastDigit = copyNumber % 10;
            for (int i = 0; i < noOfDigits; i++) {
                lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
            }
            sum = sum + lastDigitToThePowerOfNoOfDigits;
            copyNumber = copyNumber / 10;
        }
        if (number == sum) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is Not an Armstrong number");
        }
    }
}
   /* A number is called an Armstrong number
   if it is equal to sum of its digits each raised to the power of number of digits in it.
        For example: 153, 371, 407, 9474, 54748 are some Armstrong numbers.
        153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 */
// Refer - https://javaconceptoftheday.com/armstrong-number-in-java/