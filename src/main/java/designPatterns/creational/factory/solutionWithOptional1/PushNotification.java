package designPatterns.creational.factory.solutionWithOptional1;

public class PushNotification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending Push Notification");
    }
}
