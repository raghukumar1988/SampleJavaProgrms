package designPatterns.factory.improvement1;

public class EmailNOtification extends NotificationAbstract {
    EmailNOtification(String type) {
        super(type);
    }

    @Override
    public void notifyMe() {
        System.out.println("Sending email Notification with type.. " +type);
    }
}
