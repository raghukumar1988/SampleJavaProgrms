package basicPrograms;

public class FibonacciSeriesWithRecursion7 {
    static int n1 = 0, n2 = 1, n3 = 0;

    public static void main(String[] args) {
        int length = 20;
        System.out.print(n1 + " " + n2);
        printFibonacci(length - 2);
    }

    private static void printFibonacci(int length) {
        if (length > 0) {  // should not use while loop here
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            printFibonacci(length - 1);
        }
    }
}
