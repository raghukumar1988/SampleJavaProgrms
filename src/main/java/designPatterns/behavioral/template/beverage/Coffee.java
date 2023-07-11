package designPatterns.behavioral.template.beverage;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing coffee");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding coffee grounds");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
}
