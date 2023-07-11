package collections.sorting;

import collections.sorting.model.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparingExample {
    public static void main(String[] args) {
        sortingListByComparingMethodOfComparator();
        sortingListInReverseByReversedMethodOfComparator();
        sortingListByComparingIntMethodOfComparator();
        sortingListByComparingLongMethodOfComparator();
        sortingListByComparingDoubleMethodOfComparator();
        // String can use normal comparing()
        sortingListUsingComparingThenComparingMethod();
        sortingUsingComparing();

    }

    private static void sortingUsingComparing() {
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

    private static void sortingListUsingComparingThenComparingMethod() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 3000.0, 9922001L));
        employeeList.add(new Employee("Jake", 22, 4000.0, 3924401L));
        employeeList.add(new Employee("Ace", 25, 6000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 3924401L));
        System.out.println("Before sorting using comparing & thenComparing");
        employeeList.forEach(System.out::println);
        Comparator<Employee> employeeComparator = Comparator.comparing(Employee::getAge)
                                                            .thenComparing(Employee::getSalary);
        employeeList.sort(employeeComparator);
        System.out.println("After sorting using age and if they are equal then by salary..");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }


    private static void sortingListByComparingDoubleMethodOfComparator() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting using comparingDouble");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary));//getName will end up in CTE
        System.out.println("After sorting using Salary");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }

    private static void sortingListByComparingLongMethodOfComparator() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting using comparingLong");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparingLong(Employee::getMobile));//getName will end up in CTE
        System.out.println("After sorting using Mobile");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }

    private static void sortingListByComparingIntMethodOfComparator() {
        /* Comparator.comparingInt, which does the same thing as Comparator.comparing,
                but it takes only int selectors. */
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting comparingInt");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparingInt(Employee::getAge));//getName will end up in CTE
        System.out.println("After sorting using Age");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }

    private static void sortingListInReverseByReversedMethodOfComparator() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting");
        employeeList.forEach(System.out::println);
        /*Comparator<Employee> ageComparator = Comparator.comparing(Employee::getAge);
        employeeList.sort(ageComparator.reversed());*/
        employeeList.sort(Comparator.comparing(Employee::getAge).reversed());
        System.out.println("After  sorting in Reverse by Age");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }

    private static void sortingListByComparingMethodOfComparator() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 25, 53000.0, 9922001L));
        employeeList.add(new Employee("Ace", 67, 7000.0, 5924001L));
        employeeList.add(new Employee("Keith", 35, 4000.0, 6924401L));
        System.out.println("Before sorting");
        employeeList.forEach(System.out::println);
        //employeeList.sort(Comparator.comparing(emp-> emp.getName()));
        employeeList.sort(Comparator.comparing(Employee::getName));
        System.out.println("After sorting using name");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparing(Employee::getAge));
        System.out.println("After sorting using Age");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparing(Employee::getSalary));
        System.out.println("After sorting using Salary");
        employeeList.forEach(System.out::println);
        employeeList.sort(Comparator.comparing(Employee::getMobile));
        System.out.println("After sorting using Mobile num");
        employeeList.forEach(System.out::println);
        System.out.println("######################################");
    }
}
