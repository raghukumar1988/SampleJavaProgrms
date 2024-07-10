package designPatterns.creational.abstractfactory.frombealdung.animal;

import designPatterns.creational.abstractfactory.frombealdung.AbstractFactory;
import designPatterns.creational.abstractfactory.frombealdung.animal.Animal;
import designPatterns.creational.abstractfactory.frombealdung.animal.Dog;
import designPatterns.creational.abstractfactory.frombealdung.animal.Duck;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal createInstance(String animalType) {
        if ("Dog".equalsIgnoreCase(animalType)) {
            return new Dog();
        } else if ("Duck".equalsIgnoreCase(animalType)) {
            return new Duck();
        }

        return null;
    }

}
