package java8features.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapExamples52 {
    public static void main(String[] args) {
        multiplyListElementsBy3AndPrint();
        convertToUppercaseAndPrint();
        getLengthOfStringsAndPrint();
        convertStringToIntegerAndPrint();
        convertStringWithNulltoIntegerAndPrint();
        convertStringWithNonNumerictoIntegerAndPrint();
        convertStringWithNonNumerictoIntegerAndPrintWithFlatMap();
    }

    // Output: 1 2 NumberFormatException 0 4
    private static void convertStringWithNonNumerictoIntegerAndPrintWithFlatMap() {
        Stream.of("1", "2", "A", "4")
                //.map(StreamMapExamples::parseStringValuesAsStream)
                .flatMap(StreamMapExamples52::parseStringValuesAsStream)
                .forEach(System.out::println);
    }

    private static Stream<Integer> parseStringValuesAsStream(String s) { // Utility Method
        int number = 0;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Unable to parse given string -->" + s);
            System.out.println("Exception Occured" + ex);
        }
        return Stream.of(number); // Observe here and method return type
    }
    // Output: 1 2 NumberFormatException 0 4
    private static void convertStringWithNonNumerictoIntegerAndPrint() {
        Stream.of("1", "2", "A", "4")
                .map(StreamMapExamples52::parseStringValues)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static Integer parseStringValues(String s) {  // Utility method
        int number = 0;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Unable to parse given string -->" + s);
            System.out.println("Exception Occured" + ex);
        }
        return number;
    }


    private static void convertStringWithNulltoIntegerAndPrint() {
        Stream.of("1", "2", null, "4")
                .filter(Objects::nonNull)
                .map(getAnInt())
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static Function<String, Integer> getAnInt() { // Utility method
        return Integer::parseInt;
    }

    private static void convertStringToIntegerAndPrint() {
        Stream.of("1", "2", "3", "4")
                .map(Integer::parseInt)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }

    private static void getLengthOfStringsAndPrint() {
        List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
        list.stream() // Stream of String
                .map(String::length) // Stream of Integer
                //.mapToInt(String::length) // Alternate way - can be used to limit only Int types
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

    private static void multiplyListElementsBy3AndPrint() {
        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15);
        list.stream()
                .map(num -> num * 3)
                .forEach(System.out::println);
        System.out.println("#####################################");
    }
}
