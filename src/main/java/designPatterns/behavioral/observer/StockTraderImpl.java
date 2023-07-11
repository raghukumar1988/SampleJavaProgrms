package designPatterns.behavioral.observer;

public class StockTraderImpl implements StockTrader {
    private String name;

    public StockTraderImpl(String name) {
        this.name = name;
    }

    @Override
    public void update(double appleStockPrice, double microsoftStockPrice) {
        System.out.println(name + " received update:");
        System.out.println("Apple stock price: $" + appleStockPrice);
        System.out.println("Microsoft stock price: $" + microsoftStockPrice);
        System.out.println();
    }
}
