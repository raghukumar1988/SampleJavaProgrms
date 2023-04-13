package designPatterns.creational.abstractfactory;

public class Yellow implements Colour{
    @Override
    public void getColourCode() {
        System.out.println("Colour code for Yellow is 3");
    }

    @Override
    public void isprimary() {
        System.out.println("Yellow is Secondary");
    }
}
