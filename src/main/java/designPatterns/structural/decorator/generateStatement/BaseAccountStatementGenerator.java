package designPatterns.structural.decorator.generateStatement;

public class BaseAccountStatementGenerator implements AccountStatementGenerator {
    @Override
    public void generate() {
        System.out.println("Generating base account statement...");
    }
}
