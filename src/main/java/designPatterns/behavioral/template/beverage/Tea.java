package designPatterns.behavioral.template.beverage;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping tea leaves");
    }

    @Override
    protected void addIngredients() {
        System.out.println("Adding tea leaves");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }

    @Override
    protected boolean customerWantsCondiments() {
        // Overriding the hook method to customize behavior
        return false;
    }
}
