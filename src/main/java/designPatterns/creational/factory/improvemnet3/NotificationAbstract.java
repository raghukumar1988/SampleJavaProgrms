package designPatterns.creational.factory.improvemnet3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class NotificationAbstract implements Notification {

    String notificationMessage;

    NotificationAbstract(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    @Override
    public void notifyGroup() {
        System.out.println("Common base implementation to notify Group");
    }

    @Override
    public void logNotifications() {
        System.out.println("Base implementation for logger implementation");
    }




}
