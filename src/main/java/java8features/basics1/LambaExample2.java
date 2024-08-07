package java8features.basics1;

import java.util.function.Consumer;

public class LambaExample2 {
    public static void main(String[] args) {
        // older way of implementation
        Greeting greetingNormal= new Greeting() {
            @Override
            public void greet(String a) {
                System.out.println("Hello from  " +a);
            }
        };
        greetingNormal.greet("Java 7");

        // newer way of implementation and uses Custom FI
        Greeting greetingLamda= (a)-> System.out.println("Hello from " +a);
        greetingLamda.greet("Java 8 Lambda");

        // Instead of creating our own FI we can use the default lang provided FI
        Consumer<String> greetingConsumer = (a)-> System.out.println("Hello  from " +a);
        greetingConsumer.accept("Java 8 Lambda with Consumer");

    }

    // Custom FI
    @FunctionalInterface
    interface Greeting{
        void greet(String message);
    }


}
