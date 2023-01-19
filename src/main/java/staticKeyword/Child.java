package staticKeyword;

class Parent {
    public static void display() {
        System.out.println("Welcome to Parent Class");
    }
}

public class Child extends Parent {
    public static void display() {
        System.out.println("Welcome to Child class");
    }

    public static void main(String args[]) {
        Parent.display();
        Child.display();
    }
}