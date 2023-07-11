package designPatterns.structural.decorator.generateStatement;

public class CSVStatementDecorator extends AccountStatementDecorator {
    public CSVStatementDecorator(AccountStatementGenerator generator) {
        super(generator);
    }

    @Override
    public void generate() {
        super.generate();
        generateCSV();
    }

    private void generateCSV() {
        System.out.println("Generating CSV account statement...");
    }
}
