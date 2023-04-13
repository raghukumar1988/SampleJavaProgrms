package designPatterns.creational.builder.problemstatement1;

/* Must go - https://howtodoinjava.com/design-patterns/creational/builder-pattern-in-java/
https://howtodoinjava.com/lombok/lombok-builder-annotation/*/
/* Uses:
        The builder pattern is a good choice when designing classes whose constructors or static factories
        would have more than a handful of parameters.
        In other terms builder pattern allows to AVOID telescopic constructors
        when we want to build objects with multiple parameters.  */

/*  Drawbacks:
        As developers, we offer a solution for clients to construct objects from the EmployeeTeleScoping class.
        But, clients may return with a bunch of questions for us, including:

        - Which constructor should I invoke? The one with four parameters or the one with five or six?
        - What is the default value for those optional parameters if I don-t pass a value for each?
        - If I want to pass values only for mail and phone but not for address, how can I fulfill this requirement?
        - What will happen if I mistakenly pass the value intended for the address to mail (compile may not complain about it because they have the same type)?*/


public class EmployeeTeleScoping {
    private final String firstName; //required
    private final String lastName;  //required
    private final int age;          //required
    private final int personalId;   //required
    private final String phone;     //optional
    private final String address;   //optional
    private final String mail;      //optional
    //default constructor needs to be added manually
    public EmployeeTeleScoping(String firstName, String lastName, int age, int personalId) {
        this(firstName, lastName, age, personalId, "", "");
    }

    public EmployeeTeleScoping(String firstName, String lastName, int age, int personalId, String phone) {
        this(firstName, lastName, age, personalId, phone, "");
    }

    public EmployeeTeleScoping(String firstName, String lastName, int age, int personalId, String phone, String address) {
        this(firstName, lastName, age, personalId, phone, address, "");
    }

    public EmployeeTeleScoping(String firstName, String lastName, int age, int personalId, String phone, String address, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.personalId = personalId;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "EmployeeTeleScoping{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personalId=" + personalId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}


   /* MUST go -> https://dzone.com/articles/the-builder-pattern-for-class-with-many-constructo*/
