package java8features.streams3;

import java.util.ArrayList;
import java.util.List;
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

public class ForEachAndStreamFilter4 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Maggie");
        names.add("Michonne");
        names.add("Rick");
        names.add("Merle");
        names.add("Governor");
        names.stream() //creating stream
                .filter(f -> f.startsWith("M")) //filtering names that starts with M
                //.forEach(System.out::println); //displaying the stream using #Method Reference#

                .forEach(f -> System.out.println(f)); //displaying the stream using #Lambda Expression#
    }
}