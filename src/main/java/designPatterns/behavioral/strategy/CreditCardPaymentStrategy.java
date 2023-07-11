package designPatterns.behavioral.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cvv;

    public CreditCardPaymentStrategy(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public void pay(double amount) {
        // Implementation of credit card payment using CardNumber and cvv
        System.out.println("Paid $" + amount + " via Credit Card.");
    }
}