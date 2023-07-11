package designPatterns.structural.adapter.paymentGateway;

import designPatterns.structural.adapter.paymentGateway.adapters.PayPalAdapter;
import designPatterns.structural.adapter.paymentGateway.adapters.StripeAdapter;
import designPatterns.structural.adapter.paymentGateway.extrenalGatways.PayPalPaymentProcessor;
import designPatterns.structural.adapter.paymentGateway.extrenalGatways.StripePaymentProcessor;

public class Main {
    public static void main(String[] args) {
        PaymentProcessingSystem paymentSystem = new PaymentProcessingSystem();

        PayPalPaymentProcessor payPalPaymentProcessor = new PayPalPaymentProcessor();
        PaymentGateway payPalAdapter = new PayPalAdapter(payPalPaymentProcessor);
        paymentSystem.setPaymentGateway(payPalAdapter);
        paymentSystem.processPayment(100.0);

        StripePaymentProcessor stripePaymentProcessor = new StripePaymentProcessor();
        PaymentGateway stripeAdapter = new StripeAdapter(stripePaymentProcessor);
        paymentSystem.setPaymentGateway(stripeAdapter);
        paymentSystem.processPayment(200.0);
    }
}
