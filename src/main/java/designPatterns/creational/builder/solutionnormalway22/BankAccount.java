package designPatterns.creational.builder.solutionnormalway22;

import lombok.Getter;

@Getter
public class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String email;
    private final boolean isSubscribedToNewsletter;

    private BankAccount(BankAccountBuilder builder){
        this.accountNumber=builder.accountNumber;
        this.name=builder.name;
        this.email= builder.email;
        this.isSubscribedToNewsletter= builder.isSubscribedToNewsletter;

    }

    public static class BankAccountBuilder{

        private final String name;
        private final String accountNumber;
        private String email;
        private boolean isSubscribedToNewsletter;

        public BankAccountBuilder(String name,String accountNumber){
            this.accountNumber=accountNumber;
            this.name=name;
        }

        public BankAccountBuilder addEmail(String email){
            this.email= email;
            return this;
        }

        public BankAccountBuilder addSubStatus(boolean isSubscribedToNewsletter){
            this.isSubscribedToNewsletter= isSubscribedToNewsletter;
            return this;
        }

        public BankAccount build(){
            return new BankAccount(this);
        }


    }
}
