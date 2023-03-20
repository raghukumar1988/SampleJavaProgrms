package basicPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesinArray7 {
    public static void main(String[] args) {
        int[] inputArray = new int[]{111, 333, 555, 777, 333, 444, 555};
        System.out.println("======Duplicates Using Brute Force======");

        findDuplicatesUsingBruteForce(inputArray);

        System.out.println("======Duplicates Using Sorting======");
        findDuplicatesUsingSorting(inputArray);

        System.out.println("======Duplicates Using HashSet======");
        findDuplicatesUsingHashSet(inputArray);

        System.out.println("======Duplicates Using HashMap======");
        findDuplicatesUsingHashMap(inputArray);

        System.out.println("======Duplicates Using Java 8 Streams======");
        findDuplicatesUsingJava8(inputArray);
    }

    private static void findDuplicatesUsingJava8(int[] inputArray) {
        Set<Integer> uniQueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = Arrays.stream(inputArray)
                .filter(i -> !uniQueNumbers.add(i))
                .boxed()// refer -> https://howtodoinjava.com/java8/java8-boxed-intstream/
                .collect(Collectors.toSet());
        for (Integer duplicateNumber : duplicateNumbers) {
            System.out.println("Duplicate element is " + duplicateNumber);
        }
    }

    private static void findDuplicatesUsingHashMap(int[] inputArray) {
        Map<Integer, Integer> numberMap = new HashMap<>();
        for (Integer number : inputArray) {
            if (numberMap.containsKey(number)) {
                numberMap.put(number, numberMap.get(number) + 1);
            } else {
                numberMap.put(number, 1);
            }
        }
        Set<Map.Entry<Integer, Integer>> entrySet = numberMap.entrySet();
        for (Map.Entry<Integer, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate element is " + entry.getKey());
            }
        }

    }

    private static void findDuplicatesUsingHashSet(int[] inputArray) {
        Set<Integer> integerSet = new HashSet<>();
        for (Integer number : inputArray) {
            if (!integerSet.add(number)) {
                System.out.println("Duplicate element is " + number);
            }
        }
    }

    private static void findDuplicatesUsingSorting(int[] inputArray) {
        Arrays.sort(inputArray);
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] == inputArray[i + 1]) {
                System.out.println("Duplicate element is " + inputArray[i]);
            }
        }

    }

    private static void findDuplicatesUsingBruteForce(int[] inputArray) {
        System.out.println("Length for reference " + inputArray.length);
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    System.out.println("Duplicate element is " + inputArray[i]);
                }
            }

        }
    }
}
