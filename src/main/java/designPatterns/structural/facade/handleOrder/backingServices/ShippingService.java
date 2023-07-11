package designPatterns.structural.facade.handleOrder.backingServices;

import designPatterns.structural.facade.handleOrder.Order;

public class ShippingService {
    public void shipOrder(Order order) {
        // Implement shipping logic
        System.out.println("Order shipped: " + order.getOrderNumber());
    }
}
