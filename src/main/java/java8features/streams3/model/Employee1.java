package java8features.streams3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee1 {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String dept;
    private int doj;
    private double salary;
}

