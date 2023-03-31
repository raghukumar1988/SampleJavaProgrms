package java8features.inbuildfuninterfaces;

import java.util.function.Supplier;

//The supplier interface contains exactly one abstract method get(T t).
// Method Signature -   T get();
// It does not take anything but  returns a type.
public class SuppliersExample3 {

    public static void main(String[] args) {

        Supplier<Person> supplier = () -> {
            return new Person("Raghu", 30);
        };
        Person p = supplier.get();
        System.out.println("Person Detail: " + p.getName() + ", " + p.getAge());
    }
}