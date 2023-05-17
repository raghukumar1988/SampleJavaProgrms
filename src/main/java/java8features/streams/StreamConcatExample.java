package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcatExample {
    public static void main(String[] args) {
        concatStreamsAndPrint();
        mergeMoreThan2Streams();
    }

    private static void mergeMoreThan2Streams() {
        Stream<String> nameList1 = Stream.of("A","B","C");
        Stream<String> nameList2 = Stream.of("D","E","F");
        Stream<String> nameList3 = Stream.of("G","B","H");
        Stream<String> nameList4 = Stream.of("J","I","C");
        Stream<Stream<String>> mergedOutput = Stream.of(nameList1, nameList2, nameList3, nameList4);
        mergedOutput.forEach(System.out::println);
        Stream.of(nameList1, nameList2, nameList3, nameList4)
                        .flatMap(i->i)
                                .forEach(System.out::println);
    }

    private static void concatStreamsAndPrint() {
        List<String> nameList1 =  Arrays.asList("A","B","C");
        //Stream<String> nameList1 = Stream.of("A","B","C");
        List<String> nameList2 =  Arrays.asList("D","E","F");
        Stream.concat(nameList1.stream(),nameList2.stream())
                .forEach(System.out::println);
    }
}
