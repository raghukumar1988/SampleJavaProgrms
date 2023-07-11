package java8features.streamPractical32.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeObject {

    private int empId;
    private String empName;
    private int age;
    private String gender;
    private String department;
    private int doj;
    private double salary;

}
