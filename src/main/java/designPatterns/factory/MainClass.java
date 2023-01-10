package designPatterns.factory;

public class MainClass {
    public static void main(String[] args) {
        Notification smsNotification= NotificationFactory.getNotification("SMS");
        smsNotification.notifyMe();
        Notification emailNotification= NotificationFactory.getNotification("EMAIL");
        emailNotification.notifyMe();
        Notification pushNotification= NotificationFactory.getNotification("PUSH");
        pushNotification.notifyMe();
    }
}
