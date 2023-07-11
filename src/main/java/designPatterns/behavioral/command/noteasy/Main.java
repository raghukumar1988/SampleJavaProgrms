package designPatterns.behavioral.command.noteasy;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("123456789", 1000.0);
        Account account2 = new Account("987654321", 500.0);
        TransactionManager transactionManager = new TransactionManager();

        TransactionCommand depositCommand = new DepositCommand(account1, 500.0);
        TransactionCommand withdrawCommand = new WithdrawCommand(account1, 200.0);
        TransactionCommand transferCommand = new TransferCommand(account1, account2, 300.0);

        transactionManager.executeTransaction(depositCommand);
        transactionManager.executeTransaction(withdrawCommand);
        transactionManager.executeTransaction(transferCommand);

        transactionManager.undoLastTransaction();
        transactionManager.undoLastTransaction();
        transactionManager.undoLastTransaction();
    }
}
