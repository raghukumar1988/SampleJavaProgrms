package java8features.optional22;

import java8features.CommonUtils;
import java8features.streamPractical32.model.EmployeeObject;

import java.security.InvalidParameterException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OptionalPractical33 {
    public static void main(String[] args) {
        List<EmployeeObject> employeeObjectList = CommonUtils.getStubbedEmployeeList();
        Optional<EmployeeObject> employeeWithMinSalaryAsOptional = employeeObjectList.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase("Development") && emp.getGender().equalsIgnoreCase("Male"))
                .min(Comparator.comparing(EmployeeObject::getAge));
        if (employeeWithMinSalaryAsOptional.isPresent()) {   // old way - Not recommended
            System.out.println("printing using isPresent()---------------------------- ");
            System.out.println(employeeWithMinSalaryAsOptional.get());
        }

        System.out.println("printing using ifPresent(function)----------------------");
        employeeWithMinSalaryAsOptional
                .ifPresent(System.out::println);


        // most useful as per my analysis
        //If a value is present, performs the given action with the value,
        // otherwise performs the given empty-based action.
        System.out.println("Printing using ifPresentOrElse ---------------------------------");
        employeeWithMinSalaryAsOptional
                .ifPresentOrElse(System.out::println, () -> System.out.println("Unable to find matching element"));


        //If a value is present, returns an Optional describing the value,
        // otherwise returns an Optional produced by the supplying function.
        Optional<EmployeeObject> employeeObject = employeeWithMinSalaryAsOptional
                .or(() -> Optional.of(new EmployeeObject(200, "Jeyam", 36, "Male", "Maintenance", 2015, 17000.0)));
        System.out.println("printing employeeObject using or() method ------------------------------ ") ;
        System.out.println(employeeObject);

        //If a value is present, returns the value,
        // otherwise returns other with Generic type T.
        EmployeeObject employeeObject1 = employeeWithMinSalaryAsOptional
                .orElse(new EmployeeObject(200, "Jeyam", 36, "Male", "Maintenance", 2015, 17000.0));
        System.out.println("printing employeeObject using orElse() method ----------------------------- ") ;
        System.out.println(employeeObject1);

        //If a value is present, returns the value,
        // otherwise returns the result produced by the supplying function
        EmployeeObject employeeObject2 = employeeWithMinSalaryAsOptional
                .orElseGet(() -> new EmployeeObject(200, "Jeyam", 36, "Male", "Maintenance", 2015, 17000.0));
        System.out.println("printing employeeObject using orElseGet() method ------------------------------ ") ;
        System.out.println(employeeObject2);

        //If a value is present, returns the value, otherwise throws NoSuchElementException.
        EmployeeObject employeeObject3 = employeeWithMinSalaryAsOptional
                .orElseThrow();
        System.out.println("printing employeeObject using orElseThrow() method ---------------------------") ;
        System.out.println(employeeObject3);

        //If a value is present, returns the value,
        // otherwise throws an exception produced by the exception supplying function.
        //EmployeeObject employeeObject4 = min.orElseThrow(() -> new InvalidParameterException());
        EmployeeObject employeeObject4 = employeeWithMinSalaryAsOptional
                .orElseThrow(InvalidParameterException::new);
        System.out.println("printing employeeObject using orElseThrow(CustException) method -------------------------------") ;
        System.out.println(employeeObject4);
    }
}
