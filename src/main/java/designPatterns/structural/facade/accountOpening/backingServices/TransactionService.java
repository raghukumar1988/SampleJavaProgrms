package designPatterns.structural.facade.accountOpening.backingServices;

import designPatterns.structural.facade.accountOpening.model.Transaction;

public class TransactionService {
    public void performTransaction(Transaction transaction) {
        // Perform the transaction
        System.out.println("Performing transaction: " + transaction.getDescription());
    }
}
