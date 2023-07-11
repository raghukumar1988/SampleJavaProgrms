package designPatterns.structural.facade.accountOpening;

import designPatterns.structural.facade.accountOpening.model.Account;
import designPatterns.structural.facade.accountOpening.model.Customer;

public class Main {
    public static void main(String[] args) {
        AccountFacade accountFacade = new AccountFacade();

        Customer customer = new Customer("John Doe", "john.doe@example.com");
        String accountNumber = accountFacade.createAccount(customer);
        Account account = accountFacade.getAccountDetails(accountNumber);

        // Perform account-related operations
        // ...
    }
}
