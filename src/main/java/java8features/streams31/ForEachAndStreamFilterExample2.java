package java8features.streams31;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/*must visit - https://www.baeldung.com/java-8-interview-questions */
/*Java Stream does not store data, it operates on the source data structure (collection and array)
and produce pipelined data that we can use and perform specific operations.
Example:  we can create a stream from the list and filter it based on a condition.*/

/*Java Streams are consumable, so there is no way to create a reference to stream for future usage.
Since the data is on-demand, it-s not possible to reuse the same stream multiple times.*/

/*Java 8 Stream supports sequential as well as parallel processing,
parallel processing can be very helpful in achieving high performance for large collections. */

/*All the Java Stream API interfaces and classes are in the java.util.stream package.
Since we can use primitive data types such as int, long in the collections using auto-boxing and these operations could take a lot of time,
there are specific classes for primitive types - IntStream, LongStream and DoubleStream.*/

public class ForEachAndStreamFilterExample2 {
    public static void main(String[] args) {
        filteNamesWhichStartsWithM();
        removeNullUsingFilterMethod();
        convertStreamToParallelAndPrintElements();
        convertStreamToParallelAndPrintElementsInInsertedOrder();
    }

    private static void convertStreamToParallelAndPrintElementsInInsertedOrder() {
        // forEach - output order is random
        // forEachOrdered - the output would be in inserted order
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        System.out.println("Print using forEachOrdered ##### ");
        names.stream()
                .parallel() // convert sequential to parallel
                .filter(f -> f.startsWith("M"))
                .forEachOrdered(System.out::println);
    }

    private static void convertStreamToParallelAndPrintElements() {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        System.out.println("Print using forEach #####");
        names.stream()
                .parallel()
                .filter(f -> f.startsWith("M"))
                .forEach(System.out::println);
        System.out.println("###################################################");
    }


    private static void removeNullUsingFilterMethod() {
        List<String> names = Arrays.asList("Raghu","Raja",null,"Ramu",null);
        System.out.println("Before null removal..");
        names.forEach(System.out::println);
        System.out.println("After null removal..");
        names.stream()
                //.filter(name->name!=null)
                .filter(Objects::nonNull)  // java.util.Objects class
                .forEach(System.out::println);
        System.out.println("###################################################");
    }

    private static void filteNamesWhichStartsWithM() {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("John");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        names.stream() //creating stream
                .filter(f -> f.startsWith("M")) //filtering names that starts with M
                //.forEach(f -> System.out.println(f)); //displaying the stream using #Lambda Expression#
                .forEach(System.out::println); //displaying the stream using #Method Reference#
        System.out.println("###################################################");
    }
}