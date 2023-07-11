package designPatterns.behavioral.strategy;

public class PaymentStrategyClient {
    public static void main(String[] args) {
        // Original Implementation
       /* PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Process payment via credit card
        paymentProcessor.setPaymentStrategy(new CreditCardPaymentStrategy("1234567890", "123"));
        paymentProcessor.processPayment(100.0);

        // Process payment via PayPal
        paymentProcessor.setPaymentStrategy(new PayPalPaymentStrategy("user@example.com", "password"));
        paymentProcessor.processPayment(50.0);*/


        // constructor approach
        PaymentProcessor paymentProcessor= new PaymentProcessor(new CreditCardPaymentStrategy("122345","123"));
        paymentProcessor.processPayment(100.0);

        paymentProcessor= new PaymentProcessor(new PayPalPaymentStrategy("user@example.com", "password"));
        paymentProcessor.processPayment(50.0);






    }
}
