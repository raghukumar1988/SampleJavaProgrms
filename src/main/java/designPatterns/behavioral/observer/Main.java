package designPatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarketImpl();

        StockTrader trader1 = new StockTraderImpl("Trader 1");
        StockTrader trader2 = new StockTraderImpl("Trader 2");
        StockTrader trader3 = new StockTraderImpl("Trader 3");

        stockMarket.register(trader1);
        stockMarket.register(trader2);
        stockMarket.register(trader3);

        stockMarket.setStockPrices(150.0, 300.0);

        stockMarket.unregister(trader2);

        stockMarket.setStockPrices(155.0, 305.0);
    }
}
