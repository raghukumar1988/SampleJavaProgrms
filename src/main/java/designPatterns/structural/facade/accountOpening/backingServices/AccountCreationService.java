package designPatterns.structural.facade.accountOpening.backingServices;

import designPatterns.structural.facade.accountOpening.model.Customer;

import java.util.UUID;

public class AccountCreationService {
    public String createAccount(Customer customer) {
        // Implement account creation logic
        String accountNumber = generateAccountNumber();
        System.out.println("Account created for customer: " + customer.getName() + " with account number: " + accountNumber);
        return accountNumber;
    }

    private String generateAccountNumber() {
        // Generate a unique account number
        return "ACC-" + UUID.randomUUID().toString();
    }
}
