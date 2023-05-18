package java8features.streams3;

import java8features.streams3.model.Employee1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamArrayListSecondHighestSalaryExample {
    public static void main(String[] args) {
        List<Employee1> employeeList = new ArrayList<>();
        employeeList.add(new Employee1(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee1(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee1(125, "Paul Komal", 25, "Male", "Sales And Marketing", 2019, 13500.0));
        employeeList.add(new Employee1(133, "Martin Theron", 29, "Male", "IT", 2010, 75000.00));
        List<Double> salaryList = employeeList.stream()
                //.distinct()  // adding distinct will apply on Employee object
                .mapToDouble(Employee1::getSalary)
                .boxed()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        salaryList.forEach(System.out::println);
        System.out.println("Second highest Salary is ->" + salaryList.get(salaryList.size()-2));

        // List to Map conversion
        Map.Entry<String, Double> secondLargestSalary = employeeList.stream()
                .collect(Collectors.toMap(Employee1::getName, Employee1::getSalary))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(1);

        System.out.println("Here is second largest Salary --> " + secondLargestSalary);


    }
}
