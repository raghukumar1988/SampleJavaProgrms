package java8features.streams;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamToArrayExample {
    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.of(1,2,3,4);
        int[] numberArray = intStream
                .peek(System.out::println)// to debug
                .mapToInt(Integer::valueOf) // This line does nothing
                .peek(System.out::println) // to debug
                .toArray();
        System.out.println(Arrays.toString(numberArray));


        // for difference check the javadoc; we can pass desired type as argument
        //Integer[] intArray = intStream.toArray(Integer[]::new); // simplified version of below
        Stream<Integer> intStream2 = Stream.of(1,2,3,4);
        Integer[] intArray = intStream2.toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });

    }
}
