package designPatterns.creational.factory.improvement2;

public class NotificationFactory {
public static Notification getNotification(String  notificationTYpe,String type){
    if(notificationTYpe ==null || notificationTYpe.isEmpty()){
        return  null;
    }
    switch(notificationTYpe){
        case "SMS":
        {
            return new SMSNotification(type);
        }
        case "EMAIL":
        {
            return  new EmailNOtification(type);
        }
        case "PUSH":
        {
            return  new PushNotification(type);
        }
        default:
        {
            return null;
        }
    }
}
}
