package basicPrograms;

public class SumOfAllDigits {
    public static void main(String[] args) {
        sumOfAllDigits(47862);
        sumOfAllDigits(416872);
        sumOfAllDigits(5674283);
        sumOfAllDigits(475496215);
        // Need to check why this is not working
        System.out.println("Sum of digits in number is " +sumOfAllDigitsUsingRecursiveMethod(47862,0));
        System.out.println("Sum of digits in number is " +sumOfAllDigitsUsingRecursiveMethod(416872,0));
        System.out.println("Sum of digits in number is " +sumOfAllDigitsUsingRecursiveMethod(5674283,0));
        System.out.println("Sum of digits in number is " +sumOfAllDigitsUsingRecursiveMethod(475496215,0));
    }

    private static void sumOfAllDigits(int number) {
        int copyOfNumber = number;
        int sum = 0;
        while(copyOfNumber!=0){
            //Getting last digit of the input number
            int lastDigit= copyOfNumber%10;
            //Adding last digit to sum
            sum= sum+lastDigit;
            //Removing last digit from the input number
            copyOfNumber= copyOfNumber/10;
        }
        System.out.println("Sum of digits in number is "+sum);
    }

    private static Integer sumOfAllDigitsUsingRecursiveMethod(int number,int sum) {
        if(number==0){
            return sum;
        }else{
            int lastDigit= number%10;
            sum= sum+lastDigit;
            number= number/10;
            sumOfAllDigitsUsingRecursiveMethod(number,sum);
        }

        return sum;

    }
}
