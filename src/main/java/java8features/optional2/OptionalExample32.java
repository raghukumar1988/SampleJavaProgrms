package java8features.optional2;

import java.util.Optional;

public class OptionalExample32 {
    public static void main(String[] args) {
        //isPresentOptionalAPI();
        //ifPresentOrElseOptionalAPI();
        //orElseOptionalAPI();
        //orElseGetOptionalAPI();
        orElseThrowWithDefaultExceptionOptionalAPI();
        orElseThrowWithCustomEExceptionOptionalAPI(null); // Check junit class
    }

    // The isPresent() method returns true if the value present in Optional
    // ifPresent() is more convenient to use
    private static void isPresentOptionalAPI() {

        // Java 7 null check
        String name = "Ramesh";
        if (null != name) {
            System.out.println(name.length());
        }
        // Java 8 null handling using Optional
        Optional<String> opt = Optional.of("Ramesh");
        if (opt.isPresent()) {
            System.out.println("Printing value if its present --> " + opt.get().length());
        }
        //opt.ifPresent(name -> System.out.println(name.length()));


        System.out.println(opt.isPresent());  // not as convenient as ifPresent()
        /*if(opt.isPresent()){
            System.out.println("Printing value if its present --> "+ opt.get());
        }*/
        opt.ifPresent(s -> System.out.println("Printing value if its present --> " + s)); // new impl
        // The ifPresent API enables us to run some code on the wrapped value if it is found to be non-null.

    }

    // If a value is present, performs the given action with the value,
    // otherwise performs the given empty-based action.
    private static void ifPresentOrElseOptionalAPI() {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent()); //false
        empty.ifPresentOrElse(System.out::println, () -> System.out.println("Optional is empty"));

    }

    // If a value is present, returns the value, otherwise returns other.
    private static void orElseOptionalAPI() {
        // With orElse, the wrapped value is returned if it is present and the argument given to
        // orElse is returned if the wrapped value is absent

        String name = null;
        // String name = "Raghu"; // uncomment explore the behaviour
        // String name= "";

        // If a value is present, invoke the specified consumer with the value, otherwise do nothing.
        String name1 = Optional.ofNullable(name).orElse("Ramesh");
        System.out.println("Processing null value using orElse()--> " + name1);
    }

    //If a value is present, returns the value,
    // otherwise returns the result produced by the supplying function.
    private static void orElseGetOptionalAPI() {
        String name = null;
        // String name = "Raghu"; // uncomment explore the behaviour
        String nameResult = Optional.ofNullable(name).orElseGet(OptionalExample32::getRandomNameAsString);
        System.out.println("Printing Result of orElseGet which returns String --> " + nameResult);


        Optional<String> nameOptional = Optional.ofNullable(null);
        //Optional<String> nameOptional = Optional.ofNullable("Raghu");// uncomment explore the behaviour
        // Note -- Below does not pass through orElseGet
        Optional<String> name1 = Optional.of(nameOptional).orElseGet(OptionalExample32::getRandomNameAsOptional);
        //String name = Optional.ofNullable(nullName).orElseGet(() -> "Ramesh");
        System.out.println("Printing Result of orElseGet which returns Optional<String> --> " + name1);

    }

    //If a value is present, returns the value,
    // otherwise throws an exception produced by the exception supplying function.
    private static void orElseThrowWithDefaultExceptionOptionalAPI() {
        // This will throw exception
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(); // throws default NoSuchElementException
        System.out.println(name);
    }

    //If a value is present, returns the value,
    // otherwise throws an exception produced by the exception supplying function.
    public static void orElseThrowWithCustomEExceptionOptionalAPI(String nullName) {
        String name = Optional.ofNullable(nullName)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }


    private static Optional<String> getRandomNameAsOptional() {
        return Optional.of("Raghu");
    }

    private static String getRandomNameAsString() {
        return "Raghu";
    }


}
