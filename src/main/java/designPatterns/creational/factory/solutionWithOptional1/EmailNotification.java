package designPatterns.creational.factory.solutionWithOptional1;

public class EmailNotification implements Notification{
    @Override
    public void notifyMe() {
        System.out.println("Sending Email Notification");
    }
}
