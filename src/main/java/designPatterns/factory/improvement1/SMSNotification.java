package designPatterns.factory.improvement1;

public class SMSNotification extends NotificationAbstract {
    SMSNotification(String type) {
        super(type);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending SMS Notification with type.. " +type);
    }
}
