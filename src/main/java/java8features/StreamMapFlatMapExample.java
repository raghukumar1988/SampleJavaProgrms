package java8features;

import java.util.Arrays;
import java.util.List;

public class StreamMapFlatMapExample {
    public static void main(String[] args) {

        // maptoInt Example
        List<String> list = Arrays.asList("3", "6", "8", "14", "15");
        // Using Stream mapToInt(ToIntFunction mapper) and displaying the corresponding IntStream
        //list.stream().mapToInt(num -> Integer.parseInt(num))
        list.stream()
                .mapToInt(Integer::parseInt)
                .filter(num -> num % 3 == 0)
                .forEach(System.out::println);

        //map method - returns a stream consisting of the results of applying the given function to the elements of this stream.
        List<Integer> list2 = Arrays.asList(3, 6, 9, 12, 15);

        // Using Stream map(Function mapper) and displaying the corresponding new stream
        list2.stream()
                .map(number -> number * 3)
                .forEach(System.out::println);

    }
}
