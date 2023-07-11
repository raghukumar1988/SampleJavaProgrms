package designPatterns.structural.facade.accountOpening.model;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
