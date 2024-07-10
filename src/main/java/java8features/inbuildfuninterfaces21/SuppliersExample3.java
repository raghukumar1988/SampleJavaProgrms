package java8features.inbuildfuninterfaces21;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

//The supplier interface contains exactly one abstract method get(T t).
// Method Signature -   T get();
// It does not take anything but  returns a type.
public class SuppliersExample3 {

    public static void main(String[] args) {

       /* Supplier<Person> supplier = () -> {
            return new Person("Raghu", 30);
        };*/
        Supplier<Person> supplier = () -> new Person("Raghu", 30); // simplified
        Person p = supplier.get();
        System.out.println("Person Detail: " + p.getName() + ", " + p.getAge());

        IntSupplier randomNumber= ()-> {
            return 3;
        };
        int randomNum=randomNumber.getAsInt();
        System.out.println(randomNum);


        LongSupplier longRandomNum= ()->  {
            return 34534534L;
        };
        long asLong = longRandomNum.getAsLong();
        System.out.println(asLong);
    }
}