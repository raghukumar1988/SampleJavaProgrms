package designPatterns.creational.factory.improvemnet3;

public class EmailNOtification extends NotificationAbstract {
    EmailNOtification(String notificationMessage) {
        super(notificationMessage);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending email Notification with msg.. " +notificationMessage);
    }
}
