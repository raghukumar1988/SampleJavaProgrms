package java8features.streams3.model;

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