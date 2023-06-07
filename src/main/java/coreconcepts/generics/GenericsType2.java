package coreconcepts.generics;
/*Refer - https://www.digitalocean.com/community/tutorials/java-generics-example-method-class-interface*/

// Note <T> next to class name
// This needs to added whenever class contains generic fields(not needed for methods)
public class GenericsType2<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    //@SuppressWarnings("rawtypes")
    public static void main(String[] args) {
        GenericsType2<String> type = new GenericsType2<>();
        type.set("Raghu"); //valid
        System.out.println(type.get());

        //raw type; not recommended
        GenericsType2 type1 = new GenericsType2();
        type1.set("RawType"); //valid
        System.out.println(type1.get());
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());

        // While creating instance we can explicitly define the Type(Integer,String etc..)
        GenericsType2<Integer> typeInt = new GenericsType2<>();
        //typeInt.set("Raja"); //Invalid
        typeInt.set(20); //Valid
    }
}
    /* Similar to generic classes we can create generic interfaces in java.
        We can also have multiple type parameters similar to Map interface
        Example implementation of lang provided comparable interface

    package java.lang;
            import java.util.*;

    public interface Comparable<T> {
        public int compareTo(T o);
}*/
