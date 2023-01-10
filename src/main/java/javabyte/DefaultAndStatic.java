package javabyte;

public class DefaultAndStatic implements FirstInterface,SecondInterface,ThirdInterface{

    public static void main(String[] args) {
        DefaultAndStatic defaultAndStatic= new DefaultAndStatic();
        defaultAndStatic.readText();
        defaultAndStatic.showText();
        defaultAndStatic.readText();

    }

    @Override
    public void readText() {
        System.out.println("Inside read text");
    }

    @Override
    public void showText() {
        FirstInterface.super.showText();
    }
}


interface FirstInterface{
    void readText();
    default void showText(){
        System.out.println("Inside First Interface");
    }
}

interface SecondInterface{
    default void showText(){
        System.out.println("Inside Second Interface");
    }
}

interface ThirdInterface{
    default void writeText(){
        System.out.println("Inside Third Interface");
    }

    static void writeLogs(){
        System.out.println("Inside static method of Third Interface");
    }
}