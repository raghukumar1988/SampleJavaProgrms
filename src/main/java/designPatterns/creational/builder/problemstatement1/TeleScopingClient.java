package designPatterns.creational.builder.problemstatement1;

public class TeleScopingClient {
    public static void main(String[] args) {
        EmployeeTeleScoping employeeTeleScoping = new EmployeeTeleScoping("Raghu","Rajamani",45,466,"4561234","Arivu Street","raghu@gmail.com");
        System.out.println(employeeTeleScoping);
        EmployeeTeleScoping employeeTeleScoping2 = new EmployeeTeleScoping("Raghu","Rajamani",45,466,"4561234","Arivu Street");
        System.out.println(employeeTeleScoping2);
        EmployeeTeleScoping employeeTeleScoping3 = new EmployeeTeleScoping("Raghu","Rajamani",45,466,"4561234");
        System.out.println(employeeTeleScoping3);



    }
}
