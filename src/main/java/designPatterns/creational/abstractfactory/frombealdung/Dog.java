package designPatterns.creational.abstractfactory.frombealdung;

public class Dog implements Animal {

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Barks";
    }

}
