package designPatterns.builder.frombealdungeasy;

public class BuilderMain {
    public static void main(String[] args) {
    BankAccount bankAccount= new BankAccount.BankAccountBuilder("Raghu","12345678")
            .addEmail("testemail@gmail.com")
            .addSubStatus(true)
            .build();
        System.out.println( bankAccount.getAccountNumber());
        System.out.println( bankAccount.getName());
        System.out.println( bankAccount.getEmail());
        System.out.println( bankAccount.isSubscribedToNewsletter());
   ;

    }

}
