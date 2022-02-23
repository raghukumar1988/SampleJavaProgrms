package designPatterns.builder;

public class JavaBeanClient2 {
    public static void main(String[] args) {
        EmployeeJavaBean2 employeeJavaBean = new EmployeeJavaBean2();
        System.out.println(employeeJavaBean);
        employeeJavaBean.setAddress("Arivu Street");
        employeeJavaBean.setAge(33);
        employeeJavaBean.setFirstName("Raghu");
        employeeJavaBean.setLastName("Rajamani");

        System.out.println(employeeJavaBean);
    }
}
