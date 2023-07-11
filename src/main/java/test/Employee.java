package test;

import lombok.ToString;

@ToString
public class Employee {
    private final String name;
    private final String dept;
    private final String gender;
    private final String dob;
    private final boolean isActive;

    private Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.dept = employeeBuilder.dept;
        this.gender = employeeBuilder.gender;
        this.dob = employeeBuilder.dob;
        this.isActive = employeeBuilder.isActive;
    }

    public static class EmployeeBuilder {
        private final String name;
        private final String dept;
        private final String gender;
        private String dob;
        private boolean isActive;

        public EmployeeBuilder(String name, String dept, String gender) {
            this.name = name;
            this.dept = dept;
            this.gender = gender;
        }

        public EmployeeBuilder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public EmployeeBuilder setActive(boolean active) {
            isActive = active;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
