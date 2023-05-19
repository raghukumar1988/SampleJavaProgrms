package basicPrograms;

public class PerfectNumber5 {
    public static void main(String[] args) {
        checkIfPerfectNumber(6); // perfect number -> 1 + 2 + 3 = 6
        checkIfPerfectNumber(7); // not a perfect number
        checkIfPerfectNumber(28); // perfect number -> 1 + 2 + 4 + 7 + 14 = 28
        checkIfPerfectNumber(496); // perfect number
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
