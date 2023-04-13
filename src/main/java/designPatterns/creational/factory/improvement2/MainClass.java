package designPatterns.creational.factory.improvement2;

public class MainClass {
    public static void main(String[] args) {
        Notification smsNotification= NotificationFactory.getNotification("SMS","Good Morning!");
        smsNotification.notifyMe();
        Notification emailNotification= NotificationFactory.getNotification("EMAIL","Regarding annual Bonus");
        emailNotification.notifyMe();
        Notification pushNotification= NotificationFactory.getNotification("PUSH","Wedding Invitation");
        pushNotification.notifyMe();
    }
}
