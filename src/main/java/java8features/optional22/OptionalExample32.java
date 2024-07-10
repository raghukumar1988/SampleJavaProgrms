package java8features.optional22;

import java.util.Optional;

public class OptionalExample32 {
    public static void main(String[] args) {
        isPresentOptionalAPI();
        ifPresentOrElseOptionalAPI();
        orElseOptionalAPI();
        orElseGetOptionalAPI();
        //orElseThrowWithDefaultExceptionOptionalAPI();
        orElseThrowWithCustomEExceptionOptionalAPI(null); // Check junit class
    }

    // The isPresent() method returns true if the value present in Optional
    // The ifPresent API enables us to RUN SOME CODE on the wrapped value if it is non-null.
    private static void isPresentOptionalAPI() {

        // Java 7 null check
        String name = "Ramesh";
        if (null != name) {
            System.out.println(name.length());
        }

        // Java 8 null handling using Optional
        Optional<String> opt = Optional.of("Ramesh");
        //Optional<String> opt = Optional.ofNullable("Ramesh");
        if (opt.isPresent()) {
            System.out.println("Printing value if its present --> " + opt.get().length());
        }

        //using ifPresent
        opt.ifPresent(name2 -> System.out.println(name2.length()));
        opt.ifPresent(name1 -> System.out.println("Printing value if its present --> " + name1));


    }

    // If a value is present, performs the given action with the value,
    // otherwise performs the given empty-based action.
    private static void ifPresentOrElseOptionalAPI() {
        Optional<String> empty = Optional.empty();
        Optional<String> empty1 = Optional.of("Raghu");
        //ifPresentOrElse - Runnable -> no args no returnType; Consumer -> take an argument and no returnType
        empty.ifPresentOrElse(str -> System.out.println("String from Optional" + str), () -> System.out.println("Optional is empty"));
        //empty.ifPresentOrElse(OptionalExample32::printTheValues, () -> System.out.println("Optional is empty"));
        empty1.ifPresentOrElse(OptionalExample32::printTheValues, () -> System.out.println("Optional is empty"));

    }

    private static void printTheValues(String str) { // Utility Method
        System.out.println("Printing since we have value = " + str);
    }

    //Def 1 -  If a value is present, returns the value, otherwise returns other(value in orElse).
    //Def 2 -  With orElse, the wrapped value is returned if it is present
    // otherwise the argument given to orElse is returned if the wrapped value is ABSENT
    private static void orElseOptionalAPI() {
        String name = null; // goes to orElse
        //String name = "Raghu"; // uncomment explore the behaviour
        //String name= ""; // does not go to orElse

        String name1 = Optional.ofNullable(name).orElse("ElseRamesh");
        System.out.println("Processing null value using orElse()--> " + name1);
    }

    //If a value is present, returns the value,
    // otherwise returns the result produced by the supplying function.
    private static void orElseGetOptionalAPI() {
        String name = null;
        //String name = "Raghu"; // uncomment explore the behaviour
        String nameResult = Optional.ofNullable(name)
                .orElseGet(OptionalExample32::getRandomNameAsString);
                /*.orElseGet(() -> {
                    System.out.println("Inside orElseGet");
                    return "RaghuFromElse";
                });*/
        System.out.println("Printing Result of orElseGet which returns String --> " + nameResult);

    }

    private static String getRandomNameAsString() {
        return "RaghuFromElse";
    }

    //If a value is present, returns the value,
    // otherwise throws an exception produced by the exception supplying function.
    private static void orElseThrowWithDefaultExceptionOptionalAPI() {
        String nullName = null;
        String name = Optional.ofNullable(nullName)
                .orElseThrow(); // throws default NoSuchElementException
        System.out.println(name);
    }

    //If a value is present, returns the value,
    // otherwise throws an exception produced by the exception supplying function.
    public static void orElseThrowWithCustomEExceptionOptionalAPI(String nullName) {
        String name = Optional.ofNullable(nullName)
                //.orElseThrow(()->{return  new IllegalArgumentException()});
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(name);
    }

}
