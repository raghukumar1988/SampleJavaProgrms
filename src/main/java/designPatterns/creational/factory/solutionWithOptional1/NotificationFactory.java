package designPatterns.creational.factory.solutionWithOptional1;

import java.util.Optional;

public class NotificationFactory {

    public static Optional<Notification> getNotificationInstance(String notificationType){
        if(null ==notificationType|| notificationType.isEmpty()){
            return Optional.empty();
        }
        switch(notificationType){
            case "SMS":{
                return Optional.of(new SMSNotification());
            }
            case "EMAIL":{
                return Optional.of(new EmailNotification());
            }
            case "PUSH":{
                return Optional.of(new PushNotification());
            }
            default:
                return Optional.empty();

        }

    }
}
