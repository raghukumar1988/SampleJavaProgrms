package designPatterns.creational.builder.byusinglombok;

import lombok.Builder;

@Builder
//@Getter
//@ToString
public class Employee {

    private final String firstName;    //required
    private final String lastName; // required
    private final int age;    //required
    private final int personalId; // required
    private final String phone;    //optional
    private final String address;    //optional
    private final String mail;    //optional
}
