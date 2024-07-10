package java8features.optional22;

import java.util.Optional;

public class OptionalExample31 {
    public static void main(String[] args) {
        Optional<String> gender = Optional.of("MALE");
        System.out.println("Non-Empty Optional:" + gender);
        System.out.println("Non-Empty Optional: Gender value : " + gender.get());
        System.out.println();

        System.out.println("Empty Optional: " + Optional.empty());
        System.out.println();

        String answer1 = "Yes";
        System.out.println("ofNullable on Non-Empty String: " + Optional.ofNullable(answer1));
        System.out.println("ofNullable on Non-Empty String: Get value : " + Optional.ofNullable(answer1).get());
        System.out.println();

        String answer3= "";
        System.out.println("ofNullable on Empty String: " + Optional.ofNullable(answer3));
        System.out.println("ofNullable on Empty String with get() : " + Optional.ofNullable(answer3).get());
        System.out.println("Optional.of() on empty String: " + Optional.of(answer3));
        System.out.println();

        String answer2 = null;
        System.out.println("ofNullable on null String: " + Optional.ofNullable(answer2)); // returns Optional.Empty
        // below Optional.of(null) throws java.lang.NullPointerException
        System.out.println("Optional.of() on null String : " + Optional.of(answer2));
        /*If the program crashes even with Optional, why even bother using Optional?

        The program wouldn't crash somewhere deeper in the code (when accessing object)
        but at the very first use (initialization) of a null object, minimizing potential damage.*/

    }

    /*Best Practices: The Optional should be used almost always
    as the return type of function that might not return a value.
    Refer - https://www.javaguides.net/2018/07/java-8-optional-class.html */
}
