package java8features.inbuildfuninterfaces21;

import java.util.function.BiFunction;

//It represents a function that accepts two arguments and returns a result.
//Signature - R apply(T arg0, U arg1);
//takes 2 arguments and returns a value
public class BiFunctionExample21 {

    public static void main(String[] args) {

        BiFunction<Person, Person, Integer> biFunction = (p1, p2) -> {
            return p1.getAge() + p2.getAge();
        };
        Person person1 = new Person("Ramesh", 10);
        Person person2 = new Person("ram", 10);

        int totalAge = biFunction.apply(person1, person2);
        System.out.println(totalAge);

    }
}