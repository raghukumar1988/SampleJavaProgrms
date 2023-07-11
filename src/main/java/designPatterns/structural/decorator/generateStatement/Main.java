package designPatterns.structural.decorator.generateStatement;

public class Main {
    public static void main(String[] args) {
        AccountStatementGenerator baseGenerator = new BaseAccountStatementGenerator();
        baseGenerator.generate();

        AccountStatementGenerator pdfGenerator = new PDFStatementDecorator(baseGenerator);
        pdfGenerator.generate();

        AccountStatementGenerator csvGenerator = new CSVStatementDecorator(baseGenerator);
        csvGenerator.generate();

        AccountStatementGenerator pdfAndCSVGenerator = new PDFStatementDecorator(new CSVStatementDecorator(baseGenerator));
        pdfAndCSVGenerator.generate();
    }
}
