package java8features;

public class LambaExample1 {
    public static void main(String[] args) {
        Greeting greetingNormal= new Greeting() {  // older way of implementaion
            @Override
            public void greet(String a) {
                System.out.println("Hello World " +a);
            }
        };
        Greeting greetingLamda= (a)-> System.out.println("Hello World from Lamda " +a); // newer way of implementaion
        greetingNormal.greet("Java 7");
        greetingLamda.greet("Java 8");
    }
    @FunctionalInterface
    interface Greeting{
        void greet(String message);
    }
}
