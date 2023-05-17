package java8features.streams;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapExamples {
    public static void main(String[] args) {
        mutiplyListElementsBy3AndPrint();
        convertToUppercaseAndPrint();
        getLengthOfStringsAndPrint();
        convertStringtoIntegerAndPrint();
        convertStringWithNulltoIntegerAndPrint();
        convertStringWithNonNumerictoIntegerAndPrint();
    }

    private static void convertStringWithNonNumerictoIntegerAndPrint() {
        Stream.of("1", "2", "A", "4")
                .map(StreamMapExamples::parseStringValues)
                .forEach(System.out::println);
    }

    private static Stream<Integer> parseStringValues(String s) {
        int number = 0;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Unable to parse given string -->" + s);
            System.out.println("Exception Occured" + ex);
        }
        return Stream.of(number);
    }


    private static void convertStringWithNulltoIntegerAndPrint() {
        Stream.of("1", "2", null, "4")
                .filter(Objects::nonNull)
                .map(getAnInt())
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static Function<String, Integer> getAnInt() {
        return Integer::parseInt;
    }

    private static void convertStringtoIntegerAndPrint() {
        Stream.of("1", "2", "3", "4")
                .map(Integer::parseInt)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static void getLengthOfStringsAndPrint() {
        List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
        list.stream() // Stream of String
                .map(String::length) // Stream of Integer
                .forEach(System.out::println);
        System.out.println("#####################################");

    }

    private static void convertToUppercaseAndPrint() {
        List<String> list = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
        list.stream()
                //.map(str->str.toUpperCase())
                .map(String::toUpperCase)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static void mutiplyListElementsBy3AndPrint() {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        list.stream()
                .map(num -> num * 3)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }
}
