package javabyte;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        List<String> strList= new ArrayList<>();
        strList.add("String 1");
        strList.add("String 2");
        strList.add("String 3");
        strList.add("String 4");

        //Type 1: normal way
        for (String str:strList) {
            System.out.println("Normal way "+str);
        }

        //Type 2: using Java 8 foreach with Anonymous impl
        strList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Java 8 foreach with Anonymous impl "+s);
            }
        });

        //Type 3 :using Java 8 foreach with Lambda Expression

        strList.forEach((s)-> System.out.println("Java 8 foreach with Lambda Expression "+s));

        //Type 4 :using Java 8 foreach with Method reference

        strList.forEach(System.out::println);

        //Type 5 :using Java 8 custom FI impl
        strList.forEach(new MyConsumer());

    }


}


class MyConsumer implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println("Java 8 custom FI impl" +s);
    }
}