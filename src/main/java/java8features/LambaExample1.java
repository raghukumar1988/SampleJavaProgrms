package java8features;

import java.util.function.Consumer;

public class LambaExample1 {
    public static void main(String[] args) {
        // older way of implementation
        Greeting greetingNormal= new Greeting() {
            @Override
            public void greet(String a) {
                System.out.println("Hello World " +a);
            }
        };
        greetingNormal.greet("Java 7");

        // newer way of implementation
        Greeting greetingLamda= (a)-> System.out.println("Hello World from Lambda " +a);
        greetingLamda.greet("Java 8");

        // Instead of creating our own FI we can use the lang provided
        Consumer<String> greetingConsumer = (a)-> System.out.println("Hello World from Lambda " +a);
        greetingConsumer.accept("Raghu");
    }

    // Custom FI
    @FunctionalInterface
    interface Greeting{
        void greet(String message);
    }


}
