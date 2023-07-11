package designPatterns.structural.facade.handleOrder.backingServices;

import designPatterns.structural.facade.handleOrder.Order;

public class InventoryManagement {
    public void updateInventory(Order order) {
        // Implement inventory management logic
        System.out.println("Inventory updated for order: " + order.getOrderNumber());
    }
}
