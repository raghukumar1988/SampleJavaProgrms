package designPatterns.creational.abstractfactory.frombealdung;

public interface AbstractFactory<T> {
    T create(String type) ;
}