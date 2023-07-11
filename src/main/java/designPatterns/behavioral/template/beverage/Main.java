package designPatterns.behavioral.template.beverage;

public class Main {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        coffee.prepareBeverage();
        System.out.println();

        Beverage tea = new Tea();
        tea.prepareBeverage();
    }
}
