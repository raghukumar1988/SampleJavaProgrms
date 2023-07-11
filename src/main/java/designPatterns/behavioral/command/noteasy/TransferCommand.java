package designPatterns.behavioral.command.noteasy;

public class TransferCommand implements TransactionCommand {
    private Account sourceAccount;
    private Account destinationAccount;
    private double amount;

    public TransferCommand(Account sourceAccount, Account destinationAccount, double amount) {
        this.sourceAccount = sourceAccount;
        this.destinationAccount = destinationAccount;
        this.amount = amount;
    }

    @Override
    public void execute() {
        sourceAccount.withdraw(amount);
        destinationAccount.deposit(amount);
    }

    @Override
    public void undo() {
        destinationAccount.withdraw(amount);
        sourceAccount.deposit(amount);
    }
}
