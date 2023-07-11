package designPatterns.creational.factory;

public class MainClass {
    public static void main(String[] args) {
        try {
            Notification smsNotification= NotificationFactory.getNotification("SMS");
            smsNotification.notifyMe();
            Notification emailNotification= NotificationFactory.getNotification("EMAIL");
            emailNotification.notifyMe();
            Notification pushNotification= NotificationFactory.getNotification("PUSH");
            pushNotification.notifyMe();
            Notification unKnownNotification= NotificationFactory.getNotification("Unknown");
            unKnownNotification.notifyMe();
        } catch (UnknownNotificationException e) {
            System.out.println("Inside exception block...");
            System.out.println(e.getMessage());
        }
    }
}
