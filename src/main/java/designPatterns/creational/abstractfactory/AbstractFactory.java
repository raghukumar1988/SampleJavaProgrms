package designPatterns.creational.abstractfactory;

interface AbstractFactory<T> {

    T getInstance(String factoryName);
}
