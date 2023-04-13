package designPatterns.creational.factory.improvement2;

public class EmailNOtification extends NotificationAbstract {
    EmailNOtification(String notificationMessage) {
        super(notificationMessage);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending email Notification with type.. " + notificationMessage);
    }
}
