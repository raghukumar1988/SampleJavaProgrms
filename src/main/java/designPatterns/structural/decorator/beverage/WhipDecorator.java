package designPatterns.structural.decorator.beverage;

public class WhipDecorator extends BeverageDecorator {
    public WhipDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7; // Additional cost for whipped cream
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Whip"; // Additional description
    }
}
