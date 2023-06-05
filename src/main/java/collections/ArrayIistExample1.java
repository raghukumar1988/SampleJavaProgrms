package collections;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayIistExample1 {

    public static void main(String[] args) {
        printListElementsInReverseUsingListIterator();
        printListElementsInReverseUsingReverseMethod();
        printListElementsInReverseUsingStreams();
    }

    private static void printListElementsInReverseUsingStreams() {
        List<String> al = new ArrayList<>();
        System.out.println("Printing in reverse order using Streams -- ");
        al.add("TEst1");
        al.add("TEst2");
        al.add("TEst3");
        al.add("TEst4");
        al.add("TEst5");
        //al.add(null); // throws NPE
        al.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    private static void printListElementsInReverseUsingReverseMethod() {
        List<String> al = new ArrayList<>();
        al.add("TEst1");
        al.add("TEst2");
        al.add("TEst3");
        al.add("TEst4");
        al.add("TEst5");

        Collections.reverse(al);
        for (String testName : al) {
            System.out.println("Printing in reverse order using Collections.reverse --  " + testName);
        }
        System.out.println("################################");

    }

    private static void printListElementsInReverseUsingListIterator() {
        List<String> al = new ArrayList<>();
        al.add("TEst1");
        al.add("TEst2");
        al.add("TEst3");
        al.add("TEst4");
        al.add("TEst5");

        // This will NOT WORK because the index points to the beginning of the list.
        ListIterator<String> listIterator = al.listIterator();
        // Uncommenting below line just prints 2 elements alone
        //ListIterator<String> listIterator = al.listIterator(2);
        while (listIterator.hasPrevious()) {
            System.out.println("Reverse list Iterator(default) = " + listIterator.previous());
        }
        System.out.println("################################");
        // This works, because the index points to the last  index
        ListIterator<String> listIteratorWithSize = al.listIterator(al.size());
        while (listIteratorWithSize.hasPrevious()) {
            System.out.println("Reverse list Iterator(With Size arg) = " + listIteratorWithSize.previous());
        }
        System.out.println("################################");
    }

}
