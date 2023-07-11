package designPatterns.structural.adapter.paymentGateway.adapters;

import designPatterns.structural.adapter.paymentGateway.PaymentGateway;
import designPatterns.structural.adapter.paymentGateway.extrenalGatways.StripePaymentProcessor;

public class StripeAdapter implements PaymentGateway {
    private StripePaymentProcessor paymentProcessor;

    public StripeAdapter(StripePaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        paymentProcessor.makePayment(amount);
    }
}
