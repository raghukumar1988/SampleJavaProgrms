package designPatterns.creational.abstractfactory.example1.animal;

import designPatterns.creational.abstractfactory.example1.animal.Animal;

public class Cow implements Animal {
    @Override
    public void getNoOfLegs() {
        System.out.println("Cow has four legs");
    }

    @Override
    public void fetchAnimalType() {
        System.out.println("Cow is Mammal");
    }
}
