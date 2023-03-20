package generics;

public class GenericsType2<T> {

    private T t;

    public T get() {
        return this.t;
    }

    public void set(T t1) {
        this.t = t1;
    }

    //@SuppressWarnings("rawtypes")
    public static void main(String args[]) {
        GenericsType2<String> type = new GenericsType2<>();
        type.set("Raghu"); //valid
        System.out.println(type.get());


        GenericsType2 type1 = new GenericsType2(); //raw type; not recommended
        type1.set("RawType"); //valid
        System.out.println(type1.get());
        type1.set(10); //valid and autoboxing support
        System.out.println(type1.get());

        // While creating instance we can explicitly define the Type(Integer,String etc..)
        GenericsType2<Integer> typeInt = new GenericsType2<>();
        //typeInt.set("Raja"); //Invalid
        typeInt.set(20); //Invalid
    }
}
/* Reference: https://www.journaldev.com/1663/java-generics-example-method-class-interface#java-generic-type */
