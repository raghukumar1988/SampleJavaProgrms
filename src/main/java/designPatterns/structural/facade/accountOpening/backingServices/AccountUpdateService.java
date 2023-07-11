package designPatterns.structural.facade.accountOpening.backingServices;

import designPatterns.structural.facade.accountOpening.model.Account;

public class AccountUpdateService {
    public void updateAccountDetails(Account account) {
        // Update account details in database or storage
        System.out.println("Updating account details for account number: " + account.getAccountNumber());
        // Perform the update operation
    }
}
