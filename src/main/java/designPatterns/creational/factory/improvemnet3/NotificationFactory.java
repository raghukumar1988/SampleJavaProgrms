package designPatterns.creational.factory.improvemnet3;

public class NotificationFactory {
public static Notification getNotification(String  notificationTYpe, String message){
    if(notificationTYpe ==null || notificationTYpe.isEmpty()){
        return  null;
    }
    switch(notificationTYpe){
        case "SMS":
        {
            return new SMSNotification(message);
        }
        case "EMAIL":
        {
            return  new EmailNOtification(message);
        }
        case "PUSH":
        {
            return  new PushNotification(message);
        }
        default:
        {
            return null;
        }
    }
}
}
