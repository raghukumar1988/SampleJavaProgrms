package designPatterns.creational.factory;

public class EmailNOtification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending email Notification..");
    }
}
