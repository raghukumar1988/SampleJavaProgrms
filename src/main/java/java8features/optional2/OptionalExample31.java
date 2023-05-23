package java8features.optional2;

import java.util.Optional;

public class OptionalExample31 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        String answer1 = "Yes";
        String answer2 = null;
        String answer3= "";

        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println("Empty Optional: " + Optional.empty());

        System.out.println("ofNullable on Non-Empty String: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on null String: " + Optional.ofNullable(answer2));
        System.out.println("ofNullable on Empty String: " + Optional.ofNullable(answer3));

        System.out.println("Optional.of() on empty String: " + Optional.of(answer3));
        // throws java.lang.NullPointerException
        System.out.println("Optional.of() on null String : " + Optional.of(answer2));
    }

    /*Best Practices: The Optional should be used almost always
    as the return type of function that might not return a value.
    Refer - https://www.javaguides.net/2018/07/java-8-optional-class.html */
}
