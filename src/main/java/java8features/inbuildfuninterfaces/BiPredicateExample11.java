package java8features.inbuildfuninterfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample11 {
    public static void main(String[] args) {
        // Lambda expression implementation
        BiPredicate < String, String > biPredicate = (s1, s2) -> s1.equals(s2);

        System.out.println(biPredicate.test("ramesh", "ramesh"));
        System.out.println(biPredicate.test("java guides", "Java Guides"));
    }
}