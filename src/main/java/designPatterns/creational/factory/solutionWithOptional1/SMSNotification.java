package designPatterns.creational.factory.solutionWithOptional1;

public class SMSNotification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending SMS Notification");
    }
}
