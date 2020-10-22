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
		Collections.sort(al,nameComp);
		al.forEach(country -> System.out.println("After name Sort::" + country.getCountryId() + " " + country.getCountyrName()));
		Collections.sort(al,idCompare);
		al.forEach(country -> System.out.println("After id Sort::" + country.getCountryId() + " " + country.getCountyrName()));
	}
	
	public static Comparator<Country> nameCompare= new Comparator<Country>() {
		public int compare(Country o1, Country o2) {
			return o1.countyrName.compareTo(o2.countyrName);
		}
	};
	
	public static Comparator<Country> idCompare=new Comparator<Country>() {
		public int compare(Country o1, Country o2) {
			return o1.countryId-o2.countryId;
		}
	};
	
	public static Comparator<Country> nameComp=new Comparator<Country>() {
		
		@Override
		public int compare(Country o1, Country o2) {
			return o1.countyrName.compareTo(o2.countyrName);
			// TODO Auto-generated method stub
		}
	}; 

}
