package designPatterns.builder;

public class Employee3 {

    /*First of all, you need to create a public static nested class, which has all the instance attributes from the outer class.
The naming convention for Builder usually is that and if the class name is Employee, then the builder class should be named as EmployeeBuilder.
The outer class Employee should have a 'private constructor' that takes a EmployeeBuilder object as its argument.
The builder class should have a 'public constructor' with all the required attributes as parameters and these required attributes are defined as "final".
The optional parameters which have setter methods to set the values. It should return the 'same Builder object' after setting the optional attribute.
The final step is to provide a build() method in the builder class that will return the outer class object to the client.
This build() method will call the private constructor in the outer class, passing the Builder object itself as the parameter to this private constructor.

The Employee class has only getter methods and 'no public constructor'.
So, the only way to get an Employee object is through the nested EmpolyeeBuilder class.*/


    private final String firstName;    //required
    private final String lastName;    //required
    private final int age;    //required
    private final int personalId; // required
    private final String phone;    //optional
    private final String address;    //optional
    private final String mail;    //optional

    public Employee3(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.personalId = builder.personalId;
        this.phone = builder.phone;
        this.address = builder.address;
        this.mail = builder.mail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getPersonalId() {
        return personalId;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", personalId=" + personalId +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public static class EmployeeBuilder{

        private final String firstName;    //required - can be final
        private final String lastName;    //required
        private final  int age;    //required
        private  final int personalId; // required
        private  String phone;    //optional
        private  String address;    //optional
        private  String mail;    //optional

        public EmployeeBuilder(String firstName,String lastName,int age,int personalId){
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
            this.personalId=personalId;
        }

        public EmployeeBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder setMail(String mail) {
            this.mail = mail;
            return this;
        }

        public Employee3 build(){
            // call the private constructor in the outer class
            return new Employee3(this);
        }
    }
}
