package designPatterns.factory.imprvemnet2;

public class MainClass {
    public static void main(String[] args) {
        Notification smsNotification= NotificationFactory.getNotification("SMS","Greeting");
        smsNotification.notifyMe();
        smsNotification.notifyGroup();
        smsNotification.logNotifications();
        Notification emailNotification= NotificationFactory.getNotification("EMAIL","formal");
        emailNotification.notifyMe();
        emailNotification.notifyGroup();
        emailNotification.logNotifications();
        Notification pushNotification= NotificationFactory.getNotification("PUSH","Weeding Invitation");
        pushNotification.notifyMe();
        pushNotification.notifyGroup();
        pushNotification.logNotifications();
    }
}
