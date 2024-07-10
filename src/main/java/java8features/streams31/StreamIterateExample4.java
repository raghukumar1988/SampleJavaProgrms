package java8features.streams31;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateExample4 {
    public static void main(String[] args) {
        printNumbersUsingIterateMethod();
        printEvenNumbersUsingIterateMethod();
        printFirst10NumbersWhichAreDividedBy3();
        getListOfFirst10NumbersWhichAreDividedBy3();
    }


    private static void getListOfFirst10NumbersWhichAreDividedBy3() {
        System.out.println("Collecting the results in List....");
        List<Integer> numbersDivisibleTO3 = Stream.iterate(1, num -> num + 1)
                .filter(num -> num % 3 == 0)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(numbersDivisibleTO3);
    }

    private static void printFirst10NumbersWhichAreDividedBy3() {
        System.out.println("Print First 10 Numbers Which Are Divided By 3...");
        Stream.iterate(1,num->num+1)
                .filter(num->num%3==0)
                .limit(10)
                .forEach(System.out::println);

        /* Stream.iterate(3,num->num+3)  // Alternate of above.. Prints 3,6,9,12 etc
           Stream.iterate(3,num->num*3)  // Prints 3,9,27,etc
                //.filter(num->num%3==0)
                  .limit(10)
                  .forEach(System.out::println); */
    }

    private static void printEvenNumbersUsingIterateMethod() {
        System.out.println("Printing 10 even numbers using iterate method...");
        Stream.iterate(2,num->num+2)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void printNumbersUsingIterateMethod() {
        System.out.println("Printing number sequence with 10 using iterate method...");
        Stream.iterate(1,num->num+1)
                .limit(10)
                .forEach(System.out::println);
    }
}
