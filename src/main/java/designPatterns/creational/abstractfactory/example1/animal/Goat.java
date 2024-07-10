package designPatterns.creational.abstractfactory.example1.animal;

import designPatterns.creational.abstractfactory.example1.animal.Animal;

public class Goat implements Animal {
    @Override
    public void getNoOfLegs() {
        System.out.println("Goat has four legs");
    }

    @Override
    public void fetchAnimalType() {
        System.out.println("Goat is Mammal");
    }
}