package designPatterns.structural.adapter.paymentGateway.extrenalGatways;

public class PayPalPaymentProcessor {
    public void sendPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        // Implement PayPal payment processing logic
    }
}
