package designPatterns.behavioral.command.noteasy;

public interface TransactionCommand {
    void execute();
    void undo();
}
