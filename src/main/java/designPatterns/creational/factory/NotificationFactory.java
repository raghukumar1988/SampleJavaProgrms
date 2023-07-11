package designPatterns.creational.factory;

public class NotificationFactory {
public static Notification getNotification(String  notificationTYpe) throws UnknownNotificationException {
    if(notificationTYpe ==null || notificationTYpe.isEmpty()){
        //return  null;
        throw new UnknownNotificationException("Unknown Type");
    }
    switch(notificationTYpe){
        case "SMS":
        {
            return new SMSNotification();
        }
        case "EMAIL":
        {
            return  new EmailNOtification();
        }
        case "PUSH":
        {
            return  new PushNotification();
        }
        default:
        {
            //return null;
            throw new UnknownNotificationException("Unknown Notification Type..");
        }
    }
}
}
