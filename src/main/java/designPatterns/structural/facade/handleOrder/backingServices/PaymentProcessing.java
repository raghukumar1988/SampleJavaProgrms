package designPatterns.structural.facade.handleOrder.backingServices;

import designPatterns.structural.facade.handleOrder.Order;

public class PaymentProcessing {
    public void processPayment(Order order) {
        // Implement payment processing logic
        System.out.println("Payment processed for order: " + order.getOrderNumber());
    }
}
