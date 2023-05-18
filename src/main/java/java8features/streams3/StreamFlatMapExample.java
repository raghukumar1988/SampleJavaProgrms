package java8features.streams3;

import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        flatMapExampleWithStreamMerge();
    }

    private static void flatMapExampleWithStreamMerge() {
        mergeStreamsUsingFlatMap();
        convertStringtoIntegerStreamAndPrintUsingFlatMap();
    }

    private static void convertStringtoIntegerStreamAndPrintUsingFlatMap() {
        Stream.of("1", "2", "A", "4")
                //.map(StreamMapExamples::parseStringValuesAsStream)
                .flatMap(StreamFlatMapExample::parseStringValuesAsStream)
                .forEach(System.out::println);
    }

    private static Stream<Integer> parseStringValuesAsStream(String s) {
        int number = 0;
        try {
            number = Integer.parseInt(s);
        } catch (NumberFormatException ex) {
            System.out.println("Unable to parse given string -->" + s);
            System.out.println("Exception Occured" + ex);
        }
        return Stream.of(number);
    }

    private static void mergeStreamsUsingFlatMap() {
        Stream<String> nameList1 = Stream.of("A", "B", "C");
        Stream<String> nameList2 = Stream.of("D", "E", "F");
        Stream<String> nameList3 = Stream.of("G", "B", "H");
        Stream<String> nameList4 = Stream.of("J", "I", "C");
        Stream<Stream<String>> mergedOutput = Stream.of(nameList1, nameList2, nameList3, nameList4);
        mergedOutput.forEach(System.out::println); // non readable
        Stream.of(nameList1, nameList2, nameList3, nameList4)
                .flatMap(i -> i)
                .forEach(System.out::println);
    }
}
