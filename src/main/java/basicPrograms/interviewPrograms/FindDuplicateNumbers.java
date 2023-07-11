package basicPrograms.interviewPrograms;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        /*   int[] intArray= {12,23,23,44,67,34,78,22,11,34};
             IntStream intStream = Arrays.stream(intArray);      */

        List<Integer> integerList = Arrays.asList(12, 23, 23, 44, 67, 34, 78, 22, 11, 34);
        method1(integerList); // This is performant as it has one loop
        method2(integerList);

    }

    private static void method2(List<Integer> integerList) {
        Map<Integer, Long> collectedMap = integerList.stream()
                //.collect(Collectors.groupingBy(num -> num, Collectors.counting())); // NOTE this
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collectedMap.forEach((k,v) -> {
            if(v>1){
                System.out.println("Duplicate number =" + k);
            }
        });
    }

    private static void method1(List<Integer> integerList) {
        Set<Integer> uniqueNumbers= new HashSet<>();
        List<Integer> duplicateList = integerList.stream()
                .filter(num -> !uniqueNumbers.add(num))
                .collect(Collectors.toList());

        //duplicateList.forEach(str-> System.out.println("duplicate value  = " + str));
        System.out.println("Duplicate values are "+ duplicateList);
    }
}
