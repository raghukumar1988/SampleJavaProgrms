package designPatterns.structural.decorator.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage simpleBeverage = new SimpleBeverage();
        System.out.println("Cost: " + simpleBeverage.getCost());
        System.out.println("Description: " + simpleBeverage.getDescription());

        Beverage milkBeverage = new MilkDecorator(simpleBeverage);
        System.out.println("Cost: " + milkBeverage.getCost());
        System.out.println("Description: " + milkBeverage.getDescription());

        Beverage whipMilkBeverage = new WhipDecorator(milkBeverage);
        System.out.println("Cost: " + whipMilkBeverage.getCost());
        System.out.println("Description: " + whipMilkBeverage.getDescription());
    }
}
