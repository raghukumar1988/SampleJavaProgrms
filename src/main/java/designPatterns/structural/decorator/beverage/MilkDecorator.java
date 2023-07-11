package designPatterns.structural.decorator.beverage;

public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Additional cost for milk
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk"; // Additional description
    }
}
