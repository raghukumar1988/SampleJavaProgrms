package designPatterns.structural.adapter.paymentGateway.adapters;

import designPatterns.structural.adapter.paymentGateway.PaymentGateway;
import designPatterns.structural.adapter.paymentGateway.extrenalGatways.PayPalPaymentProcessor;

public class PayPalAdapter implements PaymentGateway {
    private PayPalPaymentProcessor paymentProcessor;

    public PayPalAdapter(PayPalPaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        paymentProcessor.sendPayment(amount);
    }
}
