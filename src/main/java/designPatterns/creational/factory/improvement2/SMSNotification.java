package designPatterns.creational.factory.improvement2;

public class SMSNotification extends NotificationAbstract {
    SMSNotification(String notificationMessage) {
        super(notificationMessage);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending SMS Notification with type.. " +notificationMessage);
    }
}
