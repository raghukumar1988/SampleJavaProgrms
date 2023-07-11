package designPatterns.behavioral.template.beverage;

public abstract class Beverage {
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addIngredients();
        if (customerWantsCondiments()) {
            addCondiments();
        }
        serve();
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    protected abstract void addIngredients();

    protected boolean customerWantsCondiments() {
        return true;
    }

    protected abstract void addCondiments();

    private void serve() {
        System.out.println("Serving beverage");
    }
}
