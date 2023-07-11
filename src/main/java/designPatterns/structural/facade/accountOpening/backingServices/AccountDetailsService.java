package designPatterns.structural.facade.accountOpening.backingServices;


import designPatterns.structural.facade.accountOpening.model.Account;

public class AccountDetailsService {
    public Account getAccountDetails(String accountNumber) {
        // Retrieve account details from database or storage
        System.out.println("Retrieving account details for account number: " + accountNumber);
        // Return account object with details
        return new Account();
    }
}
