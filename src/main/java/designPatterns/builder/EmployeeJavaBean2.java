package designPatterns.builder;

/* Drawbacks:
    It is no surprise that the JavaBean pattern increases the readability of code and the flexibility of object construction.
         But, this solution has two big disadvantages:
         - the first one is that the object state will be inconsistent unless all the attributes are set explicitly;
         - the second one is that the JavaBean pattern makes a class mutable and requires extra efforts of developers to ensure thread safety.

        Note: the final modifier has to be removed when using the JavaBean Pattern.


Now we come to the third alternative solution: The Builder Pattern.
The builder pattern takes the advantages of the safety of telescoping constructor pattern and readability of JavaBean pattern. */

public class EmployeeJavaBean2 {
    private  String firstName;  //required
    private  String lastName;   //required
    private  int age;           //required
    private  int personalId;    //required
    private  String phone;      //optional
    private  String address;    //optional
    private  String mail;       //optional

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "EmployeeJavaBean{" +
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
