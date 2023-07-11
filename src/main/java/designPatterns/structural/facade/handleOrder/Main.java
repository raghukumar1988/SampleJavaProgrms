package designPatterns.structural.facade.handleOrder;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();

        Order order = new Order();
        order.setOrderNumber(3425265);
        orderFacade.processOrder(order);
    }
}
