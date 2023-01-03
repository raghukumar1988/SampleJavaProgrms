package javabyte;

import java.util.function.Consumer;

public class LambdaExample {
    public static void main(String[] args) {

  // Java 7
    Greeting greeting= new Greeting() {
      @Override
      public void sayHello(String msg) {
          System.out.println(" Hello from "+ msg);
      }
  };
    greeting.sayHello("Java 7");

    // using java 8 LE
        Greeting greetingUsingLamda= (a) -> System.out.println(" Hello from "+ a);
        greetingUsingLamda.sayHello(" Java 8");


    // using inbuilt Java 8 FI

        Consumer<String> consumerGreeting= (a) -> System.out.println(" hello from "+ a);
        consumerGreeting.accept("Java 8 COnsumer");



    }




    @FunctionalInterface
    interface Greeting{
        void sayHello(String msg);
    }
}
