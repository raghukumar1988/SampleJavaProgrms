package designPatterns.creational.abstractfactory;

public class Goat implements Animal{
    @Override
    public void getNoOfLegs() {
        System.out.println("Goat has four legs");
    }

    @Override
    public void fetchAnimalType() {
        System.out.println("Goat is Mammal");
    }
}