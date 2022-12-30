package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ParameterisedTests2 {
    @Test
    void testIsEvenSuccessful() {
        Assertions.assertTrue(MathTools.isEven(2));
        Assertions.assertFalse(MathTools.isEven(1));
    }

    @ParameterizedTest // Need to add new dependency in pom
    @ValueSource(ints = {0, 2, 4, 6, 8, 10, 100, 1000}) // refer mutiple source options in infoworld
    void testIsEven(int number) {
        Assertions.assertTrue(MathTools.isEven(number));
    }

    @Disabled
    @ParameterizedTest
    @MethodSource("generateEvenNumbers") // if we want to use the output of method as source
    void testIsEvenRange(int number) {
        Assertions.assertTrue(MathTools.isEven(number));
    }

    static IntStream generateEvenNumbers() {
        return IntStream.iterate(0, i -> i + 2).limit(500);
    }

    @ParameterizedTest
    @MethodSource("generateEvenNumbersAsList") // if we want to use the List output of method as source
    void testIsEvenRangeList(int number) {
        Assertions.assertTrue(MathTools.isEven(number));
    }

    static List<Integer> generateEvenNumbersAsList() {
        return Collections.singletonList(12);
    }

}
