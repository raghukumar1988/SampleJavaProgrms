package designPatterns.creational.abstractfactory.example1.color;

public class Red implements Colour{
    @Override
    public void getColourCode() {
        System.out.println("Colour code for Red is 2");
    }

    @Override
    public void isprimary() {
        System.out.println("Red is Primary");
    }
}
