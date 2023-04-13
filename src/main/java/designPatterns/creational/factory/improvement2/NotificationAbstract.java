package designPatterns.creational.factory.improvement2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class NotificationAbstract implements Notification {
    // declaring  variable in Abstract class make this variable available for all extended classes.
    // code re-usability or clean code
     String notificationMessage;

    NotificationAbstract(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

}
