package designPatterns.structural.adapter.paymentGateway.extrenalGatways;

public class StripePaymentProcessor {
    public void makePayment(double amount) {
        System.out.println("Processing Stripe payment of $" + amount);
        // Implement Stripe payment processing logic
    }
}
