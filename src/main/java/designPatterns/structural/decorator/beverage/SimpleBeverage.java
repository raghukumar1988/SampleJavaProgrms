package designPatterns.structural.decorator.beverage;

public class SimpleBeverage implements Beverage {
    @Override
    public double getCost() {
        return 2.0; // Base cost of the beverage
    }

    @Override
    public String getDescription() {
        return "Simple Beverage";
    }
}
