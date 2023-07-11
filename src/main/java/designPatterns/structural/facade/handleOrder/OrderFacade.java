package designPatterns.structural.facade.handleOrder;

import designPatterns.structural.facade.handleOrder.backingServices.InventoryManagement;
import designPatterns.structural.facade.handleOrder.backingServices.OrderValidation;
import designPatterns.structural.facade.handleOrder.backingServices.PaymentProcessing;
import designPatterns.structural.facade.handleOrder.backingServices.ShippingService;

public class OrderFacade {
    private OrderValidation orderValidation;
    private PaymentProcessing paymentProcessing;
    private InventoryManagement inventoryManagement;
    private ShippingService shippingService;

    public OrderFacade() {
        orderValidation = new OrderValidation();
        paymentProcessing = new PaymentProcessing();
        inventoryManagement = new InventoryManagement();
        shippingService = new ShippingService();
    }

    public void processOrder(Order order) {
        if (orderValidation.validateOrder(order)) {
            paymentProcessing.processPayment(order);
            inventoryManagement.updateInventory(order);
            shippingService.shipOrder(order);
            System.out.println("Order processed successfully.");
        } else {
            System.out.println("Order validation failed. Unable to process the order.");
        }
    }
}
