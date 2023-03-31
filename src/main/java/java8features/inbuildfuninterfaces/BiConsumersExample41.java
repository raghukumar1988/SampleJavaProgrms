package java8features.inbuildfuninterfaces;

import java.util.function.BiConsumer;
// takes 2 agruments and return  nothing(just consumes)
public class BiConsumersExample41 {

    public static void main(String[] args) {
  
        BiConsumer<Person, Person> biConsumer = (p1, p2) -> {
             System.out.println(" print first persion");
             System.out.println(p1.getName());
             System.out.println(" print second persion");
             System.out.println(p2.getName());
       };
  
       biConsumer.accept(new Person("Ramesh", 10), new Person("ram", 10));
    }
}