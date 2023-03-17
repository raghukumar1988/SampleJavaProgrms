package basicPrograms;

public class PerfectNumber5 {
    public static void main(String[] args) {
        checkIfPerfectNumber(6);
    }

    private static void checkIfPerfectNumber(int num) {
        boolean isPerfectNumber = false;
        int sumofDivisors = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sumofDivisors += i;
            }
        }
        if (sumofDivisors == num) {
            isPerfectNumber = true;
        }
        System.out.println(isPerfectNumber);
    }
}
