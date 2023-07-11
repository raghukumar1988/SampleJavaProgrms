package designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarketImpl implements StockMarket {
    private List<StockTrader> observers = new ArrayList<>();
    private double appleStockPrice;
    private double microsoftStockPrice;

    @Override
    public void setStockPrices(double appleStockPrice, double microsoftStockPrice) {
        this.appleStockPrice = appleStockPrice;
        this.microsoftStockPrice = microsoftStockPrice;
        notifyObservers();
    }

    @Override
    public void register(StockTrader observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(StockTrader observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (StockTrader observer : observers) {
            observer.update(appleStockPrice, microsoftStockPrice);
        }
    }
}
