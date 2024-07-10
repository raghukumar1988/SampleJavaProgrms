package designPatterns.creational.abstractfactory.frombealdung;

public interface AbstractFactory<T> {
    T createInstance(String type) ;
}