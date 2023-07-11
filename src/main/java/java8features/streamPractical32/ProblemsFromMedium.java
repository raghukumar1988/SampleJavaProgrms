package java8features.streamPractical32;

import java8features.CommonUtils;
import java8features.streamPractical32.model.EmployeeObject;

import java.util.*;
import java.util.stream.Collectors;

public class ProblemsFromMedium {
    public static void main(String[] args) {
        List<EmployeeObject> employeeObjectList = CommonUtils.getStubbedEmployeeList();

        //Calculate How many people work in each department

         /*  Here we are using Collectors to collect the count of Employee and
         groupBy function to group the count based in the Department.
         We are then storing the result in Map as the Department as a Key value and
         the Count as the Value.*/
        Map<String, Long> departmentCount = employeeObjectList.stream()
                .collect(Collectors.groupingBy(EmployeeObject::getDepartment, Collectors.counting()));
        for (Map.Entry<String, Long> entry : departmentCount.entrySet())
            System.out.println(entry.getKey() + " : " + entry.getValue());
        //departmentCount.forEach((k,v) -> System.out.println("Department = " + k + " : Headcount = " + v));
        System.out.println("##########################################################################################");

        //What is each department’s average pay
        /* Here we a re asked to average the pay of all employees based on Department.
           So again, we are using GroupBy function to group Employees based on their Department and Calculating the average of their Salary using Collectors.
           We are then using Map to save the data, using Department name as Key value and salary average as Value.*/

        Map<String, Double> departmentAvgSalary= employeeObjectList.stream()
                        .collect(Collectors.groupingBy(EmployeeObject::getDepartment, Collectors.averagingDouble(EmployeeObject::getSalary)));
        for (Map.Entry<String, Double> entry : departmentAvgSalary.entrySet())
            System.out.println(entry.getKey()+" : "+entry.getValue());

        //departmentAvgSalary.forEach((k,v)-> System.out.println("Department = " + k + "|  Avg Salary = " + v));
        System.out.println("##########################################################################################");

        //Find out the youngest male position in Development department
        /*Here we are using the Optional Class to get the details of the Employee.
        We are filtering the Employee based on Gender and Department as we are asked to
        find the youngest Male Employee from Development Department and then
        we are finding the Youngest Male Employee by Comparing the age of all using the Comparator Interface.*/

        Optional<EmployeeObject> youngEmployee=
                employeeObjectList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Development")
                        .min(Comparator.comparingInt(EmployeeObject::getAge));
        EmployeeObject youngMaleEmployee = youngEmployee.get();
        System.out.println("ID : "+youngMaleEmployee.getEmpId());
        System.out.println("Name : "+youngMaleEmployee.getEmpName());
        System.out.println("##########################################################################################");


        /*  Who has the most work experience within the company?
                Here we are trying to find the Most senior Perison based in their Joining Data.
                So here using Comparator to sort the Employees based on their Joining data. By default it is sorted in, ascending order.
                Finally getting the first employee as the most experienced professional from the Company.*/

        Optional<EmployeeObject> mostSeniorEmployee =
                employeeObjectList.stream().sorted(Comparator.comparingInt(EmployeeObject::getDoj))
                        .findFirst();
        EmployeeObject oneSeniorEmployee = mostSeniorEmployee.get();
        System.out.println("ID : "+oneSeniorEmployee.getEmpId());
        System.out.println("Name : "+oneSeniorEmployee.getEmpName());
        System.out.println("Joining Year "+oneSeniorEmployee.getDoj());
        System.out.println("##########################################################################################");


/*        What is the ratio of the male and female employees in Sales Department?
                Here we are filtering the employees based on their department “Sales”
                and Counting the Employee based on the Gender using the GroupBy function.
                The result is collected in Map as Gender for Key and Count as Value.*/

        Map<String, Long> totalCountInSales =
                employeeObjectList.stream()
                        .filter(e -> e.getDepartment()=="Sales")
                        .collect(Collectors.groupingBy(EmployeeObject::getGender, Collectors.counting()));
        System.out.println(totalCountInSales);
        System.out.println("##########################################################################################");

        //Calculate the Average Salary based on the Gender
   /*   we are using collectors to group the employees based on their gender.
        After that using Collectors again to calculate the average of the Salary.
        We are then Storing the result in the Map key to Gender and Salary Average as Value.*/

        Map<String, Double> avgSalaryByGender = employeeObjectList.stream()
                .collect(Collectors.groupingBy(EmployeeObject::getGender, Collectors.averagingDouble(EmployeeObject::getSalary)));
        System.out.println("Average Salary based on the Gender .." +avgSalaryByGender);
        System.out.println("##########################################################################################");

        //List the Name of Employees based on their Department
        Map<String, List<EmployeeObject>> employeeListByDepartment=
                employeeObjectList.stream().collect(Collectors.groupingBy(EmployeeObject::getDepartment));
        System.out.println("---------->" + employeeListByDepartment);
        for (Map.Entry<String, List<EmployeeObject>> entry : employeeListByDepartment.entrySet())  // see if we can simply further
        {
            System.out.println("Department Name is "+entry.getKey());
            List<EmployeeObject> list = entry.getValue();
            for (EmployeeObject e : list)
            {
                System.out.println(e.getEmpName());
            }
        }
        System.out.println("##########################################################################################");

        //Employees who are under 25 years old and those who are over 25 years old should be kept apart.
        Map<Boolean, List<EmployeeObject>> groupByage =
                employeeObjectList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
        for (Map.Entry<Boolean, List<EmployeeObject>> entry : groupByage.entrySet())
        {
            if (entry.getKey())
                System.out.println("Age Greater than 25 years :");
            else
                System.out.println("Age less than or Equal to 25 years :");
            List<EmployeeObject> list = entry.getValue();

            for (EmployeeObject e : list)
            {
                System.out.println(e.getEmpName());
            }
        }
        System.out.println("##########################################################################################");

    }
    
}
