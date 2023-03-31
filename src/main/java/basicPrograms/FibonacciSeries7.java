package basicPrograms;

public class FibonacciSeries7 {
    public static void main(String[] args) {
        getFibonacciWithNumberOf(20);
    }

    private static void getFibonacciWithNumberOf(int length) {
        int n1= 0;
        int n2= 1;
        int n3;

        System.out.print(n1+" "+n2);

        for (int i = 2; i < length; i++) {
            n3= n1+n2;
            System.out.print(" "+n3);
            n1= n2;
            n2=n3;

        }
    }
}
