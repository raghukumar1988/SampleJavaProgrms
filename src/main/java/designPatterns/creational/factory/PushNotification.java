package designPatterns.creational.factory;

public class PushNotification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending push Notification");
    }
}
