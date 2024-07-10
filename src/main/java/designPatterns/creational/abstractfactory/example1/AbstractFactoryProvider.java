package designPatterns.creational.abstractfactory.example1;

import designPatterns.creational.abstractfactory.example1.animal.AnimalFactory;
import designPatterns.creational.abstractfactory.example1.color.ColourFactory;

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
