package AATest;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Employee {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String address;
    private final  String  email;

    Employee(EmployeeBuilder employeeBuilder){
     this.firstName= employeeBuilder.firstName;
     this.lastName= employeeBuilder.lastName;
     this.address= employeeBuilder.address;
     this.age= employeeBuilder.age;
     this.email = employeeBuilder.email;
    }



     public static class EmployeeBuilder{

         private final String firstName;
         private final String lastName;
         private final int age;
         private String address;
         private String  email;

         EmployeeBuilder(String firstName,String lastname, int age){
             this.firstName= firstName;
             this.lastName=lastname;
             this.age=age;
         }
         public EmployeeBuilder setAddress(String address){
             this.address=address;
             return this;
         }

         public EmployeeBuilder setEmail(String email){
             this.email= email;
             return this;
         }
         public Employee build(){
             return new Employee(this);
         }

     }

}
