package designPatterns.builder.normalway3;

public class EmployeeBuilderClient3 {
    public static void main(String[] args) {

        Employee3 employee= new Employee3.EmployeeBuilder("Raghu","Rajamani",96,446222).build();
        System.out.println(employee);

        Employee3 employe1= new Employee3.EmployeeBuilder("Raghu","Rajamani",96,446222)
                .setAddress("Arivusteet")
                .build();
        System.out.println(employe1);

        Employee3 employee3 = new Employee3.EmployeeBuilder("Cristiano", "Ronaldo", 33, 7)
                .setPhone("0045-1234556")
                .setAddress("Arivusteet")
                .setMail("raghu@gmail.com").build();
        System.out.println(employee3);
    }

}
