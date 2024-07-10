package java8features.inbuildfuninterfaces21;

import java.util.function.BiPredicate;

public class BiPredicateExample11 {
    public static void main(String[] args) {
        // Lambda expression implementation
        //BiPredicate < String, String > biPredicate = String::equals;
        BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);

        System.out.println(biPredicate.test("ramesh", "ramesh"));
        System.out.println(biPredicate.test("java guides", "Java Guides"));


        BiPredicate<String, String> biPredicate2 = (s1, s2) -> {
            System.out.print(s1.length() + " ");
            System.out.print(s2.length() + " ");
            return s1.length() > s2.length();
        };
        //BiPredicate <String, String> biPredicate2 = (s1,s2) ->s1.length()>s2.length();
        System.out.println(biPredicate2.test("ramesh", "ramesh1"));
        System.out.println(biPredicate2.test("java guides22", "Java Guides"));
    }
}