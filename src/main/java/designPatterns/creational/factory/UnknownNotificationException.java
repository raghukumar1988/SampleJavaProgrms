package designPatterns.creational.factory;

public class UnknownNotificationException extends Exception {
    public UnknownNotificationException(String unknownType) {
        super(unknownType);
    }
}
