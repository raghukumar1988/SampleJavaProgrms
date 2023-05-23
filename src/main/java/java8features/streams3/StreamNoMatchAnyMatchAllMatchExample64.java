package java8features.streams3;

import java8features.streams3.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamNoMatchAnyMatchAllMatchExample64 {
    public static void main(String[] args) {
        anyMatchByPredicate();
        noneMatchByPredicate(); // works opposite of anyMatch
        allMatchByPredicate();
    }

    private static void allMatchByPredicate() {
        Predicate<Student> predicate1= s->s.getStuName().startsWith("A");
        Predicate<Student> predicate2= s->s.getStuAge()<40;
        Predicate<Student> predicate3 = s->s.getStuAge()<40 && s.getStuName().startsWith("P");
        List<Student> studentList = StreamNoMatchAnyMatchAllMatchExample64.getStudents();
        System.out.println(studentList.stream().allMatch(predicate1));
        System.out.println(studentList.stream().allMatch(predicate2));
        System.out.println(studentList.stream().allMatch(predicate3));

        /* allMatch() method returns false for predicate p1 because there are students
        whose names do not start with “A”.
        allMatch() method returns true for predicate p2 because all students have age less than 40.
        allMatch() method returns false for predicate p3 because details of all the students
        do not statisfy the condition of age <40 and name start with “P”. */
    }

    private static void noneMatchByPredicate() {
        Predicate<Student> predicate1= s->s.getStuName().startsWith("S");
        Predicate<Student> predicate2= s->s.getStuAge()<28 && s.getStuName().startsWith("Z");
        List<Student> studentList = StreamNoMatchAnyMatchAllMatchExample64.getStudents();
        System.out.println(studentList.stream().noneMatch(predicate1));
        System.out.println(studentList.stream().noneMatch(predicate2));
        System.out.println("#######################################");

        /* The first call to the noneMatch() method with predicate p1 as argument returns false
        because there is an element in the stream that matches the condition specified by p1.

        The second call to the noneMatch() method with predicate p2 as argument returns true
        because there is no element in the stream that matches the given conditions. */
    }

    private static void anyMatchByPredicate() {
        Predicate<Student> predicate1 = s->s.getStuName().startsWith("S");
        Predicate<Student> predicate2 = s-> s.getStuAge()<28 && s.getStuName().startsWith("Z");
        List<Student> studentList= StreamNoMatchAnyMatchAllMatchExample64.getStudents();
        System.out.println(studentList.stream().anyMatch(predicate1));
        System.out.println(studentList.stream().anyMatch(predicate2));
        System.out.println("##########################################");

    }

    private static List<Student> getStudents() {
        List<Student> list= new ArrayList<>();
        list.add(new Student(11, 28, "Lucy"));
        list.add(new Student(28, 27, "Kiku"));
        list.add(new Student(32, 30, "Dani"));
        list.add(new Student(49, 27, "Steve"));
        return list;
    }
}
