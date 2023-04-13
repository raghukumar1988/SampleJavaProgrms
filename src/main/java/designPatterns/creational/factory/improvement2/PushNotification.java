package designPatterns.creational.factory.improvement2;

public class PushNotification extends NotificationAbstract{
    PushNotification(String notificationMessage) {
        super(notificationMessage);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending push Notification with type.." +notificationMessage);
    }
}
