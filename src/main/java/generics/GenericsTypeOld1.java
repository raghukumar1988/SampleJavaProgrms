package generics;

public class GenericsTypeOld1 {

    private Object name;

    public Object get() {
        return name;
    }

    public void set(Object name) {
        this.name = name;
    }

    public static void main(String args[]) {
        GenericsTypeOld1 type = new GenericsTypeOld1();
        type.set("Raghu");
        //Integer number = (Integer) type.get(); //type casting, error prone and can cause ClassCastException in Runtime
        String str = (String) type.get();
        System.out.println(str);
    }
}