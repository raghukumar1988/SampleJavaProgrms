package generics;

public class GenericsTypeOld1 {

    private Object name;

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public static void main(String args[]) {
        GenericsTypeOld1 type = new GenericsTypeOld1();
        type.setName("Raghu");
        String str = (String) type.getName();
        //type casting,prone to error and can cause ClassCastException in RUNTIME
        //type.setName(1234); // No compile error
        //Integer number = (Integer) type.getName(); // No compile error
        System.out.println(str);
    }
}