package java8features.streams;

import java.util.stream.Stream;

public class StreamFlatMapExample {
    public static void main(String[] args) {
        flatMapExampleWithStreamMerge();
    }

    private static void flatMapExampleWithStreamMerge() {
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
