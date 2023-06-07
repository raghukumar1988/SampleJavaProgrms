package collections.sorting;

import collections.sorting.model.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortingByComparatorExample {

    public static void main(String[] args) {
        List<Country> al = new ArrayList<Country>();
        al.add(new Country(23, "India"));
        al.add(new Country(12, "Nepal"));
        al.add(new Country(33, "Singapore"));
        al.add(new Country(24, "Malaysia"));

        al.forEach(county -> System.out.println("before Sort::" + county.getCountryId() + "  " + county.getCountryName()));
        al.sort(nameCompare);
        al.forEach(country -> System.out.println("After name Sort::" + country.getCountryId() + " " + country.getCountryName()));

        al.sort(idCompare);
        al.forEach(country -> System.out.println("After Id Sort::" + country.getCountryId() + " " + country.getCountryName()));

        al.sort(nameComp);
        al.forEach(country -> System.out.println("After name Sort  using Java 8 approach::" + country.getCountryId() + " " + country.getCountryName()));

        Collections.sort(al, new CompareById()); // IMP --> Not recommended, Use list.sort instead
        Collections.sort(al, idCompare); // IMP --> Not recommended, Use list.sort instead
        al.forEach(country -> System.out.println("After id Sort in deprecated way::" + country.getCountryId() + " " + country.getCountryName()));

    }

    //Anonymous Impl
    public static Comparator<Country> idCompare = new Comparator<Country>() {
        public int compare(Country o1, Country o2) {
            //return o1.getCountryId() - o2.getCountryId(); // older way
            return Integer.compare(o1.getCountryId(), o2.getCountryId());
        }
    };

    //Normal implementation RECOMMENDED approach
    public static class CompareById implements Comparator<Country> {
        @Override
        public int compare(Country o1, Country o2) {
            return Integer.compare(o1.getCountryId(), o2.getCountryId());
        }
    }
    // Lambda version of above
    private static Comparator<Country> compareById= (o1,o2)->Integer.compare(o1.getCountryId(),o2.getCountryId());

    // impl  using lambda expression & functional interface
    // String dont have compare method hence using compareTo
    public static Comparator<Country> nameCompare = (o1, o2) -> o1.getCountryName().compareTo(o2.getCountryName());

    //Java 8 approach -- IMP -- No Need to override compareTo method
    //public static Comparator<Country> nameComp = Comparator.comparing(o -> o.getCountryName());
    public static Comparator<Country> nameComp = Comparator.comparing(Country::getCountryName);


    //  TODO - explore variants of thenComparing

}
