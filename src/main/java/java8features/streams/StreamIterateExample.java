package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIterateExample {
    public static void main(String[] args) {
        printNumbersUsingIterateMethod();
        printEvenNumbersUsingIterateMethod();
        printFirst10NumbersWhichAreDividedBy3();
        getListofFirst10NumbersWhichAreDividedBy3();
    }

    private static void getListofFirst10NumbersWhichAreDividedBy3() {
        List<Integer> numbersDivisableTO3 = Stream.iterate(1, num -> num + 1)
                .filter(num -> num % 3 == 0)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(numbersDivisableTO3);
    }

    private static void printFirst10NumbersWhichAreDividedBy3() {
        Stream.iterate(1,num->num+1)
                .filter(num->num%3==0)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void printEvenNumbersUsingIterateMethod() {
        Stream.iterate(2,num->num+2)
                .limit(10)
                .forEach(System.out::println);
    }

    private static void printNumbersUsingIterateMethod() {
        Stream.iterate(1,num->num+1)
                .limit(10)
                .forEach(System.out::println);
    }
}
