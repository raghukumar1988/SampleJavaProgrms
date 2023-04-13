package designPatterns.creational.factory.solutionWithOptional1;


import java.util.Optional;

public class MainClass {
    public static void main(String[] args) {
        Optional<Notification> smsNotification= NotificationFactory.getNotificationInstance("SMS");
        smsNotification.ifPresent(Notification::notifyMe);
        Optional<Notification> emailNotification= NotificationFactory.getNotificationInstance("EMAIL");
        emailNotification.ifPresent(Notification::notifyMe);
        Optional<Notification> pushNotification= NotificationFactory.getNotificationInstance("PUSH");
        pushNotification.ifPresent(Notification::notifyMe);
    }
}
