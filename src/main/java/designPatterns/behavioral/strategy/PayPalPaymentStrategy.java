package designPatterns.behavioral.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    private String email;
    private String password;

    public PayPalPaymentStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void pay(double amount) {
        // Implementation of PayPal payment
        System.out.println("Paid $" + amount + " via PayPal.");
    }
}