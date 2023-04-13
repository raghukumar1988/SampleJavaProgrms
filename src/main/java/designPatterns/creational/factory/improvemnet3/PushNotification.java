package designPatterns.creational.factory.improvemnet3;

public class PushNotification extends NotificationAbstract {
    PushNotification(String notificationMessage) {
        super(notificationMessage);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending push Notification with type.." +notificationMessage);
    }
}
