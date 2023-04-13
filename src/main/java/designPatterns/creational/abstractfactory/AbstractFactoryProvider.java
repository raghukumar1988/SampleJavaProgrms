package designPatterns.creational.abstractfactory;

public class AbstractFactoryProvider{
    public static AbstractFactory getFactoryInstance(String type){
        if(type.equals("colour")){
            return new ColourFactory();
        }else if(type.equals("animal")){
            return new AnimalFactory();
        }
        return null;
    }
}
