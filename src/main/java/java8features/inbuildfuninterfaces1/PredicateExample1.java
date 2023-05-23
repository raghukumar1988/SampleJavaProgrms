package java8features.inbuildfuninterfaces1;

import java.util.function.Predicate;
//Predicate interface contains exactly one abstract method test(T t).
// Method Signature - boolean test(T t);
// Take any type and returns a boolean
public class PredicateExample1 {
    public static void main(String[] args) {

        Predicate<Person> predicate = person -> person.getAge() > 28;

        boolean result = predicate.test(new Person("ramesh", 29));
        System.out.println(result);

        boolean result2 = predicate.test(new Person("ramesh", 27));
        System.out.println(result2);

        Predicate<String> predicate2= str->str.contains("R");
        System.out.println(predicate2.test("Raghu"));
        System.out.println(predicate2.test("Sonu"));

    }
}