package designPatterns.structural.decorator.generateStatement;

public abstract class AccountStatementDecorator implements AccountStatementGenerator {
    protected AccountStatementGenerator generator;

    public AccountStatementDecorator(AccountStatementGenerator generator) {
        this.generator = generator;
    }

    @Override
    public void generate() {
        generator.generate();
    }
}
