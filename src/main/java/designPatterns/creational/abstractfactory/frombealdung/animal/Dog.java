package designPatterns.creational.abstractfactory.frombealdung.animal;

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
