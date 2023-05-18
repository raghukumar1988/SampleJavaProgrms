package coreconcepts.abstractAndInterfaces.abstraction;

abstract class Base {
    Base()
    {
        System.out.println("Base Constructor Called");
    }
    abstract void fun();
}

class Derived extends Base {
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }
    void fun() // implementation
    {
        System.out.println("Derived fun() called");
    }
}

class Driver {
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.fun();
    }
}