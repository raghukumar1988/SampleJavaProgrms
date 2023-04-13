package designPatterns.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal getInstance(String type) {
        if(type.equals("Cow")){
            return new Cow();
        }else if(type.equals("Goat")){
            return new Goat();
        }
        return null;
    }
}
