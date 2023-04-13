package designPatterns.creational.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = AbstractFactoryProvider.getFactoryInstance("colour");
        Colour red = (Colour) abstractFactory.getInstance("Red");
        red.getColourCode();
        red.isprimary();

        AbstractFactory animalAbstractFactory = AbstractFactoryProvider.getFactoryInstance("animal");
        Animal cow= (Animal) animalAbstractFactory.getInstance("Cow");
        cow.fetchAnimalType();
        cow.getNoOfLegs();


    }
}
