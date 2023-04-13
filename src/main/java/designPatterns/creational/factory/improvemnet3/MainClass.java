package designPatterns.creational.factory.improvemnet3;

public class MainClass {
    public static void main(String[] args) {
        Notification smsNotification= NotificationFactory.getNotification("SMS","Good Morning!!");
        smsNotification.notifyMe();
        smsNotification.notifyGroup();
        smsNotification.logNotifications();
        Notification emailNotification= NotificationFactory.getNotification("EMAIL","Regarding Bonus");
        emailNotification.notifyMe();
        emailNotification.notifyGroup();
        emailNotification.logNotifications();
        Notification pushNotification= NotificationFactory.getNotification("PUSH","Weeding Invitation!");
        pushNotification.notifyMe();
        pushNotification.notifyGroup();
        pushNotification.logNotifications();
    }
}
