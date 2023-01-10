package designPatterns.abstractfactory.frombealdung;

public interface AbstractFactory<T> {
    T create(String type) ;
}