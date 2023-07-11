package test;

import collections.sorting.model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {


        List<String> strings = Arrays.asList("Raghu", "Zebra", "Sudha", "Basa");
        strings.sort(Comparator.naturalOrder());
        System.out.println(strings);
        strings.sort(Comparator.reverseOrder());
        System.out.println(strings);
        System.out.println();

        List<String> stringNumbers = Arrays.asList("30", "20", "10", "45");
        stringNumbers.sort(Comparator.comparing(Integer::parseInt));
        System.out.println(stringNumbers);

        List<Integer> integers = Arrays.asList(30, 20, 10, 45);
        integers.sort(Comparator.comparingInt(s->s));
        System.out.println(integers);
        System.out.println();



        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new collections.sorting.model.Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new collections.sorting.model.Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println();
        employeeList.forEach(System.out::println);

    }
}
