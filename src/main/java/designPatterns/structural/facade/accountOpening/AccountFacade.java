package designPatterns.structural.facade.accountOpening;

import designPatterns.structural.facade.accountOpening.backingServices.AccountCreationService;
import designPatterns.structural.facade.accountOpening.backingServices.AccountDetailsService;
import designPatterns.structural.facade.accountOpening.backingServices.AccountUpdateService;
import designPatterns.structural.facade.accountOpening.backingServices.TransactionService;
import designPatterns.structural.facade.accountOpening.model.Account;
import designPatterns.structural.facade.accountOpening.model.Customer;
import designPatterns.structural.facade.accountOpening.model.Transaction;

public class AccountFacade {
    private AccountCreationService accountCreationService;
    private AccountDetailsService accountDetailsService;
    private AccountUpdateService accountUpdateService;
    private TransactionService transactionService;

    public AccountFacade() {
        accountCreationService = new AccountCreationService();
        accountDetailsService = new AccountDetailsService();
        accountUpdateService = new AccountUpdateService();
        transactionService = new TransactionService();
    }

    public String createAccount(Customer customer) {
        return accountCreationService.createAccount(customer);
    }

    public Account getAccountDetails(String accountNumber) {
        return accountDetailsService.getAccountDetails(accountNumber);
    }

    public void updateAccountDetails(Account account) {
        accountUpdateService.updateAccountDetails(account);
    }

    public void performTransaction(Transaction transaction) {
        transactionService.performTransaction(transaction);
    }
}
