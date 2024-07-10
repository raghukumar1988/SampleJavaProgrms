package designPatterns.creational.abstractfactory.example1;

public interface AbstractFactory<T> {

    T getInstance(String factoryName);
}
