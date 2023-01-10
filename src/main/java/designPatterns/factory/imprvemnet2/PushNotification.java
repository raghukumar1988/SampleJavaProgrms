package designPatterns.factory.imprvemnet2;

public class PushNotification extends NotificationAbstract {
    PushNotification(String type) {
        super(type);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending push Notification with type.." +type);
    }
}
