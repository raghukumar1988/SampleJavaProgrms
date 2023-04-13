package designPatterns.creational.factory;

public class NotificationFactory {
public static Notification getNotification(String  notificationTYpe){
    if(notificationTYpe ==null || notificationTYpe.isEmpty()){
        return  null;
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
            return null;
        }
    }
}
}
