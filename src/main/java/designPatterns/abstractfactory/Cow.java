package designPatterns.abstractfactory;

public class Cow implements Animal{
    @Override
    public void getNoOfLegs() {
        System.out.println("Cow has four legs");
    }

    @Override
    public void fetchAnimalType() {
        System.out.println("Cow is Mammal");
    }
}
