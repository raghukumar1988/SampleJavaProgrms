package java8features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams7 {
    public static void main(String[] args) {
        Stream<Integer> integerStream= Stream.of(12,13,14,15);
        List<Integer> streamtoList= integerStream.collect(Collectors.toList());
        streamtoList.forEach(System.out::println);


        Stream<Integer> integerStream2= Stream.of(12,13,14,15);
        Map<Integer,Integer> streamtomap= integerStream2.collect(Collectors.toMap(i->i, i->i+10));
        streamtomap.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));


        Stream<Integer> intStream = Stream.of(1,2,3,4);
        Integer[] intArray = intStream.toArray(Integer[]::new);
        System.out.println(Arrays.toString(intArray)); //prints [1, 2, 3, 4]


        /*Stream Intermediate Operations*/
        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++)
            myList.add(i);
        Stream<Integer> sequentialStream = myList.stream();
        Stream<Integer> highNums = sequentialStream.filter(p -> p > 90); //filter numbers greater than 90
        System.out.print("High Nums greater than 90=");
        highNums.forEach(p -> System.out.println(p+" "));


        Stream<String> names = Stream.of("aBc", "d", "ef");
        //System.out.println(names.map(s -> s.toUpperCase()).collect(Collectors.toList()));
        System.out.println(names.map(String::toUpperCase).collect(Collectors.toList()));


        Stream<String> names1 = Stream.of("aBc", "d", "ef"); // we cannot use same stream twice, hence creating new
        System.out.println(names1.map(String::toUpperCase).collect(Collectors.toMap(i->i,i->i+"Suffix")));


        Stream<String> names2 = Stream.of("aBc", "d", "ef", "123456");
        List<String> reverseSorted = names2.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(reverseSorted); // [ef, d, aBc, 123456]


        Stream<String> names3 = Stream.of("aBc", "d", "ef", "123456");
        List<String> naturalSorted = names3.sorted().collect(Collectors.toList());
        System.out.println(naturalSorted); //[123456, aBc, d, ef]

    }
}
