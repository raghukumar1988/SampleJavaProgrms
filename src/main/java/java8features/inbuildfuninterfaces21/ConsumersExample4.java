package java8features.inbuildfuninterfaces21;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
// The consumer interface contains exactly one abstract method accept(T arg0).
// Method Signature -  void accept(T arg0);
// It takes a value but returns nothing
public class ConsumersExample4 {

    public static void main(String[] args) {

        //Consumer<String> consumerString= s->System.out.println(s);
        Consumer<String> consumerString= System.out::println;  // Usage of accept method
        consumerString.accept("Raghu");


        Consumer<String> toLowerCase = x -> System.out.println(x.toLowerCase());
        Consumer<String> toUppercase = y -> System.out.println(y.toUpperCase());
        Consumer<String> result = toLowerCase.andThen(toUppercase);// Usage of andThen method
        result.accept("Raghu");


        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));
        // example 1 - foreach accepts consumer type; check forEach impl to understand how this works
        listOfPerson.forEach((person) -> {
            System.out.println(" Person name : " + person.getName());
            System.out.println(" Person age : " + person.getAge());
        });
  
  
        // Example 2
        Consumer<Person> consumer = (person) -> {
           System.out.println(person.getName());
           System.out.println(person.getAge());
        };
        consumer.accept(new Person("Raghu", 30));
    }
}