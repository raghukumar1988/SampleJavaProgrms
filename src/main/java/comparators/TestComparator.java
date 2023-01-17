package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestComparator {

    public static void main(String[] args) {
        List<Country> al = new ArrayList<Country>();
        al.add(new Country(23, "India"));
        al.add(new Country(12, "Nepal"));
        al.add(new Country(33, "Singapore"));
        al.add(new Country(24, "Malaysia"));
        al.forEach(county -> System.out.println("before Sort::" + county.getCountryId() + "  " + county.getCountyrName()));
        al.sort(nameCompare);
        al.forEach(country -> System.out.println("After name Sort::" + country.getCountryId() + " " + country.getCountyrName()));
        Collections.sort(al, new CompareById());
        al.forEach(country -> System.out.println("After id Sort::" + country.getCountryId() + " " + country.getCountyrName()));

    }

    public static Comparator<Country> idCompare = new Comparator<Country>() { //Anonymous Impl
        public int compare(Country o1, Country o2) {
            return o1.countryId - o2.countryId;
        }
    };
    public static Comparator<Country> nameCompare = (o1, o2) -> o1.countyrName.compareTo(o2.countyrName);// lamda expression for Anonymous Impl


    public static class CompareById implements Comparator<Country> {  //Normal implementation recommended approach
        @Override
        public int compare(Country o1, Country o2) {
            return Integer.compare(o1.getCountryId(), o2.getCountryId());
        }
    }

    /*Java 8 approach*/
    public static Comparator<Country> nameComp= Comparator.comparing(o -> o.countyrName);

    //  Read about Comparator  with mutiple fields

}
