package java8features.streams3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCollectorsExample62 {
    public static void main(String[] args) {
        //Collectors 1 - toList
        Stream<Integer> integerStream = Stream.of(12, 13, 14, 15);
        List<Integer> streamtoList = integerStream.collect(Collectors.toList());
        System.out.println("Printing List with integers..");
        streamtoList.forEach(System.out::println);

        //Collectors 2 - toMap
        Stream<Integer> integerStream2 = Stream.of(12, 13, 14, 15);
        Map<Integer, Integer> streamtomap = integerStream2.collect(Collectors.toMap(i -> i, i -> i + 10));
        System.out.println("Stream of Integers collected as HashMap...");
        streamtomap.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

        // String to Uppercase and convert to Map
        Stream<String> names1 = Stream.of("aBc", "d", "ef"); // we cannot use same stream twice, hence creating new
        System.out.println("Stream of Strings collected to HashMap and applied uppercase using map()...");
        Map<String, String> stringMap = names1.map(String::toUpperCase)
                .collect(Collectors.toMap(i -> i, i -> i + "Suffix"));
        System.out.println(stringMap);

        // Collector with unmodifiable maps - introduced in Java 10
        // This is equal to Collections.immutable map as we don't have reference to underlying map
        // Refer -  https://howtodoinjava.com/java/collections/java-immutable-and-unmodifiable-maps/#2-unmodifiable-maps
        Stream<Integer> integerStream3 = Stream.of(12, 13, 14, 15);
        Map<Integer, Integer> streamToUnmodifiableMap = integerStream3.collect(Collectors.toUnmodifiableMap(i -> i, i -> i + 10));
        System.out.println("Stream of Integers to unmodifiable HashMap by adding 10 in value..");
        streamToUnmodifiableMap.forEach((k, v) -> System.out.println("Key = " + k + ", Value = " + v));

        Map<String, Integer> sourceMap = getStubbedSourceMap(); // interesting example
        System.out.println("Inverting(interchanging) key and values in Hashmap ..");
        sourceMap.entrySet()
                .stream()
                // inverting key to Value
                //.collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey)) // This line will throw RTE
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (oldValue, newValue) -> oldValue)) //
                .forEach((k, v) -> System.out.println(k + " Inverted Map " + v));

        /* In above method, the last argument to Collectors.toMap() is a mapping function.
        Using this, we can customize which key should be added in case there are duplicates.
                In the above example, we retain the first value as key if the source map contains duplicate values.
        However, we can retain only one key if the values repeat. */

        // Below method collects in custom LinkedHashMap
        Map<String, Integer> sourceMap1 = getStubbedSourceMap();
        System.out.println("Collecting entrySet from Hashmap and sorting by value then inverting and then collecting as LinkedHashMap..");
        LinkedHashMap<Integer, String> invertedMap = sourceMap1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
       /* collects in customised LinkedHashmap which maintains insertion order
                Observe carefully the reference type*/


        //Collectors 3 - joining
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        String mergedString = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));
        System.out.println("Merging List of String by Comma..");
        System.out.println("Merged String: " + mergedString);

        // String to Uppercase and convert to List
        Stream<String> names = Stream.of("aBc", "d", "ef");
        //System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));
        System.out.println("Converting Stream of String to uppercase and collect as ArrayList..");
        System.out.println(names.map(String::toUpperCase).collect(Collectors.toList()));

        // collect as custom LinkedList
        // Observe toCollection instead of toList method
        Stream<String> names22 = Stream.of("aBc", "d", "ef");
        System.out.println("Converting Stream of String to uppercase and collect as custom LinkedList..");
        LinkedList<String> collectAsLinkedList = names22.map(String::toUpperCase).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("Collected as Linked List.." + collectAsLinkedList);

        // Sorting 1 - Inbuilt Comparator.reverseOrder()
        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        System.out.println("Sorting Stream of Strings in reverse and collect as ArrayList..");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]

        // Sorting 2
        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        System.out.println("Sorting Stream of Strings in natural order and collect as ArrayList..");
        List<String> naturalSorted = names3.sorted()
                .collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

        // filter and collect
        List<String> filtered = strings.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);

        // distinct example
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = numbers.stream()
                .map(i -> i * i)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Applying map() and distinct() to List and collecting as List..");
        System.out.println("Squares List: " + squaresList);
        System.out.println("List: " + numbers);

        // filter and count
        //long  count = strings.stream().filter(string->string.isEmpty()).count();
        long count = strings.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Finding Empty Strings using count() : " + count);

        // filter and count by length
        count = strings.stream()
                .filter(string -> string.length() == 3)
                .count();
        System.out.println("Finding Strings with length 3 using count() : " + count);

        //statistics collectors are used  to calculate all statistics when stream processing is being done.
        //IntSummaryStatistics stats = numbers.stream().mapToInt(s-> Integer.valueOf(s)).summaryStatistics();
        IntSummaryStatistics stats = numbers.stream()
                .mapToInt(Integer::valueOf)
                .summaryStatistics();
        System.out.println("Print summaryStatistics for Int Stream.....");
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());


    }

    private static Map<String, Integer> getStubbedSourceMap() {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("ankit", 1200);
        map1.put("bhavna", 1200);
        map1.put("james", 1200);
        map1.put("micael", 1000);
        map1.put("tom", 1300);
        map1.put("daniel", 1300);
        return map1;
    }
}
