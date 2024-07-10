package java8features.streams31;


import java8features.streams31.model.EmployeeModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsInterviewPrograms65E {
    public static void main(String[] args) {
        List<EmployeeModel> stubbedProductList = getStubbedProductList();
        getSumOfSalariesWhoAreGreaterThanAge25UsingSumMethod(stubbedProductList);
        getSumOfSalariesWhoAreGreaterThanAge25UsingSummingDouble(stubbedProductList);
        findSecondHighestSalaryInEmployees(stubbedProductList);
    }
    private static void findSecondHighestSalaryInEmployees(List<EmployeeModel> stubbedProductList) {
        List<Double> collect1 = stubbedProductList.stream()
                .sorted(Comparator.comparing(EmployeeModel::getSalary))
                //.distinct()// wont work directly
                .map(EmployeeModel::getSalary)
                .distinct() // uncomment this to behave correctly; checks based in equals() impl
                .collect(Collectors.toList());
        //EmployeeModel employeeModel = collect1.get(collect1.size() - 2);
        //System.out.println(employeeModel.getSalary());
        double salary = collect1.get(collect1.size() - 2);
        System.out.println(salary);
    }
    private static void getSumOfSalariesWhoAreGreaterThanAge25UsingSummingDouble(List<EmployeeModel> stubbedProductList) {
        Double collect = stubbedProductList.stream()
                .filter(emp -> emp.getAge() > 25)
                .collect(Collectors.summingDouble(EmployeeModel::getSalary));
        System.out.println("Printing using summingDouble method of Collectors " + collect);
        System.out.println();
    }

    private static void getSumOfSalariesWhoAreGreaterThanAge25UsingSumMethod(List<EmployeeModel> employeeModelList) {
        double sum = employeeModelList.stream()
                .filter(emp -> emp.getAge() > 25)
                .mapToDouble(EmployeeModel::getSalary)
                .sum();
        System.out.println("Printing using sum method of mapTODouble " + sum);

    }



    private static List<EmployeeModel> getStubbedProductList() { // Utility method
        List<EmployeeModel> productsList = new ArrayList<EmployeeModel>();
        // Adding Products
        productsList.add(new EmployeeModel(1, "Raghu",28, 25000));
        productsList.add(new EmployeeModel(2, "Raja",27, 30000f));
        productsList.add(new EmployeeModel(3, "Ramu",24, 28000f));
        productsList.add(new EmployeeModel(4, "Sonu",27, 28000f));
        productsList.add(new EmployeeModel(6, "Sonu2",29, 90000f));
        productsList.add(new EmployeeModel(5, "Apple Laptop",43, 90000f));
        return productsList;
    }
}
