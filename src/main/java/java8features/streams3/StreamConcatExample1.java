package java8features.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatExample1 {
    public static void main(String[] args) {
        concatStreamsAndPrint();
        mergeMoreThan2Streams();

        /* Non-Terminal Operations
                filter()
                map()
                distinct()
                sorted()
                peek()

         Terminal Operations
                toArray()
                reduce()
                forEach()
                forEachOrdered()
                anyMatch()
                allMatch()
                noneMatch()
                collect()
                count()
                findAny()
                findFirst()
                min()
                max()
                sum()
                average()    */
    }

    private static void mergeMoreThan2Streams() {
        Stream<String> nameList1 = Stream.of("A","B","C");
        Stream<String> nameList2 = Stream.of("D","E","F");
        Stream<String> nameList3 = Stream.of("G","B","H");
        Stream<String> nameList4 = Stream.of("J","I","C");
        // Observe the mergedOutput return type carefully
        // prev example uses list don't get confused
        Stream<Stream<String>> mergedOutput = Stream.of(nameList1, nameList2, nameList3, nameList4);
        System.out.println("Merged output without flatmap..");
        mergedOutput.forEach(System.out::println); // Observe result carefully

        System.out.println("Merged output WITH flatmap..");
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
        /*Stream.of(nameList1.stream(),nameList2.stream())
                .forEach(System.out::println);*/

        // Observe below Reference types carefully
        Stream<String> concat = Stream.concat(nameList1.stream(), nameList2.stream()); // concat
        Stream<List<String>> listStream = Stream.of(nameList1, nameList2);
        Stream<Stream<String>> stream = Stream.of(nameList1.stream(), nameList2.stream()); // requires flatmap
        List<String> collect = Stream.of(nameList1.stream(), nameList2.stream())
                                        //.flatMap(str -> str) // Use below alternative
                                        .flatMap(Function.identity())
                                        //.forEach(System.out::println);
                                        .collect(Collectors.toList());
        collect.forEach(str -> System.out.println("Uses Of method = " + str));
    }
}
