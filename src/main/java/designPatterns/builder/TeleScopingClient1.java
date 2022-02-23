package designPatterns.builder;

public class TeleScopingClient1 {
    public static void main(String[] args) {
        EmployeeTeleScoping1 employeeTeleScoping = new EmployeeTeleScoping1("Raghu","Rajamani",45,466,"4561234","Arivu Street","raghu@gmail.com");
        System.out.println(employeeTeleScoping);
        EmployeeTeleScoping1 employeeTeleScoping2 = new EmployeeTeleScoping1("Raghu","Rajamani",45,466,"4561234","Arivu Street");
        System.out.println(employeeTeleScoping2);
        EmployeeTeleScoping1 employeeTeleScoping3 = new EmployeeTeleScoping1("Raghu","Rajamani",45,466,"4561234");
        System.out.println(employeeTeleScoping3);



    }
}
