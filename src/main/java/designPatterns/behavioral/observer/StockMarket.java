package designPatterns.behavioral.observer;

public interface StockMarket {
    void register(StockTrader observer);
    void unregister(StockTrader observer);
    void notifyObservers();
    void setStockPrices(double appleStockPrice, double microsoftStockPrice);
}
