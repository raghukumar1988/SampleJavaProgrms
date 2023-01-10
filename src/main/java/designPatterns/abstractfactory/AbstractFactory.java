package designPatterns.abstractfactory;

interface AbstractFactory<T> {

    T getInstance(String factoryName);
}
