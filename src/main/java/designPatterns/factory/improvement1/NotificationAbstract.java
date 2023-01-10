package designPatterns.factory.improvement1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class NotificationAbstract implements Notification {

    String type;

    NotificationAbstract(String type) {
        this.type = type;
    }

}
