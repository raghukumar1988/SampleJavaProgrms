package designPatterns.creational.abstractfactory.frombealdung;

import designPatterns.creational.abstractfactory.frombealdung.animal.Animal;
import designPatterns.creational.abstractfactory.frombealdung.color.Color;

public class AbstractFactoryMain {
    public static void main(String[] args) {

        AbstractFactory<?> abstractFactory;
        //creating a brown toy dog
        abstractFactory = AbstractFactoryProvider.getFactory("Animal");
        Animal toy =(Animal) abstractFactory.createInstance("Dog"); // may produce NPE; Use Optional
        abstractFactory = AbstractFactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.createInstance("Brown");
        
        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();
        
        System.out.println(result);
    }
}
