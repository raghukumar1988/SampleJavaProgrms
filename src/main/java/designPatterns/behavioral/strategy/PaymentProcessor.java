package designPatterns.behavioral.strategy;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    // using setter - original
   /* public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }*/

    // using constructor
    public PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void processPayment(double amount) {
        // Perform any necessary payment validation or processing logic
        paymentStrategy.pay(amount);
    }
}
