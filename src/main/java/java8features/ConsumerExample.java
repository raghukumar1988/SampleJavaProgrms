package java8features;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        /*Consumer is single argument functional interface like Predicate but it does not return any value.
                Consumer is functional interface, so it can be used as assignment target for lambda expressions.
                    It has a 2 functional methods called accept() and default method andThen(). */

        //Consumer<String> consumerString= s->System.out.println(s);
        Consumer<String> consumerString= System.out::println;  // Usage of accept method
        consumerString.accept("Raghu");

        /*#############################################################################*/

        Consumer<String> toLowerCase = x -> System.out.println(x.toLowerCase());
        Consumer<String> toUppercase = y -> System.out.println(y.toUpperCase());

        Consumer<String> result = toLowerCase.andThen(toUppercase);// Usage of andThen method

        result.accept("Raghu");

       /* Refer: https://java2blog.com/java-8-consumer-example/*/
    }
}
