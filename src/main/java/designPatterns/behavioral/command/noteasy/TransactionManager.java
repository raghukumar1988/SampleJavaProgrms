package designPatterns.behavioral.command.noteasy;

import java.util.Stack;

public class TransactionManager {
    private Stack<TransactionCommand> commandHistory = new Stack<>();

    public void executeTransaction(TransactionCommand command) {
        command.execute();
        commandHistory.push(command);
    }

    public void undoLastTransaction() {
        if (!commandHistory.isEmpty()) {
            TransactionCommand lastCommand = commandHistory.pop();
            lastCommand.undo();
        }
    }
}
