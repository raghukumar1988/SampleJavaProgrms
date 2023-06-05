package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/*Refer -  https://howtodoinjava.com/java/collections/java-immutable-and-unmodifiable-maps/#2-unmodifiable-maps*/
public class ImmutableVsUnModifiableMapExample {
    public static void main(String[] args) {
        createUnModifiableMap();
        createImmutableMap();
    }

    private static void createImmutableMap() {
        Map<Integer, String> immutableMap = Map.of(1, "Mumbai", 2, "Pune", 3, "Bangalore");
        immutableMap.forEach((k, v) -> System.out.println("Key is " + k + " Value is  " + v));
        //immutableMap.put(4,"Delhi");//throws UnsupportedOperationException in runtime
        Map<Integer, String> cityMap = new HashMap<>();
        cityMap.put(1, "Mumbai");
        cityMap.put(2, "Pune");
        cityMap.put(3, "Bangalore");
        Map<Integer, String> immutableMapUsingCopyOf = Map.copyOf(cityMap); // Recommended way
        immutableMapUsingCopyOf.forEach((k, v) -> System.out.println("Immutable Map Key is " + k + " Value is  " + v));
        //immutableMapUsingCopyOf.put(4,"Delhi");//throws UnsupportedOperationException in runtime
        cityMap.put(4, "Delhi"); // This will not be added in immutable map
        System.out.println("After updating parent map....");
        cityMap.forEach((k, v) -> System.out.println("NOrmal Map Key is " + k + " Value is  " + v));
        System.out.println();
        immutableMapUsingCopyOf.forEach((k, v) -> System.out.println("CopyOf Map Key is " + k + " Value is  " + v));

    }

    private static void createUnModifiableMap() {
        Map<Integer, String> studentMap = new HashMap<>();
        studentMap.put(1, "Raghu");
        studentMap.put(2, "Sonu");
        studentMap.forEach((k, v) -> System.out.println("Key is " + k + " Value is  " + v));
        Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(studentMap);
        //unmodifiableMap.put(3,"Ramu");// throws UnsupportedOperationException in runtime
        unmodifiableMap.forEach((k, v) -> System.out.println("UMM Key is " + k + " Value is  " + v));

        studentMap.put(4, "NIthran"); // DRAWBACK of unmodifiableMap
        System.out.println("After updating Parent Map.....");
        studentMap.forEach((k, v) -> System.out.println("Key is " + k + " Value is  " + v));

        unmodifiableMap.forEach((k, v) -> System.out.println("UMM Key is " + k + " Value is  " + v));

        System.out.println();
    }
}
