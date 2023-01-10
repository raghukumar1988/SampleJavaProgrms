package designPatterns.factory.improvement1;

public class MainClass {
    public static void main(String[] args) {
        Notification smsNotification= NotificationFactory.getNotification("SMS","Greeting");
        smsNotification.notifyMe();
        Notification emailNotification= NotificationFactory.getNotification("EMAIL","formal");
        emailNotification.notifyMe();
        Notification pushNotification= NotificationFactory.getNotification("PUSH","Weeding Invitation");
        pushNotification.notifyMe();
    }
}
