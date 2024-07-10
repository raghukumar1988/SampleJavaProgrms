package java8features.streams31;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHashMapSecondHighestSalaryExample73 {
    public static void main(String[] args) {
        findSecondHighestSalaryAndNamesFromUniqueSalaries();
        findSecondHighestSalaryAndNamesFromDuplicateSalaries();
        findSecondHighestSalaryAloneFromDuplicateSalaries();
    }

    private static void findSecondHighestSalaryAloneFromDuplicateSalaries() {
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
        Integer secondLargestSalary = map2.values()
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .get(1);
        System.out.println(" Printing Second largest Salary alone(not entry)..");
        System.out.println(secondLargestSalary);
    }

    private static void findSecondHighestSalaryAndNamesFromDuplicateSalaries() {
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
        // Observe Reference types carefully
       /* Map<Integer, List<String>> groupedBySalary = map2.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())));*/

        // Observe Reference types carefully
        Map.Entry<Integer,List<String>> entryWithSecondHighestSalary=  map2.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(1);
        System.out.println("Printing Second largest Salary for duplicate records..");
        System.out.println("Note: we first grouping by salary then we sort by key ");
        System.out.println(entryWithSecondHighestSalary);

        /* The Collectors.mapping() function performs a reduction operation on the values associated with the given key
        using the specified collector.
        The groupingBy() collector collects duplicate values into a List, resulting in a MultiMap. */

    }

    private static void findSecondHighestSalaryAndNamesFromUniqueSalaries() {
        Map<String,Integer> map = new HashMap<>();
        map.put("anil",1000);
        map.put("ankit",1200);
        map.put("bhavna",1300);
        map.put("james",1400);
        map.put("micael",1500);
        map.put("tom",1600);
        map.put("daniel",1700);
        Map.Entry<String, Integer> entryWithSecondLargestSalary = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toList())
                .get(1);
        System.out.println("Printing Second largest Salary for unique records..");
        System.out.println(entryWithSecondLargestSalary);
    }
}
