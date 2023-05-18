package java8features.streams3;

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
        Stream<Integer> intStream2 = Stream.of(1,2,3,4);
        //Integer[] intArray = intStream.toArray(Integer[]::new); // simplified with method reference
        //Integer[] intArray = intStream.toArray(value -> new Integer[value]); //simplified with Lambda
        Integer[] intArray = intStream2.toArray(new IntFunction<Integer[]>() { // legacy anonymous impl
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(intArray));

    }
}
