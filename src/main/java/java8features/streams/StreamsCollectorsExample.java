package java8features.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollectorsExample {
    public static void main(String[] args) {
        //Collectors 1 - toList
        Stream<Integer> integerStream= Stream.of(12,13,14,15);
        List<Integer> streamtoList= integerStream.collect(Collectors.toList());
        streamtoList.forEach(System.out::println);

        //Collectors 2 - toMap
        Stream<Integer> integerStream2= Stream.of(12,13,14,15);
        Map<Integer,Integer> streamtomap= integerStream2.collect(Collectors.toMap(i->i, i->i+10));
        streamtomap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));

        //Collectors 3 - joining
        List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        // Collector with unmodifiable maps - introduced in Java 10
        // This is equal to immutable map as we don't have reference to underlying map
        // Refer -  https://howtodoinjava.com/java/collections/java-immutable-and-unmodifiable-maps/#2-unmodifiable-maps
        Stream<Integer> integerStream3= Stream.of(12,13,14,15);
        Map<Integer,Integer> streamToUnmodifiableMap= integerStream3.collect(Collectors.toUnmodifiableMap(i->i, i->i+10));
        streamToUnmodifiableMap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));


        // String to Uppercase and convert to List
        Stream<String> names = Stream.of("aBc", "d", "ef");
        //System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));
        System.out.println(names.map(String::toUpperCase).collect(Collectors.toList()));

        // String to Uppercase and convert to Map
        Stream<String> names1 = Stream.of("aBc", "d", "ef"); // we cannot use same stream twice, hence creating new
        System.out.println(names1.map(String::toUpperCase).collect(Collectors.toMap(i->i,i->i+"Suffix")));

        // Sorting 1 - Inbuilt comparator.reverseOrder()
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        // Sorting 2
        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

        // filter and count
        //long  count = strings.stream().filter(string->string.isEmpty()).count();
        long  count = strings.stream().filter(String::isEmpty).count();
        System.out.println("Empty Strings: " + count);

        // filter and count by length
        count = strings.stream().filter(string -> string.length() == 3).count();
        System.out.println("Strings of length 3: " + count);

        // filter and collect
        List<String> filtered = strings.stream().filter(string ->!string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        // distinct example
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream().map( i ->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares List: " + squaresList);
        System.out.println("List: " + numbers);

        //statistics collectors
        // -are used  to calculate all statistics when stream processing is being done.
        //IntSummaryStatistics stats = numbers.stream().mapToInt(s-> Integer.valueOf(s)).summaryStatistics();
        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::valueOf).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());

    }
}
