package java8features.streams31.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeModel {

    private long id;
    private String name;
    private int age;
    private double salary;


}