package java8features.streams31;

import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.Stream;

public class StreamToArrayExample63 {
    public static void main(String[] args) {

        Stream<Integer> intStream = Stream.of(1,2,3,4);
        double[] numberArray = intStream
                .peek(System.out::println)// to debug
                .mapToDouble(Double::valueOf) // This line does nothing
                .peek(System.out::println) // to debug
                .toArray();
        System.out.println(Arrays.toString(numberArray));
        System.out.println();


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
