package java8features;

import java.util.Optional;

public class OptionalExample32 {
    public static void main(String[] args) {
        isPresentOptionalAPI();
        createEmptyOptionalObject();
        getOptionalAPI();
        ifPresentOptionalAPI();
        orElseOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        orElseThrowOptionalAPI();
    }

    // The isPresent() method returns an Optional with the specified present non-null value.
    private static void isPresentOptionalAPI() {
        Optional<String> opt = Optional.of("Ramesh");
        System.out.println(opt.isPresent());  // true
    }

    // An empty() static method returns an empty Optional instance.
    // No value is present for this Optional.
    private static void createEmptyOptionalObject() {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); //false

    }

    //If a value is present in this Optional, returns the value,
    // otherwise throws NoSuchElementException.
    private static void getOptionalAPI() {
        Optional<String> opt = Optional.of("Ramesh");
        String name = opt.get();
        System.out.println(name);

        Optional<String> empty = Optional.empty();
        String name2 = empty.get();
        System.out.println(name2);

    }

    // If a value is present, invoke the specified consumer with the value, otherwise do nothing.
    private static void ifPresentOptionalAPI() {
        // The ifPresent API enables us to run some code on the wrapped value if it is found to be non-null.
        // Before Optional, we would do something like this:
        String name = "Ramesh";
        if (name != null) {
            System.out.println(name.length());
        }

        Optional<String> opt = Optional.of("Ramesh");
        opt.ifPresent(str -> System.out.println(str.length()));
    }

    // If a value is present, invoke the specified consumer with the value, otherwise do nothing.
    private static void orElseOptionalAPI() {
        // With orElse, the wrapped value is returned if it is present and the argument given to
        // orElse is returned if the wrapped value is absent
        String nullName = null;

        // If a value is present, invoke the specified consumer with the value, otherwise do nothing.
        String name = Optional.ofNullable(nullName).orElse("Ramesh");
        System.out.println(name);
    }

    //Return the value if present, otherwise invoke other and return the result of that invocation.
    private static void orElseGetOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName).orElseGet(() -> getRandomName());
        //String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println(name);
    }

    //Return the contained value, if present,
    // otherwise throw an exception to be created by the provided supplier.
    private static void orElseThrowOptionalAPI() {
        // This will throw exception
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }


    private static String getRandomName() {
        return "Raghu";
    }

}
