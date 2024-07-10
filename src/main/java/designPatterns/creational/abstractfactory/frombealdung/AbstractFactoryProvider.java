package designPatterns.creational.abstractfactory.frombealdung;

import designPatterns.creational.abstractfactory.frombealdung.animal.AnimalFactory;
import designPatterns.creational.abstractfactory.frombealdung.color.ColorFactory;

public class AbstractFactoryProvider {
    public static AbstractFactory getFactory(String factoryName){
    //public static AbstractFactory<?> getFactory(String choice){

        if("Animal".equalsIgnoreCase(factoryName)){
            return new AnimalFactory();
        }
        else if("Color".equalsIgnoreCase(factoryName)){
            return new ColorFactory();
        }
        
        return null;
    }
}