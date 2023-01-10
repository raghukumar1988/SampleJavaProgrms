package designPatterns.factory;

public class SMSNotification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending SMS Notification" );
    }
}
