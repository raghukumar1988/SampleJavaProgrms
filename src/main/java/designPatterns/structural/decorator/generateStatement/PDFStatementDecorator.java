package designPatterns.structural.decorator.generateStatement;

public class PDFStatementDecorator extends AccountStatementDecorator {
    public PDFStatementDecorator(AccountStatementGenerator generator) {
        super(generator);
    }

    @Override
    public void generate() {
        super.generate();
        generatePDF();
    }

    private void generatePDF() {
        System.out.println("Generating PDF account statement...");
    }
}
