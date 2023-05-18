package java8features.streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class StreamHashMapSortingExample {
    public static void main(String[] args) {
        sortMapByUsingComparingMethodOfComparator();
        sortMapByUsingComparingByValueMethodOfMapDotEntry();
        sortMapInReverseOrder(); // Map.Entry Approach is handy fo this
    }

    private static void sortMapInReverseOrder() {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil",1000);
        map1.put("ankit",1200);
        map1.put("bhavna",1200);
        map1.put("james",1200);
        map1.put("micael",1000);
        map1.put("tom",1300);
        map1.put("daniel",1300);
        System.out.println("Sorting Map elements by Value in REVERSE using comparingByValue method of Map.Entry -- ");
        System.out.println("Note : We can use comparing using Minus symbol but that's not convenient ");
        map1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEach(System.out::println);
        System.out.println("##########################################");
    }

    private static void sortMapByUsingComparingByValueMethodOfMapDotEntry() {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil",1000);
        map1.put("ankit",1200);
        map1.put("bhavna",1200);
        map1.put("james",1200);
        map1.put("micael",1000);
        map1.put("tom",1300);
        map1.put("daniel",1300);
        System.out.println("Sorting Map elements by Value using comparingByValue method of Map.Entry -- ");
        map1.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        System.out.println("##########################################");
    }

    private static void sortMapByUsingComparingMethodOfComparator() {

        Map<String,Integer> map1 = new HashMap<>();
        map1.put("anil",1000);
        map1.put("ankit",1200);
        map1.put("bhavna",1200);
        map1.put("james",1200);
        map1.put("micael",1000);
        map1.put("tom",1300);
        map1.put("daniel",1300);
        System.out.println("Sorting Map elements by Value using comparing method of Comparator..");
        map1.entrySet()
                .stream()
                //.sorted(Comparator.comparing(entry->entry.getValue())
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(System.out::println);

        System.out.println("##########################################");
    }
}
