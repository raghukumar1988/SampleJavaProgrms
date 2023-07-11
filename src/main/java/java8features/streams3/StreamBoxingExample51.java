package java8features.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBoxingExample51 {
    public static void main(String[] args) {

        mapExampleWithForEach();
        mapExampleWithCollect();
        mapTOIntExampleWithoutBoxing();
        mapToIntExampleWithBoxing();
    }

    private static void mapToIntExampleWithBoxing() {
        List<Integer> numberList3 = Arrays.asList(3, 6, 9, 12, 15);

        List<Integer> doubledIntegerList = numberList3.stream()
                .mapToInt(num -> num * 2)
                .boxed() // will wrap to primitives to wrapper objects ; IntStream to Stream<Integer>
                .collect(Collectors.toList()); // comment above line and observe CTE; if we switch to map() we don't need boxed()
        System.out.println(doubledIntegerList);
    }

    private static void mapTOIntExampleWithoutBoxing() {
        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
        // Using Stream mapToInt(ToIntFunction mapper) and displaying the corresponding IntStream
        list.stream()
                //.mapToInt(numStr -> Integer.parseInt(numStr))
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);
    }

    private static void mapExampleWithCollect() {
        List<Integer> numberList2 = Arrays.asList(3, 6, 9, 12, 15);

        List<Integer> integers = numberList2.stream()
                .map(number -> number * 3)
                .collect(Collectors.toList());
        System.out.println(integers);
    }

    private static void mapExampleWithForEach() {
        //map method - returns a stream consisting of the results by applying the given function to the elements of this stream.
        List<Integer> numberList = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and displaying the corresponding new stream
        numberList.stream()
                .map(number -> number * 3)
                .forEach(System.out::println);
        System.out.println();
    }

}
