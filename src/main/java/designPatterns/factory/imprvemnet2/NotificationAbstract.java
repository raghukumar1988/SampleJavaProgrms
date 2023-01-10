package designPatterns.factory.imprvemnet2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class NotificationAbstract implements Notification {

    String type;

    NotificationAbstract(String type) {
        this.type = type;
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
