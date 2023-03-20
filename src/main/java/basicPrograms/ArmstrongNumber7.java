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

// Refer - https://javaconceptoftheday.com/armstrong-number-in-java/