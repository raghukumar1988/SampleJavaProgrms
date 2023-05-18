package java8features.streams3;

import java.util.ArrayList;
import java.util.List;

/*Refer: https://beginnersbook.com/2017/10/java-8-features-with-examples/ */
public class StreamAdvanced6 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        System.out.println("Print using forEach #####");
        names.stream()
                .filter(f -> f.startsWith("M"))
                .parallel()
                // .forEach(n->System.out.println(n));
                .forEach(System.out::println);

        // forEach - output order is random
        // forEachOrdered - the output would be in inserted order

        System.out.println("Print using forEachOrdered ##### ");
        names.stream()
                .filter(f -> f.startsWith("M"))
                .parallel()
                //.forEachOrdered(n->System.out.println(n));
                .forEachOrdered(System.out::println);
    }
}