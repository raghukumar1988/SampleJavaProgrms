package java8features.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StreamRemoveNullValuesExample {
    public static void main(String[] args) {
        removeNullUsingFilterMethod();
    }

    private static void removeNullUsingFilterMethod() {
        List<String> names = Arrays.asList("Raghu","Raja",null,"Ramu",null);
        System.out.println("Before null removal");
        names.forEach(System.out::println);
        System.out.println("After null removal");
        names.stream()
                //.filter(name->name!=null)
                .filter(Objects::nonNull)
                .forEach(System.out::println);

    }
}
